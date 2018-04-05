package ua.training.model.entity;

import ua.training.model.entity.vegetable.AbstractVegetable;
import ua.training.model.entity.vegetable.GroupOfVegetables;
import ua.training.model.entity.vegetable.Vegetable;
import ua.training.model.entity.vegetable.VegetableDataBase;

public class Director {
    public static Vegetable getVegetable(VegetableDataBase vegetable, double weight) {
        class NewVegetable extends AbstractVegetable {

            public NewVegetable(String name, double calories, double weight) {
                super(name, calories, weight);
            }

            @Override
            public GroupOfVegetables getGroupOfVegetables() {
                return null;
            }
        }
        return new NewVegetable(vegetable.getName(), vegetable.getCaloriesPerHundredGrams(), weight);
    }
}
