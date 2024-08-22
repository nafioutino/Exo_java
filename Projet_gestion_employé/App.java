import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    ArrayList<Employes> employesList = new ArrayList<Employes>(15);
    // methode pour ajouter un employé
    public void addEmploye(Employes employe) {
        employesList.add(employe);
    }

    // methode pour afficher tous les employés
    public void showAllEmployees() {
        
        for (Employes employee : employesList) {
            System.out.println(employee);
        }
    }

    // methode pour supprimer un employé
    public void removeEmploye(int id) {
        employesList.removeIf(e -> e.getId() == id);
        System.out.println(" Employé supprimé avec succès ! ");
    }

    // methode pour afficher un employé par son id
    public void showEmployeById(int id) {
        for (Employes employe : employesList) {
            if (employe.getId() == id) {
                System.out.println(employe);
                return;
            }
        }
        System.out.println("Employé avec ID " + id + " non trouvé.");
    }

    public static void main(String[] args) {
        App gestion = new App();
        Scanner sc = new Scanner(System.in);
        

        System.out.println("---------------Bienvenue sur notre plateforme de gestion d'employés ! ---------------");

        System.out.println(" Veuillez choisir une option: ");
        while (true) {
            System.out.println("Que voulez-vous faire sur un employé ?");
            System.out.println("1. Ajouter un employé");
            System.out.println("2. Supprimer un employé par ID");
            System.out.println("3. Afficher tous les employés");
            System.out.println("4. Afficher un employé par ID");
            System.out.println("5. Quitter");
            System.out.print("Choix : ");
            int choix = sc.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Combien d'employés voulez vous ajouter ?: ");
                    int employeNum = sc.nextInt();
                    int i = 1;
                    while (i <= employeNum) {

                        System.out.println("Entrez l'ID de l'employé " + i + ": ");
                        int employeID = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Entrez le nom de l'employé " + i + ": ");
                        String employeName = sc.nextLine();

                        System.out.println("Entrez le poste de l'employé " + i + ": ");
                        String employePost = sc.nextLine();

                        System.out.println("Entrez le salaire de l'employé " + i + ": ");
                        double employeSalaire = sc.nextDouble();
                        System.out.println("Employé "+ i + " ajouté !");

                        Employes employee = new Employes(employeID, employeName, employePost, employeSalaire);
                        gestion.addEmploye(employee);
                        i++;
                    }
                    break;

                case 2:
                    System.out.println("Entrer l'ID de l'employé à supprimer: ");
                    int idAsupprimer = sc.nextInt();
                    gestion.removeEmploye(idAsupprimer);
                    break;
                case 3:
                    if (gestion.employesList.size() == 0) {
                        System.out.println("Aucun employé trouvé !, Merci d'en ajouter");
                    }
                    System.out.println("------------Liste des employés-------------");
                    gestion.showAllEmployees();
                    break;
                case 4:
                    System.out.println("Entrer l'ID de l'employé à afficher: ");
                    int idAafficher = sc.nextInt();
                    gestion.showEmployeById(idAafficher);
                    break;
                case 5:
                    System.out.println("Au revoir , Merci pour votre fidélité !");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Choix invalid !");
                    break;
            }

        }

    }

}
