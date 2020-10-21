public class App {
    public static void main(String[] args) throws Exception {
        

        GestorPrototype gestor= new GestorPrototype();
        System.out.println("\n EJEMPLO CLONACION SUPERFICIAL \n");

        Arma arma1 = new Arma("Excalibur",100);
        Arma arma2 = new Arma("Tizona",150);   

        Caballero caballeroPrototipo=gestor.nuevoCaballero("CaballeroPrototipo",10, 10, arma1); //Se crea el prototipo
        
        System.out.println(caballeroPrototipo);

        Personaje caballeroClon= (Personaje) caballeroPrototipo.clonar();//se hace un clon del prototipo
        caballeroClon.setNombre("CaballeroClon");//Los tipos de datos primitivos Java los copia en vez de referenciarlos
        System.out.println(caballeroClon);

        System.out.println("Comparando ambas armas: "+ (caballeroPrototipo.getArma()==caballeroClon.getArma() ) );// comparando retorna true esto debido a que son el mismo espacio en memoria

        caballeroPrototipo.getArma().setNombre("Kodachi");// al cambiar el nombre del objeto al ser referenciado todas las copias cambian tambien

        System.out.println("Comparando nuevamente: ");
        System.out.println(caballeroPrototipo);
        System.out.println(caballeroClon);

        System.out.println("-----------------------------------------");

        System.out.println("\n EJEMPLO CLONACION PROFUNDA \n");
        Personaje orcoPrototipo=gestor.nuevoOrco("OrcoPrototipo",50, 50, arma2);
        System.out.println(orcoPrototipo);

        Orco orcoClon=(Orco) orcoPrototipo.clonar();// se realiza implementacion profunda
        orcoClon.setNombre("OrcoClon");//Los tipos de datos primitivos Java los copia en vez de referenciarlos
        System.out.println(orcoClon);


        System.out.println("Comparando ambas armas: "+ (orcoPrototipo.getArma()==orcoClon.getArma() ) );// comparando retorna false pues son objetos diferentes en memoria
        
        orcoPrototipo.getArma().setNombre("Hielo");//para evidenciar mejor lo anterior
        
        System.out.println("Comparando nuevamente: ");
        System.out.println(orcoPrototipo);
        System.out.println(orcoClon);

        





    }

}
