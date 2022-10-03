public class Framboise {
    private double prix;
    private String origine;

    public Framboise() {
        this.prix = 0.5; // prix en euros
        this.origine = "Espagne";
    }

    public Framboise(double prix, String origine) {
        if (prix < 0)
            this.prix = -prix; // une solution possible pour interdire les prix negatifs
        else
            this.prix = prix;

        if (origine.equals(""))
            this.origine = "Espagne"; // Espagne par défaut
        else
            this.origine = origine;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    @Override
    public String toString() {
        return "Orange de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object fr) { // predicat pour tester si 2 oranges sont equivalentes
        if (fr != null && getClass() == fr.getClass()) {
            Framboise fra = (Framboise) fr;
            return (prix == fra.prix && origine.equals(fra.origine));
        }
        return false;
    }

    public boolean isSeedless() { // predicat indiquant qu'une orange a des pepins
        return false;
    }

    public static void main(String[] args) {
        // Ecrire ici vos tests
        System.out.println("premier test Framboise");
        Framboise fr = new Framboise(-50, "France");
        System.out.println(fr.toString());
    }
}
