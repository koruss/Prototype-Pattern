
public class  Caballero extends Personaje{
    public Caballero(String nombre,int x,int y,Arma arma){
        super(nombre,x,y,arma);
        
        System.out.println("Caballero Creado");
    }
    @Override
    public Caballero clonar() throws CloneNotSupportedException {
        System.out.println("Caballero Clonado");
        return (Caballero) super.clone(); //el metodo clone devuelve un "Object" debido a esto es necesario realizar un casteo :)
     } // el metodo clone de Java

    public String toString() {
        return ("Nombre="+this.getNombre()+ ", x="+this.getX()+", y="+this.getY()+", Nombre Arma="+this.getArma().getName()+", Stat Arma="+this.getArma().getStat()); 
    }
    


}