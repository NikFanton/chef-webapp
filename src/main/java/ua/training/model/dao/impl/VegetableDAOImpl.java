package ua.training.model.dao.impl;

import ua.training.model.dao.VegetableDAO;
import ua.training.model.entity.Vegetable;
import ua.training.model.util.ConnectionUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VegetableDAOImpl implements VegetableDAO {
    public static final String SQL_REQUEST_GET_BY_ID = "SELECT * FROM vegetable WHERE id = ";
    public static final String SQL_REQUEST_GET_ALL = "SELECT * FROM vegetable;";

    @Override
    public List<Vegetable> getAll() {
        List<Vegetable> vegetables = new ArrayList<>();
        ResultSet rs = null;
        Statement statement = null;
        try {
            statement = ConnectionUtil.getConnection().createStatement();
            rs = statement.executeQuery(SQL_REQUEST_GET_ALL);
            while (rs.next()) {
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                int calorie = rs.getInt("calorie");
                Vegetable vegetable = new Vegetable(id, name, calorie);
                vegetables.add(vegetable);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.getConnection().close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return vegetables;
    }

    @Override
    public Vegetable getById(Long id) {
        Statement statement = null;
        try {
            statement = ConnectionUtil.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(SQL_REQUEST_GET_BY_ID + id);
            if (rs.first()) {
                Long vegetableId = rs.getLong("id");
                String name = rs.getString("name");
                int calorie = rs.getInt("calorie");
                return new Vegetable(vegetableId, name, calorie);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.getConnection().close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
