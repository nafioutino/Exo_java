import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Array {
    public static void main(String[] args) {

        String[] code; // Déclaration d'une variable
        char[] alphabet;
        String[] fruits = new String[5]; // Declaration et definition de la taille
        int[] number1 = { 15, 4, 5, 3, 25 }; // Initialisation d'un tableau de nombre
        byte[] number2 = { 1, 2, 23, 5, 4 };
        number2[1] = 20;

        fruits[0] = "ananas";
        fruits[1] = "orange";
        fruits[2] = "pomme";
        fruits[3] = "banane";
        fruits[4] = "papaye";

        System.out.println("----------liste des fruits--------------");
        for (String fruit : fruits) {
            System.out.println(fruit);

        }
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("L'element à l'indice " + i + " est: " + fruits[i]);

        }

        System.out.println("----------Affichage littéral de fruits--------------");

        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

        // Exo1
        System.out.println("----------Exo1-------------");


        int[] number = { 15, 4, 5, 3, 25 };
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        // Exo2
        System.out.println("----------Exo2-------------");


        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                continue;
            }
            System.out.println(number[i]);

        }

        // exo 3
        System.out.println("----------Exo3-------------");


        int min = 100;
        int max = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];

            }
            if (number[i] > max) {
                max = number[i];

            }

        }
        System.out.println("Le minimum du tableau est: " + min);
        System.out.println("Le maximum du tableau est: " + max);

        // Exo 4
        System.out.println("----------Exo4-------------");

        int[] numbers = {15,25,8,96,37,45,63};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int numbr1 = scanner.nextInt();
        int index = Arrays.binarySearch(numbers, numbr1);
        System.out.println( "Index du nombre: "+ numbr1 + "  est: " + index); 



        // Exo 5
        

        int[] tab = {1,2,3,4,3,5,6,6,2,3,4,8,6,1,1};
        Set<Integer> uniqueVals = new HashSet<>();

        for (int val : tab) {
            uniqueVals.add(val); 
        }
        System.out.println("UniqueValues: "+uniqueVals);
        



        














    }

}