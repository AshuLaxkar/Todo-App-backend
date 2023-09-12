package Daily.Reminder.Todo.App.service;

import Daily.Reminder.Todo.App.entity.Todos;

import java.util.List;

public interface TodoService {

    Todos addTodo(Todos todo);
    List<Todos> getAllTodos();

    Todos getTodoByID(int id);

    Todos updateTodo(Todos todo,int id);

    void deleteTodo(int id);
}

