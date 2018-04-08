package ua.training.model.entity;

public class Vegetable {
    private Long id;
    private String name;
    private int calories;
    private double weight;

    public Vegetable(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public Vegetable(Long id, String name, int calories) {
        this.id = id;
        this.name = name;
        this.calories = calories;
    }

    public Vegetable(String name, int calories, double weight) {
        this.name = name;
        this.calories = calories;
        this.weight = weight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                ", weight=" + weight +
                '}';
    }
}
