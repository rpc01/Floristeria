package domain;

public enum FlowerColor {

        GROC("Groc"), LILA("Lila");

        private String name;

        FlowerColor(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
}
