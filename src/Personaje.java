 public class Personaje implements Cloneable{// implementa la interfaz de Java Cloneable
     private int x;
     private int y; 
     private Arma arma;

    public abstract clonar() throws CloneNotSupportedException{
        return (Personaje) this.clone(); //el metodo clone devuelve un "Object" debido a esto es necesario realizar un casteo :)
    } // el metodo clone de Java 

 }