import java.util.ArrayList;
import java.util.List;

public class EmployeeManager implements EmployeeOperations {
    private List<Employee> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employee employe) {
        employes.add(employe);
    }

    @Override
    public void supprimerEmploye(int id) {
        employes.removeIf(e -> e.getId() == id);
    }

    @Override
    public void afficherTousLesEmployes() {
        for (Employee employe : employes) {
            employe.afficherDetails();
        }
    }

    @Override
    public void afficherEmployeParId(int id) {
        for (Employee employe : employes) {
            if (employe.getId() == id) {
                employe.afficherDetails();
                return;
            }
        }
        System.out.println("Employé avec ID " + id + " non trouvé.");
    }
}
