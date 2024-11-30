package homework02;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    private Long id;
    private String description;
    private double price;
    private Integer quantity;


}
