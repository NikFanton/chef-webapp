package ua.training.model.entity;

import ua.training.model.entity.vegetable.IVegetable;

import java.util.ArrayList;
import java.util.List;

public class Salad {
    private List<IVegetable> vegetables;

    public Salad() {
        this.vegetables = new ArrayList<>();
    }

    public List<IVegetable> getVegetables() {
        return vegetables;
    }

    public void setVegetables(List<IVegetable> vegetables) {
        this.vegetables = vegetables;
    }

    @Override
    public String toString() {
        return "Salad{" +
                "vegetables=" + vegetables +
                '}';
    }
}
