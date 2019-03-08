package com.chrisssanti.tacocloud.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collections;
import java.util.List;

@Data
public class Taco {
    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characteres long")
    private String name;
    @Size(min = 1, message = "You must choose at least one ingredient")
    private List<String> ingredients = Collections.emptyList();
}
