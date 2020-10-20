public class Arma {

    //ATRIBUTOS
    private String nombre;
    private double stat;

    //CONSTRUCTOR
    public Arma(){

    }
    
    public void setNombre(String name){
        nombre=name;
    }

    public String getName(){
        return nombre;
    }

    public double getStat(){
        return stat;
    }

    public void setStat(double estadistica){
        stat= estadistica;
    }


}