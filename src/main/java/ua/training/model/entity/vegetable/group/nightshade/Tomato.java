package ua.training.model.entity.vegetable.group.nightshade;

import ua.training.model.entity.vegetable.VegetableDataBase;

public class Tomato extends BaseNightshade {
    public Tomato(double weight) {
        super(VegetableDataBase.TOMATO.getName(), VegetableDataBase.TOMATO.getCaloriesPerHundredGrams(), weight);
    }
}
