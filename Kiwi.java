/**
 *
 * @author
 ╔╦╗┬ ┬┬┌┐ ┌─┐┬ ┬┬ ┌┬┐
  ║ ├─┤│├┴┐├─┤│ ││  │
  ╩ ┴ ┴┴└─┘┴ ┴└─┘┴─┘┴
 ╦  ┌─┐┌┐┌┌─┐┌─┐┬  ┌─┐┌┬┐
 ║  ├─┤││││  ├┤ │  │ │ │
 ╩═╝┴ ┴┘└┘└─┘└─┘┴─┘└─┘ ┴
 */


public class Kiwi implements Fruit{

    private double prix;
    private String origine;
	
    public Kiwi() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Kiwi(double prix, String origine) 
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
        return "Kiwi de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object k){  //predicat pour tester si 2 Kiwis sont equivalents
        if(k != null && getClass() == k.getClass()){
            Kiwi kw = (Kiwi) k;
            return (prix == kw.prix && origine.equals(kw.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'un Kiwi a des pepins
        return true;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
        Kiwi ConstructeurDefaut = new Kiwi();
        Kiwi ConstructeurParam1 = new Kiwi(15, "Bretagne");
        Kiwi ConstructeurParam2 = new Kiwi(10, "");
        Kiwi ConstructeurParam3 = new Kiwi(-4, "Hongrie");

        System.out.println("premier test Kiwi");
        System.out.println(ConstructeurDefaut.toString());
        System.out.println(ConstructeurParam1.toString());
        System.out.println(ConstructeurParam2.toString());
        System.out.println(ConstructeurParam3.toString());
   }
}
