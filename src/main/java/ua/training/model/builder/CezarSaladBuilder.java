package ua.training.model.entity.builder;

import ua.training.model.entity.vegetable.group.nightshade.BoiledPotatoes;
import ua.training.model.entity.vegetable.group.roots.Carrot;

public class CezarSaladBuilder extends AbstractSaladBuilder {
    @Override
    public void buildSalad() {
         addVegetable(new BoiledPotatoes(100))
                .addVegetable(new Carrot(30));
    }
}
