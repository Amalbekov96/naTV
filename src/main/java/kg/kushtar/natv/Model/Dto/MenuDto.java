package kg.kushtar.natv.Model.Dto;

import kg.kushtar.natv.Model.Discounts;
import kg.kushtar.natv.Model.Prices;
import lombok.Data;

import java.util.List;
@Data
public class MenuDto {
    private Long id;
    private String name;
    private String image;
    private PricesDto price;
    private List<DiscountsDto> discounts;

    public MenuDto() {
    }

    public MenuDto(Long id, String name, String image, PricesDto price, List<DiscountsDto> discounts) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.discounts = discounts;
    }
}
