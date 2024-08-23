public class Developer extends Employee {
    private String specificityLangage;

    public Developer(int id, String nom, String poste, double salaire, String specificityLangage) {
        super(id, nom, poste, salaire);
        this.specificityLangage = specificityLangage;

    }

    public int getspecificityLangage(int specificityLangage) {
        return specificityLangage;
    }

    public void setspecificityLangage(String specificityLangage) {
        this.specificityLangage = specificityLangage;
    }

    @Override
    public void afficherDetails() {
        System.out.println(" Developer { ID: " + id + " , Nom:" + nom + " , Poste:" + poste +", Salaire:" + salaire +
                " , Language de specification: " + specificityLangage + " }");

    }
}
