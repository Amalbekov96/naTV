package kg.kushtar.natv.Model.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class PostChannelsDto {
    private Long id;
    private String Name;
    private double price;
    @JsonFormat(pattern="yyyy-MM-dd")
    private List<LocalDate> days;
}
