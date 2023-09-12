package Daily.Reminder.Todo.App.controller;

import Daily.Reminder.Todo.App.entity.User;
import Daily.Reminder.Todo.App.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create-user")
    public ResponseEntity<User> createUser(@RequestBody User user){
        userService.createUser(user);
        return new ResponseEntity<User>(user, HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public List<User> getUser() {
        System.out.println("getting users");
        return this.userService.getUsers();
    }
}
