 public abstract class Personaje implements Cloneable{// implementa la interfaz de Java Cloneable
     private int x;
     private int y; 
     private Arma arma;

    Personaje(int x,int y, Arma arma){
        this.x=x;
        this.y=y;
        this.arma= arma;
         
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public Arma getArma(){
        return this.arma;
    }

    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }

    public void setArma(Arma arma){
        this.arma=arma;
    }

    public abstract Object clonar() throws CloneNotSupportedException;

    // @Override
    // public Object clonar() throws CloneNotSupportedException{
    //     return super.clone();
    // } 

 }