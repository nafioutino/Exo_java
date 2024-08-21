public class App {
    public static void main(String[] args) {
        Voiture mycar = new Voiture("Apsonic",2024 );
        mycar.setType("Toyota");
        System.out.println(mycar.getType());
        System.out.println( "Couleur: "+ mycar.couleur);
        System.out.println( "Modèe: "+ mycar.modèle);
        // System.out.println( "Type: "+ mycar.type);
        System.out.println( "Prix: "+ mycar.prix);
        mycar.accelerer();
        mycar.ralentir();
        mycar.tourner();
        mycar.freine();
        
        
    }
}
