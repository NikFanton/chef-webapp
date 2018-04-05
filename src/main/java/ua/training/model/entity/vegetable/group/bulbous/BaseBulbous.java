package ua.training.model.entity.vegetable.group.bulbous;

import ua.training.model.entity.vegetable.Vegetable;
import ua.training.model.entity.vegetable.GroupOfVegetables;

public abstract class BaseBulbous extends Vegetable {
    public BaseBulbous(String name, int calories, double weight) {
        super(name, calories, weight);
    }

    @Override
    public GroupOfVegetables getGroupOfVegetables() {
        return GroupOfVegetables.BULBOUS;
    }
}
