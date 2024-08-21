
public class Methode {
    public static void main(String[] args) {

        System.out.println(sum(1, 2));
        System.out.println(isEven(8));
        System.out.println(factorial(5));
    }

    // Exo 1
    static int sum(int a, int b) {
        return  a + b;
    }

    // Exo 2
    static String isEven(int number) {
        return number % 2 == 0 ? "Le nombre " + number +" est pair ": " Le nombre "+ number+" n'est pas pair";
    }

    // Exo 3
    static int factorial(int n) {
        int fact = 1;
        if(n == 0){
            return 1;
        }
        for (int i = 1 ; i<=n; ++i) {
            fact *=i ;   
        }
        return fact;
    }

    

}
