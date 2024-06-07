package com.example.cardapio.repository.Interfaces.Foods;

import com.example.cardapio.entity.food.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Long> {
}
