package domain;

public enum FlowerName {

        ESPIGOL("Espigol"), CLAVELL("Clavell");

        private String name;

        FlowerName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
}
