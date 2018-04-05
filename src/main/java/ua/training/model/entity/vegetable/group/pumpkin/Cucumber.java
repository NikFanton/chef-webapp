package ua.training.model.entity.vegetable.group.pumpkin;

import ua.training.model.entity.vegetable.VegetableDataBase;

public class Cucumber extends BasePumpkin {
    public Cucumber(double weight) {
        super(VegetableDataBase.CUCUMBER.getName(), VegetableDataBase.CUCUMBER.getCaloriesPerHundredGrams(), weight);
    }
}
