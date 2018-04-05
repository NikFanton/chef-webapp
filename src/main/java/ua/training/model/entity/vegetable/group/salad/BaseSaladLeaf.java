package ua.training.model.entity.vegetable.group.salad;

import ua.training.model.entity.vegetable.Vegetable;
import ua.training.model.entity.vegetable.GroupOfVegetables;

public abstract class BaseSaladLeaf extends Vegetable {
    public BaseSaladLeaf(String name, int calories, double weight) {
        super(name, calories, weight);
    }

    @Override
    public GroupOfVegetables getGroupOfVegetables() {
        return GroupOfVegetables.SALAD_LEAF;
    }
}
