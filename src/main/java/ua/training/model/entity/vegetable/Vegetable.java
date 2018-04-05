package ua.training.model.entity.vegetable;

public class Vegetable implements IVegetable {
    private String name;
    // TODO cast calories to int
    private int calories;
    private double weight;

    public Vegetable(String name, int calories, double weight) {
        this.name = name;
        this.calories = calories;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", weight=" + weight +
                '}';
    }

    @Override
    public GroupOfVegetables getGroupOfVegetables() {
        return null;
    }
}
