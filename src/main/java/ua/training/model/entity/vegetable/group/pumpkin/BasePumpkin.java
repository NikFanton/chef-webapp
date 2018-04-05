package ua.training.model.entity.vegetable.group.pumpkin;

import ua.training.model.entity.vegetable.Vegetable;
import ua.training.model.entity.vegetable.GroupOfVegetables;

public abstract class BasePumpkin extends Vegetable {
    public BasePumpkin(String name, int calories, double weight) {
        super(name, calories, weight);
    }

    @Override
    public GroupOfVegetables getGroupOfVegetables() {
        return GroupOfVegetables.PUMPKIN;
    }
}
