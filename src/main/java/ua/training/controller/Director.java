package ua.training.controller;

import ua.training.model.entity.vegetable.Vegetable;
import ua.training.model.entity.vegetable.GroupOfVegetables;
import ua.training.model.entity.vegetable.IVegetable;
import ua.training.model.entity.vegetable.VegetableDataBase;

public class Director {
    public static IVegetable getVegetable(VegetableDataBase vegetable, double weight) {
        class NewVegetable extends Vegetable {
            private NewVegetable(String name, int calories, double weight) {
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
