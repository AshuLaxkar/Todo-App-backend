package Daily.Reminder.Todo.App.service.impl;

import Daily.Reminder.Todo.App.entity.Todos;
import Daily.Reminder.Todo.App.repository.TodoRepo;
import Daily.Reminder.Todo.App.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoRepo todoRepo;

    @Override
    public Todos addTodo(Todos todo) {
        return this.todoRepo.save(todo);
    }

    @Override
    public List<Todos> getAllTodos() {
        return this.todoRepo.findAll();
    }

    @Override
    public Todos getTodoByID(int id) {
      Optional<Todos> todo = this.todoRepo.findById(id);
      if(todo.isPresent()){
          return todo.get();
      }else {
          return null;
      }
    }

    @Override
    public Todos updateTodo(Todos updatedTodo, int id) {
        Todos todo = this.todoRepo.findById(id).orElse(null);

            if(todo != null){
            todo.setTitle(updatedTodo.getTitle());
            todo.setDescription(updatedTodo.getDescription());
            todo.setDueDate(updatedTodo.getDueDate());
            todo.setCompleted(updatedTodo.isCompleted());

            return this.todoRepo.save(todo);
        }else {
            return null;
        }
    }

    @Override
    public void deleteTodo(int id) {
    this.todoRepo.deleteById(id);
    }
}
