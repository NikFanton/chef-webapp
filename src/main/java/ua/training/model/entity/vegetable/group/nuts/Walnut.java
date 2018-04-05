package ua.training.model.entity.vegetable.group.nuts;

import ua.training.model.entity.vegetable.VegetableDataBase;

public class Walnut extends BaseNuts {
    public Walnut(double weight) {
        super(VegetableDataBase.WALNUT.getName(), VegetableDataBase.WALNUT.getCaloriesPerHundredGrams(), weight);
    }
}
