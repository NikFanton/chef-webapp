package ua.training.model.entity.vegetable.group.nuts;

import ua.training.model.entity.vegetable.Vegetable;
import ua.training.model.entity.vegetable.GroupOfVegetables;

public abstract class BaseNuts extends Vegetable {
    public BaseNuts(String name, int calories, double weight) {
        super(name, calories, weight);
    }

    @Override
    public GroupOfVegetables getGroupOfVegetables() {
        return GroupOfVegetables.BEANS;
    }
}
