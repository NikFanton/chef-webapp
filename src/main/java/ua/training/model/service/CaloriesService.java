package ua.training.model.service;

import ua.training.model.entity.Vegetable;

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

    private static int calcCalories(Vegetable v) {
        return (int) (v.getCalories()/100. * v.getWeight());
    }
}
