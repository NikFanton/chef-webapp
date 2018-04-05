package ua.training.model.entity;

import ua.training.model.entity.vegetable.Vegetable;

import java.util.List;

public class Salad {
    private List<Vegetable> ingredients;

    public List<Vegetable> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Vegetable> ingredients) {
        this.ingredients = ingredients;
    }
}
