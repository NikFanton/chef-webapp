package ua.training.model.builder;

import ua.training.model.entity.Salad;

public class Director {
    public Salad buildSalad(String saladName) {
        AbstractSaladBuilder builder;
        if (saladName.equals("cezar")) {
            builder = new CezarSaladBuilder();
        } else {
            throw new RuntimeException("Salad " + saladName + " does not exist");
        }
        builder.addAllIngredients();
        return builder.getSalad();
    }
}
