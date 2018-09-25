package domain;

public enum Material {

        FUSTA("Fusta"), PLASTIC("Plàstic");

        private String name;

        Material(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
}
