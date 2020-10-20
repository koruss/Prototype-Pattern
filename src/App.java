public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        GestorPrototype gestor= new GestorPrototype();

        Arma arma1 = new Arma("Excalibur",100);
        
        Arma arma2 = new Arma("Tizona",150);
        
        gestor.nuevoCaballero(10, 10, arma1);

        Personaje clon =gestor.clonarCaballero();

        




    }
}
