package ua.training.model.entity.vegetable.group.nuts;

import ua.training.model.entity.vegetable.VegetableDataBase;

public class Peanuts extends BaseNuts {
    public Peanuts(double weight) {
        super(VegetableDataBase.PEANUTS.getName(), VegetableDataBase.PEANUTS.getCaloriesPerHundredGrams(), weight);
    }
}