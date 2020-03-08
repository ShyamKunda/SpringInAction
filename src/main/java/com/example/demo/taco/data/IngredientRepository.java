package com.example.demo.taco.data;

import com.example.demo.taco.model.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);

}
