import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<Employes> employesList = new ArrayList<Employes>(5);
        int ID = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nom de l'employé: ");
        String employeName = sc.nextLine();

        System.out.println("Entrez le poste de l'employé: ");
        String employePost = sc.nextLine();

        System.out.println("Entrez le salaire de l'employé: ");
        int employeSal = sc.nextInt();
        sc.close();

        Employes employee = new Employes(ID++, employeName, employePost, employeSal);
        employesList.add(employee);

        for (Employes em : employesList) {
            System.out.println(em);
            
        }

        System.out.println( "ID:" + ID);
        System.out.println( "Name: " + employee.name);
        System.out.println( "Poste: " + employee.post);
        System.out.println( "Salaire: " + employee.salaire);
        
    }

}
