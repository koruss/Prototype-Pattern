public class Arma {

    //ATRIBUTOS
    private String nombre;
    private double stat;

    //CONSTRUCTOR
    public Arma(String nombre, double stat)
    {
        this.nombre=nombre;
        this.stat=stat;
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