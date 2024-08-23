import java.util.List;
import java.util.ArrayList;
public class EmployeeManager implements EmployeeOperations {
    private List<Employee> employes = new ArrayList<>();
    
    public void addEmploye(Employee employe){
        employes.add(employe);
        System.out.println("Un employé ajouté !");
    };

    public void showAllEmployees(){
        System.out.println("-------------Liste des employés :-------------");
        for (Employee employee: employes) {
            employee.afficherDetails();
        }

    };

    public void removeEmploye(int id){
        employes.removeIf(e->e.getId() == id);
        System.out.println("Suppression réussie !");
    };

    public void showEmployeById(int id){
        System.out.println("-------------Employé recherché :-------------");
        for(Employee employee:employes){
            if (employee.getId() == id) {
                employee.afficherDetails();
            }
        }
        System.out.println("Employé avec l'ID "+ id + "non trouvé !");

    };
    
}
