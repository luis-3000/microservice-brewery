package guru.springframework.msscbrewery.web.mappers;


import guru.springframework.msscbrewery.domain.Beer;
import guru.springframework.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by jlc on 6/10/2024
 */
@Mapper
public interface BeerMapper {

    BeerDto beerToBeetDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
