package ua.training.model.service;

import ua.training.model.entity.vegetable.Vegetable;

import java.util.ArrayList;
import java.util.List;

public class CaloriesService {
    public static int getTotalCalories(List<Vegetable> vegetables) {
        int totalCalories = 0;
        for (Vegetable v : vegetables) {
            totalCalories += calcCalories(v);
        }
        return totalCalories;
    }

    public static List<Vegetable> getVegetablesWithCaloriesInDiapason(List<Vegetable> vegetables, int min, int max) {
        List<Vegetable> result = new ArrayList<>();
        int calories = 0;
        for (Vegetable v : vegetables) {
            calories = calcCalories(v);
            if (calories >= min && calories <= max) {
                result.add(v);
            }
        }
        return vegetables;
    }

    private static int calcCalories(Vegetable v) {
        return (int) (v.getCalories()/100. * v.getWeight());
    }
}
