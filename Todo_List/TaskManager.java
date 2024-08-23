import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager implements TaskOperations {
    List<Task> taskList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void addTask(Task task) {
        taskList.add(task);
    }

    @Override
    public void removeTask(int id) {
        taskList.removeIf(task->task.id == id);
    }

    @Override
    public void showAllTasks() {
        for (Task task : taskList) {
            System.out.println("--------Liste des Tâches--------");
            System.out.println(task);
        }
    }


    @Override
    public void showTaskById(int id) {
        for (Task task : taskList) {
            System.out.println("--------Tâche recherché !--------");
            if (task.getId()== id) {
                System.out.println(task);
            }
        }
    }

    @Override
    public void modifyTask(int id) {
        for (Task task : taskList) {
            System.out.println("--------Tâche recherché !--------");
            if (task.getId()== id) {
                System.out.println(task);
                String newTitle = scanner.nextLine();
                task.setTitle(newTitle);
                boolean status = scanner.nextBoolean();
                task.setStatus(status);
            }
        }
    }


    
   

    
}
