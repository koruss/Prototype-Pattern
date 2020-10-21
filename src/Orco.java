
public class Orco extends Personaje {

   public Orco(int x, int y, Arma arma) {
      super(x, y, arma);
      System.out.println("Orco Creado");
   }

   public Orco clonar() throws CloneNotSupportedException {
      Orco orquito = (Orco) super.clone();
      orquito.setArma((Arma) orquito.getArma().clone());
      return orquito;

   }

   public String toString() {
      return ("Posición x=" + this.getX() + ", Posición y=" + this.getY() + ", Nombre Arma=" + this.getArma().getName()
            + ", Stat Arma=" + this.getArma().getStat());
   }
}