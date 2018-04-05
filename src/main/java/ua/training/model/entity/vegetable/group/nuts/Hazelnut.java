package ua.training.model.entity.vegetable.group.nuts;

import ua.training.model.entity.vegetable.VegetableDataBase;

public class Hazelnut extends BaseNuts {
    public Hazelnut(double weight) {
        super(VegetableDataBase.HAZELNUT.getName(), VegetableDataBase.HAZELNUT.getCaloriesPerHundredGrams(), weight);
    }
}
