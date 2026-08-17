import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class TodoManager {

    private List<Todo> todos = new ArrayList<>();

    public boolean addTodo(Todo todo) {

        if (todo.id <= 0)
            return false;

        if (todoIdExists(todo.id))
            return false;

        todos.add(todo);
        return true;
    }

    public void showTodos() {
        for (Todo todo : todos) {
            System.out.println(todo.id + " - " + todo.title + " - " + todo.completed);
        }
    }

    public void completeTodo(int id) {

        for (Todo todo : todos) {
            if (todo.id == id) {
                todo.completed = true;
                return;
            }
        }

        System.out.println("Todo not found");
    }

    public void deleteTodo(int id) {

        Iterator<Todo> iterator = todos.iterator();

        while (iterator.hasNext()) {
            Todo todo = iterator.next();

            if (todo.id == id) {
                iterator.remove();
                return;
            }
        }

        System.out.println("Todo not found");
    }

    public boolean todoIdExists(int id) {
        for (Todo todo : todos) {
            if (todo.id == id)
                return true;
        }
        return false;
    }
}