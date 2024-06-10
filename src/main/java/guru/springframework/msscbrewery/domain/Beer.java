package guru.springframework.msscbrewery.domain;

import guru.springframework.msscbrewery.web.model.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by jlc on 6/10/2024
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {


    private UUID id;

    private String beerName;

    private BeerStyleEnum beerStyle;

    private Long upc;
}
