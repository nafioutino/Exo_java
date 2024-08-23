import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création de l'instance EmployeeManager pour gérer les employés
        EmployeeManager employeeManager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            // Affichage du menu
            System.out.println("\n--- Menu de Gestion des Employés ---");
            System.out.println("1. Ajouter un employé");
            System.out.println("2. Supprimer un employé par ID");
            System.out.println("3. Afficher tous les employés");
            System.out.println("4. Afficher les détails d'un employé par ID");
            System.out.println("5. Modifier un employé par ID");
            System.out.println("6. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    // Ajouter un employé
                    System.out.print("Entrez l'ID : ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Entrez le nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez le poste (Manager ou Developer) : ");
                    String poste = scanner.nextLine();
                    while (!poste.equals("Manager")&&!poste.equals("Developer")) {
                        System.out.print("Le poste doit être Manager ou Developer : ");
                        poste = scanner.nextLine();
                    }
                    System.out.print("Entrez le salaire : ");
                    double salaire = scanner.nextDouble();
                    if (poste.equals("Manager")) {
                        System.out.print("Entrez le nombre de personnes sous responsabilité : ");
                        int nombrePersonnes = scanner.nextInt();
                        employeeManager.addEmploye(new Manager(id, nom, poste, salaire, nombrePersonnes));
                    } else if (poste.equals("Developer")) {
                        System.out.print("Entrez le langage de spécialisation : ");
                        scanner.nextLine(); 
                        String langage = scanner.nextLine();
                        employeeManager.addEmploye(new Developer(id, nom, poste, salaire, langage));
                    } else {
                        System.out.println("Poste non reconnu. L'employé n'a pas été ajouté.");
                    }
                    break;

                case 2:
                    // Supprimer un employé
                    System.out.print("Entrez l'ID de l'employé à supprimer : ");
                    int idSuppression = scanner.nextInt();
                    employeeManager.removeEmploye(idSuppression);
                    break;

                case 3:
                    // Afficher tous les employés

                    employeeManager.showAllEmployees();
                    break;

                case 4:
                    // Afficher les détails d'un employé spécifique
                    System.out.print("Entrez l'ID de l'employé à afficher : ");
                    int idAffichage = scanner.nextInt();
                    employeeManager.showEmployeById(idAffichage);
                    break;
                case 5:
                // Modifier un employé
                System.out.print("Entrez l'ID de l'employé à modifier : ");
                int idModification = scanner.nextInt();
                employeeManager.updateEmployee(idModification);

                break;
                case 6:
                    // Quitter le programme
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix non valide. Veuillez réessayer.");
                    break;
            }
        } while (choix != 6);

        scanner.close();
    }
}