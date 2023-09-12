package Daily.Reminder.Todo.App.repository;

import Daily.Reminder.Todo.App.entity.Todos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends JpaRepository<Todos, Integer> {

}
