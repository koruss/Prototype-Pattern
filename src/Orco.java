
public class Orco extends Personaje {

   public Orco(String nombre,int x, int y, Arma arma) {
      super(nombre,x, y, arma);
      System.out.println("Orco Creado");
   }

   public Orco clonar() throws CloneNotSupportedException {
      Orco orquito = (Orco) super.clone();
      orquito.setArma((Arma) orquito.getArma().clone());
      System.out.println("Orco Clonado");
      return orquito;

   }

   public String toString() {
      return ("Nombre="+ this.getNombre()+ ", x=" + this.getX() + ", y=" + this.getY() + ", Nombre Arma=" + this.getArma().getName()
            + ", Stat Arma=" + this.getArma().getStat());
   }
}