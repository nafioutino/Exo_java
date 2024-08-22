import java.util.ArrayList;

public class Employes {
    int ID;
    String name;
    String post;
    double salaire;
     

    public Employes (int ID, String name, String post, double salaire){
        this.ID = ID;
        this.name = name;
        this.post = post;
        this.salaire = salaire;
    }
    

    // get et set   pour ID
    public int getId(){
        return this.ID;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }



    // get et set pour name
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }




    // get et set pour ID
    public String  getPost(){
        return this.post;
    }

    public void setPost(String post){
        this.post = post;
    }



    // get et set pour ID
    public double getSalaire(){
        return this.salaire;
    }

    public void setSalaire(double salaire){
        this.salaire = salaire;
    }

    public String toString() {
        return "Employe [ID = " + ID + ", Nom= " + name + ", Poste= " + post + ", Salaire= " + salaire + "]";
    }









}
