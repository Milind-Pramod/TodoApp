public class Main {

    public static void main(String[] args) {

        TodoManager manager = new TodoManager();

        manager.addTodo(new Todo(1, "Sleep"));
        manager.addTodo(new Todo(2, "Learn Java"));
        manager.addTodo(new Todo(3, "Build Todo App"));

        manager.completeTodo(2);

        manager.deleteTodo(1);
        manager.showTodos();

    }
}