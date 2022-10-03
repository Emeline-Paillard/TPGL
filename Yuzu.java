public class Yuzu implements Fruit {
    private double prix;
    private String origine;

    public Yuzu(int prix, String origine){
        this.prix = prix;
        this.origine = origine;
    }

    @Override
    public boolean isSeedless() {
        return true;
    }

    @Override
    public double getPrix() {
        return prix;
    }

    @Override
    public String getOrigine() {
        return origine;
    }

    @Override
    public boolean equals(Object o) {
        if(o != null && getClass() == o.getClass()){
            Yuzu or = (Yuzu) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    @Override
    public String toString() {
        return "Yuzu de " + origine + " a " + prix + " euros";
    }
}
