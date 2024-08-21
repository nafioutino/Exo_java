public class Voiture {
 

     private String  type = "Audi";
    int modèle = 2019;
    int prix = 250000;
    String couleur = "rouge";
    public Voiture (String type , int modèle) {
        this.type = type;
        this.modèle = modèle;
    }
    public Voiture (int prix) {
       this.prix = prix;
    }
    public Voiture () {
        System.out.println("Pas de variable initialisé !");
    }
    
    public void accelerer() {
        System.out.println(" J'accélère");
    }
    public void ralentir() {
        System.out.println("Je ralenti");
    }
    public void tourner() {
        System.out.println("Je tourne");
    }
    public void freine() {
        System.out.println("Je freine");
    }

    // un getter

    public String getType(){
        return type;
    }

    // un setter
    public void setType(String newtype){
        this.type = newtype;
    }
    // Methode de mutation





}
