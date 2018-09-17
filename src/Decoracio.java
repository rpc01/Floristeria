public class Decoracio {
    private String material;
    public Decoracio(String material) throws Exception
    {
        if (!material.equals("plàstic") && !material.equals("fusta")) throw new Exception("només plàstic o fusta");
        this.material = material;
    }

    @Override
    public String toString() {
        return "Decoració " + material;
    }

}
