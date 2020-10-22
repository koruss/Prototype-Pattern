
public class  Caballero extends Personaje{
    public Caballero(int x,int y,Arma arma){
        super(x,y,arma);
        
        System.out.println("Caballero Creado");
    }
    @Override
    public Personaje clonar() throws CloneNotSupportedException {
        return (Personaje) super.clone(); //el metodo clone devuelve un "Object" debido a esto es necesario realizar un casteo :)
     } // el metodo clone de Java

    public String toString() {
        return ("Posición x="+this.getX()+", Posición y="+this.getY()+", Nombre Arma="+this.getArma().getName()+", Stat Arma="+this.getArma().getStat()); 
    }
    


}