package ua.training.model.entity.vegetable.group.cabbage;

import ua.training.model.entity.vegetable.VegetableDataBase;

public class WhiteCabbage extends BaseCabbage {
    public WhiteCabbage(double weight) {
        super(VegetableDataBase.WHITE_CABBAGE.getName(), VegetableDataBase.WHITE_CABBAGE.getCaloriesPerHundredGrams(), weight);
    }
}
