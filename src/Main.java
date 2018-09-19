import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Flor> flors = new ArrayList<>();
        Flor flor1 = new Flor();
        flors.add(flor1);
        Flor flor2 =  new Flor();
        flors.add(flor2);
        Flor flor3 = new Flor();
        flors.add(flor3);

        Llistar llista = new Llistar();
        llista.getStock(flors);
    }
}

/**
 crearFloristeria

 afegirArbre

 afegirFlor

 afegirDecoracio

 stock: tots els arbre, flors i decoració que té la floristeria

 EXEMPLE STOCK:
 ARBRES:
 TTTTTTT
 FLORS:
 YYYYYY
 DECORACIÓ:
 XXXXXXXX
 **/


