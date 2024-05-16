package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by jlc on 5/13/2024
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto savedBeerDtp(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);
}
