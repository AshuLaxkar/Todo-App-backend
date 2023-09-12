package Daily.Reminder.Todo.App.controller;

import Daily.Reminder.Todo.App.entity.User;
import Daily.Reminder.Todo.App.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeController {
    @Autowired
    private UserService userService;

    //http://localhost:8080/home/users


}
