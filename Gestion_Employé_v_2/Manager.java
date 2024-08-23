public class Manager extends Employee {
    private int nombrePersonnesSousResponsabilite;

    public Manager(int id, String nom, String poste, double salaire, int nombrePersonnesSousResponsabilite) {
        super(id, nom, poste, salaire);
        this.nombrePersonnesSousResponsabilite = nombrePersonnesSousResponsabilite;
    }

    public int getNombrePersonnesSousResponsabilite() {
        return nombrePersonnesSousResponsabilite;
    }

    public void setNombrePersonnesSousResponsabilite(int nombrePersonnesSousResponsabilite) {
        this.nombrePersonnesSousResponsabilite = nombrePersonnesSousResponsabilite;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Manager [ID=" + id + ", Nom=" + nom + ", Poste=" + poste + ", Salaire=" + salaire + 
                            ", Nombre de personnes sous responsabilité=" + nombrePersonnesSousResponsabilite + "]");
    }
}
