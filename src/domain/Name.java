package domain;

public enum Name {
    ALZINA("Alzina"),
    PI("Pi"),
    CLAVELL("Clavell"),
    ESPIGOL("Espigol"),
    PINYA("Pinya"),
    BOLA("Bola")
    ;

    private String name;

    Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
