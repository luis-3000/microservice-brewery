package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.UUID;

/**
 * Created by jlc on 5/13/2024
 */
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

//    private final BeerRepository beerRepository;
//    private final BeerMapper beerMapper;

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.PALE_ALE)
                .build();
    }

    @Override
    public BeerDto savedBeerDto(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // @Todo: impl -- would add real implementation to update a beer

    }

    @Override
    public void deleteBeerById(UUID beerId) {
        log.debug("Deleting beer...");
    }

    @Override
    public Object saveNewBeer(Object any) {
        return new Object();
    }
//
//    @Override
//    public BeerDto saveNewBeer(BeerDto beerDto) {
//        return new BeerDto();
//    }

}
