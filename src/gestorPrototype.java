import java.util.ArrayList;

public class GestorPrototype{
    private ArrayList<Personaje> listaOrcos = new ArrayList<Personaje>();
    private ArrayList<Personaje> listaCaballeros = new ArrayList<Personaje>();

    public GestorPrototype(){
        System.out.println("Gestor Creado");
    }

    public void nuevoCaballero(int x,int y, Arma arma){
        Personaje caballero = new Caballero(x,y,arma);
        listaCaballeros.add(caballero);
    }

}