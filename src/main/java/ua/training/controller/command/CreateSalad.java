package ua.training.controller.command;

import ua.training.model.dao.VegetableDAO;
import ua.training.model.dao.impl.VegetableDAOImpl;
import ua.training.model.entity.Vegetable;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

public class CreateSalad implements Command {
    private static ResourceBundle bundle = ResourceBundle.getBundle("vegetables", new Locale("en"));

    @Override
    public String execute(HttpServletRequest req) {
        VegetableDAO vegetableDAO = new VegetableDAOImpl();
        List<Vegetable> vegetables = vegetableDAO.getAll();
        for (Vegetable vegetable : vegetables) {
            String name = bundle.getString("vegetable." + vegetable.getName());
            vegetable.setName(name);
        }
        req.setAttribute("vegetables", vegetables);
        return "/view/create-salad.jsp";
    }
}
