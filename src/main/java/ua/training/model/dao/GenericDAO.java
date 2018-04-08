package ua.training.model.dao;

import java.util.List;

public interface GenericDAO<Type, Key> {
    List<Type> getAll();
    Type getById(Key id);
}
