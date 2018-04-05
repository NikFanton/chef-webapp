package ua.training.model.entity.vegetable.group.nuts;

import ua.training.model.entity.vegetable.VegetableDataBase;

public class Almond extends BaseNuts {
    public Almond(double weight) {
        super(VegetableDataBase.ALMOND.getName(), VegetableDataBase.ALMOND.getCaloriesPerHundredGrams(), weight);
    }
}
