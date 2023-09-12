package Daily.Reminder.Todo.App.controller;

import Daily.Reminder.Todo.App.entity.Todos;
import Daily.Reminder.Todo.App.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("api/")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @PostMapping("/todos/add")
    public ResponseEntity<Todos> addTodo(@RequestBody Todos todo){
        Todos todo1 = this.todoService.addTodo(todo);
        return new ResponseEntity<Todos>(todo1, HttpStatus.CREATED);
    }

    @GetMapping("/todos")
    public ResponseEntity<List<Todos>> getAllTodos(){
        List<Todos> todos = this.todoService.getAllTodos();
        return new ResponseEntity<List<Todos>>(todos,HttpStatus.OK);
    }

    @GetMapping("/todos/{id}")
    public ResponseEntity<Todos> getTodoByID(@PathVariable int id){
       Todos todo =  this.todoService.getTodoByID(id);
       return new ResponseEntity<Todos>(todo,HttpStatus.OK);
    }

    @PutMapping("/todos/{id}")
    public ResponseEntity<Todos>  updateTodo(@PathVariable int id, @RequestBody Todos updatedTodo){
         Todos todo = this.todoService.updateTodo(updatedTodo,id);
         return new ResponseEntity<Todos>(todo,HttpStatus.CREATED);
    }

    @DeleteMapping("/todos/{id}")
    public ResponseEntity<HttpStatus> deleteTodo(@PathVariable int id ){
        this.todoService.deleteTodo(id);

        return  ResponseEntity.ok(HttpStatus.OK);
    }
}
