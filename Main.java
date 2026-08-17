import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TodoManager manager = new TodoManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Add Todo");
            System.out.println("2. List Todos");
            System.out.println("3. Complete Todo");
            System.out.println("4. Delete Todo");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                System.out.print("Enter Todo ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Todo title: ");
                String title = scanner.nextLine();

                if (title.trim().isEmpty())
                    System.out.println("Title cannot be empty!");
                else if (id <= 0)
                    System.out.println("Todo ID must be positive!");
                else if (!manager.addTodo(new Todo(id, title)))
                    System.out.println("Todo ID already exists");
                else
                    System.out.println("Todo added successfully");

                manager.addTodo(new Todo(id, title));

            } else if (choice == 2) {

                manager.showTodos();

            } else if (choice == 3) {

                System.out.print("Enter Todo ID to complete: ");
                int id = scanner.nextInt();

                manager.completeTodo(id);

            } else if (choice == 4) {

                System.out.print("Enter Todo ID to delete: ");
                int id = scanner.nextInt();

                manager.deleteTodo(id);

            } else if (choice == 5) {

                System.out.println("Goodbye!");
                break;

            } else {

                System.out.println("Invalid option");
            }
        }

        scanner.close();
    }
}