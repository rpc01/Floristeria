public class Producte {
    Double preu;
    public Producte(double preu) throws Exception {
        if (preu <= 0) throw new Exception();
        {
            this.preu = preu;
        }

    }
}
