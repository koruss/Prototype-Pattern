public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        GestorPrototype gestor= new GestorPrototype();

        Arma arma1 = new Arma("Excalibur",100);
        
        Arma arma2 = new Arma("Tizona",150);
        
        Arma arma3 = new Arma("Piedra",1500);
        
        Arma arma4 = new Arma("Palo",2220);
        
        Personaje caballeroPrototipo=gestor.nuevoCaballero(10, 10, arma1);
        
        System.out.println(caballeroPrototipo);

        Personaje caballero1= (Personaje) caballeroPrototipo.clonar();
        System.out.println(caballero1);

        Personaje caballero2= (Personaje) caballeroPrototipo.clonar();
        System.out.println(caballero2);

        System.out.println(caballeroPrototipo.equals(caballero1));

        caballeroPrototipo.setArma(arma2);

        System.out.println(caballeroPrototipo);
        
        System.out.println(caballero1);

        System.out.println("-----------------------------------------");

        Personaje orcoPrototipo=gestor.nuevoOrco(50, 50, arma3);
        System.out.println(orcoPrototipo);

        Object orco1=orcoPrototipo.clonar();
        System.out.println(orco1);

        Personaje orco2= (Personaje) orcoPrototipo.clonar();
        System.out.println(orco2);

        orcoPrototipo.setArma(arma4);

        System.out.println(orcoPrototipo);
        
        System.out.println(orco1);

        





    }
}
