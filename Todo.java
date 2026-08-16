public class Todo {

    int id;
    String title;
    boolean completed;

    public Todo() {
        // Constructor
    }

    public Todo(int id, String title) {
        this.id = id;
        this.title = title;
        this.completed = false;
    }
}
