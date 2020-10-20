import java.util.ArrayList;

public class GestorPrototype{
    private ArrayList<Personaje> listaOrcos = new ArrayList<Orco>();
    private ArrayList<Personaje> listaCaballeros = new ArrayList<Caballeros>();

    public GestorPrototype(){

    }

    public void nuevoCaballero(int x,int y, Arma arma){
        Personaje caballero = new Caballero(x,y,arma);
    }

}