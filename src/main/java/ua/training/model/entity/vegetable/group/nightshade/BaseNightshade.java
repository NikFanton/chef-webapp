package ua.training.model.entity.vegetable.group.nightshade;

import ua.training.model.entity.vegetable.Vegetable;
import ua.training.model.entity.vegetable.GroupOfVegetables;

public abstract class BaseNightshade extends Vegetable {
    public BaseNightshade(String name, int calories, double weight) {
        super(name, calories, weight);
    }

    @Override
    public GroupOfVegetables getGroupOfVegetables() {
        return GroupOfVegetables.NIGHTSHADE;
    }
}
