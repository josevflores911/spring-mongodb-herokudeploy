package com.mongo.springMongoDB.service;

import com.mongo.springMongoDB.exception.TodoCollectionException;
import com.mongo.springMongoDB.model.TodoDTO;

import java.util.List;

public interface TodoService {

    public List<TodoDTO> getAllTodos();

    public TodoDTO getSingleTodo(String id) throws TodoCollectionException;

    public void createTodo(TodoDTO todo) throws TodoCollectionException;

    public void updateTodo(String id, TodoDTO todo) throws TodoCollectionException;

    public void deleteTodoById(String id) throws TodoCollectionException;

}
