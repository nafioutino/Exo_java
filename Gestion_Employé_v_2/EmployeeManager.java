import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager implements EmployeeOperations {
    private List<Employee> employes = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addEmploye(Employee employe) {
        employes.add(employe);
        System.out.println("Un employé ajouté !");
    };

    public void showAllEmployees() {
        System.out.println("-------------Liste des employés :-------------");
        if (employes.size() == 0) {
            System.out.println("Aucun employé trouvé !");

        }
        for (Employee employee : employes) {
            employee.afficherDetails();
        }

    };

    public void removeEmploye(int id) {
        employes.removeIf(e -> e.getId() == id);
        System.out.println("Suppression réussie !");
    };

    public void showEmployeById(int id) {
        System.out.println("-------------Employé recherché :-------------");
        for (Employee employee : employes) {
            if (employee.getId() == id) {
                employee.afficherDetails();
            }
        }
        System.out.println("Employé avec l'ID " + id + "non trouvé !");

    };

    public void updateEmployee(int id ) {
        for (Employee employee : employes) {
            if (employee.getId() == id) {
                System.out.println("Vous voulez l'employé :");
                employee.afficherDetails();
                System.out.println("Etrez le nouveau nom: ");
                String newName = scanner.nextLine();
                employee.setNom(newName);
            }

        }

    }
}
