package ua.training.model.entity.vegetable.group.nightshade;

import ua.training.model.entity.vegetable.VegetableDataBase;

public class BoiledPotatoes extends BaseNightshade {
    public BoiledPotatoes(double weight) {
        super(VegetableDataBase.BOILED_POTATOES.getName(),
                VegetableDataBase.BOILED_POTATOES.getCaloriesPerHundredGrams(), weight);
    }
}
