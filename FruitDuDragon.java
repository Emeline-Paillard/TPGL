/**
 *
 * @author hugogoyard
 */
public class FruitDuDragon implements Fruit {
    private double prix;
    private String origine;
	
    public FruitDuDragon() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public FruitDuDragon(double prix, String origine) 
    {
        if(prix < 0)
            this.prix = -prix;  //une solution possible pour interdire les prix negatifs
        else
            this.prix = prix;

        if(origine.equals(""))
                this.origine = "Espagne";  //Espagne par défaut
        else
                this.origine = origine;   
    }

    public double getPrix(){
	    return prix;
    }

    public void setPrix(double prix){
	    this.prix=prix;
    }

    public String getOrigine(){
	    return origine;
    }
 
    public void setOrigine(String origine){
	    this.origine=origine;
    }

    @Override
    public String toString(){
        return "Fruit du dragon de " + origine + " à " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 Fruit du dragons sont equivalentes
        if(o != null && getClass() == o.getClass()){
            FruitDuDragon or = (FruitDuDragon) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une Fruit du dragon a des pepins
        return true;
    }

    public static void main (String[] args){
        //Ecrire ici vos tests
	    
        FruitDuDragon ConstructeurDefaut = new FruitDuDragon();
        FruitDuDragon ConstructeurParam1 = new FruitDuDragon(7, "Argentine");
        FruitDuDragon ConstructeurParam2 = new FruitDuDragon(20, "");
        FruitDuDragon ConstructeurParam3 = new FruitDuDragon(-20, "Mexique");

        System.out.println("premier test FruitDuDragon");
        System.out.println(ConstructeurDefaut.toString());
        System.out.println(ConstructeurParam1.toString());
        System.out.println(ConstructeurParam2.toString());
        System.out.println(ConstructeurParam3.toString());

   }
}
