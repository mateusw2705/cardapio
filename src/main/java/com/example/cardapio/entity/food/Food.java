package com.example.cardapio.entity.food;

import jakarta.persistence.*;
import lombok.*;

@Table(name="foods")
@Entity(name = "foods")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String image;
    private Integer price;

    public Food(FoodCreateRequest data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }
}
