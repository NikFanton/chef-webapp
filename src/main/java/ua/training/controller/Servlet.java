package ua.training.controller;

import ua.training.controller.command.Command;
import ua.training.controller.command.CreateSalad;
import ua.training.controller.command.ViewSalad;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Servlet extends HttpServlet {
    private Map<String, Command> commandMap = new HashMap<>();

    @Override
    public void init() {
        commandMap.put("create-salad", new CreateSalad());
        commandMap.put("create-salad/preview", new ViewSalad());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getRequestURI();
        System.out.println(path);
        path = path.replaceAll(".*/chef-webapp/", "");
        System.out.println(path);
        Command command = commandMap.getOrDefault(path, r -> "/index.jsp");
        String pagePath = command.execute(req);
        req.getRequestDispatcher(pagePath).forward(req, resp);
    }
}
