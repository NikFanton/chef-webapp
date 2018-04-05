package ua.training.controller.command;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import ua.training.model.entity.vegetable.Vegetable;
import ua.training.model.entity.vegetable.VegetableDataBase;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

public class CreateSalad implements Command {
    private static ResourceBundle bundle = ResourceBundle.getBundle("vegetables", new Locale("ru"));

    @Override
    public String execute(HttpServletRequest req) {
        List<Vegetable> vegetables = new ArrayList<>();
        List<VegetableDataBase> vegetablesFromDB = Arrays.asList(VegetableDataBase.values());
        for (VegetableDataBase vegetable : vegetablesFromDB) {
            String name = bundle.getString("vegetable." + vegetable.getName());
            vegetables.add(new Vegetable(name, vegetable.getCaloriesPerHundredGrams(), 0));
        }
        req.setAttribute("vegetables", vegetables);
        return "/view/create-salad.jsp";
    }
}
