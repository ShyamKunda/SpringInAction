package com.example.demo.taco.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
public class Taco {

    private Long id;
    @NotNull
    @Size(min = 5, message = "Name must be atleast 5 characters long")
    private String name;
    @Size(min = 1, message = "You must choose atlease 1 ingredient")
    private List<Ingredient> ingredients;

    private Date createdAt;

}
