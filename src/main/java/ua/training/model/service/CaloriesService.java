package ua.training.model.service;

import ua.training.model.entity.vegetable.Vegetable;

import java.util.List;

public class CaloriesProcessor {
    public static double getTotalCalories(List<Vegetable> vegetables) {
        double totalCalories = 0.0;
        for (Vegetable v : vegetables) {
            totalCalories += v.getCalories()/100. * v.getWeight();
        }
        return totalCalories;
    }
}
