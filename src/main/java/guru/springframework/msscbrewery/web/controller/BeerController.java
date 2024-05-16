package guru.springframework.msscbrewery.web.controller;

import guru.springframework.msscbrewery.services.BeerService;
import guru.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by jlc on 5/13/2024
 */
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){

        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping() // POST - create a new beer
    public ResponseEntity handlePost(BeerDto beerDto) {

        BeerDto savedBeetDto = beerService.savedBeerDtp(beerDto);

        HttpHeaders httpHeaders = new HttpHeaders();
        // @Todo: add a host name to url
        httpHeaders.add("Location", "http://localhost:8080/api/v1/beer/" + savedBeetDto.getId().toString());
        return  new ResponseEntity(httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping({"/{beedId}"})
    public ResponseEntity handlePut(@PathVariable("beedId") UUID beerId, BeerDto beerDto) {
        beerService.updateBeer(beerId, beerDto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}