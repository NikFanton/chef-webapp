package ua.training.model.entity.vegetable.group.salad;

import ua.training.model.entity.vegetable.VegetableDataBase;

public class Parsley extends BaseSaladLeaf {
    public Parsley(double weight) {
        super(VegetableDataBase.PARSLEY.getName(), VegetableDataBase.PARSLEY.getCaloriesPerHundredGrams(), weight);
    }
}
