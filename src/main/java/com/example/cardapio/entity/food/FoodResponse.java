package com.example.cardapio.entity.food;

public record FoodResponse(Long id, String title, String image, Integer price) {
  public FoodResponse(Food food) {
      this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
  }
}
