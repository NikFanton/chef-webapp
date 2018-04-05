package ua.training.model.builder;

import ua.training.model.entity.vegetable.group.bulbous.BulbOnions;
import ua.training.model.entity.vegetable.group.cabbage.BaseCabbage;
import ua.training.model.entity.vegetable.group.cabbage.WhiteCabbage;
import ua.training.model.entity.vegetable.group.nightshade.BoiledPotatoes;
import ua.training.model.entity.vegetable.group.nuts.Walnut;
import ua.training.model.entity.vegetable.group.roots.Carrot;
import ua.training.model.entity.vegetable.group.salad.Parsley;

public class CezarSaladBuilder extends AbstractSaladBuilder {
    @Override
    public void addAllIngredients() {
        addVegetable(new Carrot(60));
        addVegetable(new BulbOnions(30));
        addVegetable(new Walnut(50));
        addVegetable(new Parsley(20));
        addVegetable(new WhiteCabbage(20));
    }
}
