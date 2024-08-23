public class Manager extends Employee {

    private int nbreResponsibilities ;

    public  Manager(int id, String nom , String poste, double salaire, int nbreResponsibilities){
        super(id,nom, poste, salaire);
        this.nbreResponsibilities = nbreResponsibilities;
    }

    public int getResponsibilities(int nbreResponsibilities){
        return nbreResponsibilities;
    }

    public void setResponsibilities(int nbreResponsibilities){
        this.nbreResponsibilities = nbreResponsibilities;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Manager { ID:" + id + " , Nom:" + nom + " , Poste:" + poste + " , Salaire:" + salaire + 
        ", Nombre de personnes sous responsabilité: " + nbreResponsibilities + " }");
        
    }

    

}
