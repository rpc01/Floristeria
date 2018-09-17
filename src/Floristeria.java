import java.util.List;
import java.util.ArrayList;

public class Floristeria {
    public String name = "Flors de Colors";
    public String decoracio = "Fusta";

    List<Arbre> arbres = new ArrayList<>();
    List<Flor> flors = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecoracio() {
        return decoracio;
    }

    public void setDecoracio(String decoracio) {
        this.decoracio = decoracio;
    }
}

