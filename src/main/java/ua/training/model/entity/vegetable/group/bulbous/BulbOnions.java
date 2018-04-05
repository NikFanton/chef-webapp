package ua.training.model.entity.vegetable.group.bulbous;

import ua.training.model.entity.vegetable.VegetableDataBase;

public class BulbOnions extends BaseBulbous {
    public BulbOnions(double weight) {
        super(VegetableDataBase.BULB_ONIONS.getName(), VegetableDataBase.BULB_ONIONS.getCaloriesPerHundredGrams(), weight);
    }
}
