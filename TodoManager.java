import java.util.ArrayList;
import java.util.List;

public class TodoManager {

    private List<Todo> todos = new ArrayList<>();

    public void addTodo(Todo todo) {
        todos.add(todo);
    }

    public void showTodos() {
        for (Todo todo : todos) {
            System.out.println(
                    todo.id + " - " +
                            todo.title + " - " +
                            todo.completed);
        }
    }
}