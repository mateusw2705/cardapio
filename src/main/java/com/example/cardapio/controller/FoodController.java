package com.example.cardapio.controller;

import com.example.cardapio.entity.food.Food;
import com.example.cardapio.entity.food.FoodCreateRequest;
import com.example.cardapio.entity.food.FoodResponse;
import com.example.cardapio.repository.Interfaces.Foods.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public ResponseEntity<?> saveFood(@RequestBody FoodCreateRequest data){
        Food foodData = new Food(data);
        foodRepository.save(foodData);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public FoodResponse getFoodById(@PathVariable Long id) {
        Optional<Food> food = foodRepository.findById(id);
        if (food.isPresent()) {
            return new FoodResponse(food.get());
        } else {
            throw new RuntimeException("Food not found with id: " + id);
        }
    }

    @GetMapping
    public List<FoodResponse> getAll(){
        return foodRepository.findAll().stream().map(FoodResponse::new).toList();
    }
}
