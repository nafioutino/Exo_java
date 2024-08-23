public class Developer extends Employee {
    private String langageSpecialisation;

    public Developer(int id, String nom, String poste, double salaire, String langageSpecialisation) {
        super(id, nom, poste, salaire);
        this.langageSpecialisation = langageSpecialisation;
    }

    public String getLangageSpecialisation() {
        return langageSpecialisation;
    }

    public void setLangageSpecialisation(String langageSpecialisation) {
        this.langageSpecialisation = langageSpecialisation;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Developer [ID=" + id + ", Nom=" + nom + ", Poste=" + poste + ", Salaire=" + salaire + 
                            ", Langage de spécialisation=" + langageSpecialisation + "]");
    }
}
