import java.util.ArrayList;

public class GestorPrototype {
    private ArrayList<Personaje> listaOrcos = new ArrayList<Personaje>();
    private ArrayList<Personaje> listaCaballeros = new ArrayList<Personaje>();

    public GestorPrototype() {
        System.out.println("Gestor Creado");
    }

    public Caballero nuevoCaballero(String nombre,int x, int y, Arma arma) {
        Caballero caballero = new Caballero(nombre,x, y, arma);
        listaCaballeros.add(caballero);
        return caballero;
    }

    public Personaje nuevoOrco(String nombre,int x, int y, Arma arma) {
        Orco orquito = new Orco(nombre,x, y, arma);
        listaOrcos.add(orquito);
        return orquito;

    }

    public Personaje getOrco() {
        return listaOrcos.get(listaOrcos.size()-1);
    }

    public Personaje getCaballero() {
        return listaCaballeros.get(listaCaballeros.size()-1);
    }

    // public Personaje clonarCaballero() {
    //     Personaje caballerito = getCaballero();

    //     try {
    //         return (Caballero) caballerito.clonar();
    //     } catch (CloneNotSupportedException e) {
    //         System.out.println("Error al crear el caballero clonado");
    //         System.out.println(e);
    //     }
    //     return null;

    // }

    // public Personaje clonarOrco(){
    //     Personaje orquito= getOrco();
    //     try{
    //         return (Orco) orquito.clonar();
    //     }catch(CloneNotSupportedException e){
    //         System.out.println("Error al crear el Orco clonado");
    //     }
    //     return null;
    // }

}