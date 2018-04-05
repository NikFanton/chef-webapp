package ua.training.controller.command;

import ua.training.model.entity.vegetable.Vegetable;
import ua.training.model.entity.vegetable.VegetableDataBase;
import ua.training.model.service.CaloriesService;

import javax.servlet.http.HttpServletRequest;
import java.util.*;
import java.util.regex.Pattern;


public class ViewSalad implements Command {
    private static ResourceBundle bundle = ResourceBundle.getBundle("vegetables", new Locale("ru"));

    @Override
    public String execute(HttpServletRequest req) {
        List<Vegetable> vegetables = getAllVegetablesInSalad(req);
        sortVegetables(req, vegetables);
        int totalCalories = CaloriesService.getTotalCalories(vegetables);
        req.setAttribute("vegetables", vegetables);
        req.setAttribute("calories", totalCalories);
        return "/view/show-salad.jsp";
    }

    private void sortVegetables(HttpServletRequest req, List<Vegetable> vegetables) {
        String sortByParameter = req.getParameterMap().getOrDefault("sortBy", new String[]{"name"})[0];
        if (sortByParameter.equals("name")) {
            vegetables.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        } else if (sortByParameter.equals("calories")) {
            vegetables.sort(Comparator.comparingInt(Vegetable::getCalories));
        } else if (sortByParameter.equals("weight")) {
            vegetables.sort(Comparator.comparingDouble(Vegetable::getWeight));
        }
    }

    private List<Vegetable> getAllVegetablesInSalad(HttpServletRequest req) {
        List<Vegetable> vegetables = new ArrayList<>();
        Pattern pattern = Pattern.compile("w([0-9]+)");
        for (String key : req.getParameterMap().keySet()) {
            if (pattern.matcher(key).matches() && !req.getParameterMap().get(key)[0].equals("")) {
                // TODO Instead of buildVegetable() create method in DAO getById()
                Vegetable newVegetable = buildVegetable(req, key);
                vegetables.add(newVegetable);
            }
        }
        return vegetables;
    }

    private Vegetable buildVegetable(HttpServletRequest req, String key) {
        Double weight = Double.parseDouble(req.getParameterMap().get(key)[0]);
        int index = Integer.parseInt(key.replace("w", ""));
        VegetableDataBase vegetableInfo = VegetableDataBase.values()[index];
        String name = bundle.getString("vegetable." + vegetableInfo.getName());
        System.out.println(name);
        return new Vegetable(name, vegetableInfo.getCaloriesPerHundredGrams(), weight);
    }
}
