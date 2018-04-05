package ua.training.model.entity.vegetable.group.roots;

import ua.training.model.entity.vegetable.VegetableDataBase;

public class Carrot extends BaseRoots {
    public Carrot(double weight) {
        super(VegetableDataBase.CARROT.getName(), VegetableDataBase.CARROT.getCaloriesPerHundredGrams(), weight);
    }
}
