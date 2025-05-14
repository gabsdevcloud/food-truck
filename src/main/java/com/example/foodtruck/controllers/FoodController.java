package com.example.foodtruck.controllers;


import com.example.foodtruck.models.Food;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/menu")
public class FoodController {

    List<Food> foods = new ArrayList<Food>();

    @GetMapping("/food")
    public List<Food> getYourFood() {
        return foods;
    }

    @PostMapping("/create")
    public String setYourFood(@RequestBody Food yourFood) {
        foods.add(yourFood);
        return "Everything Okay";
    }
}
