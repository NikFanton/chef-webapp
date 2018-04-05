package ua.training.model.builder;

import ua.training.model.entity.Salad;
import ua.training.model.entity.vegetable.IVegetable;

public abstract class AbstractSaladBuilder {
    public Salad salad;

    public AbstractSaladBuilder() {
        this.salad = new Salad();
    }

    public Salad getSalad() {
        return salad;
    }

    protected void addVegetable(IVegetable vegetable) {
        salad.getVegetables().add(vegetable);
    }

    public abstract void addAllIngredients();
}
