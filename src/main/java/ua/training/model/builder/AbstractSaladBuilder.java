package ua.training.model.entity.builder;

import ua.training.model.entity.Salad;
import ua.training.model.entity.vegetable.Vegetable;

public abstract class AbstractSaladBuilder {
    public Salad salad;

    public AbstractSaladBuilder() {
        this.salad = new Salad();
    }

    public Salad getSalad() {
        return salad;
    }

    public AbstractSaladBuilder addVegetable(Vegetable vegetable) {
        salad.getVegetables().add(vegetable);
        return this;
    }

    public abstract void buildSalad();
}
