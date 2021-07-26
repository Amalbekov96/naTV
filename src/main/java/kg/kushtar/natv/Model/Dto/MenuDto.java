package kg.kushtar.natv.Model.Dto;

import kg.kushtar.natv.Model.Discounts;
import kg.kushtar.natv.Model.Prices;

import java.util.List;

public class MenuDto {
    private Long id;
    private String image;
    private Prices price;
    private List<Discounts> discounts;
}
