import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Entrez l'ID de la tâche : ");
        int id = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Entrez le titre de la tâche : ");
        String title = scanner.nextLine();

        Task task = new Task(id, title);


        manager.addTask(task);
        manager.showAllTasks();
        // manager.removeTask(1);
    
    }

}
