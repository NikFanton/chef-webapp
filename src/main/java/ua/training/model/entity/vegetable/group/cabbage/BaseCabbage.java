package ua.training.model.entity.vegetable.group.cabbage;

import ua.training.model.entity.vegetable.Vegetable;
import ua.training.model.entity.vegetable.GroupOfVegetables;

public abstract class BaseCabbage extends Vegetable {
    public BaseCabbage(String name, int calories, double weight) {
        super(name, calories, weight);
    }

    @Override
    public GroupOfVegetables getGroupOfVegetables() {
        return GroupOfVegetables.CABBAGES;
    }
}
