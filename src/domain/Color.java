package domain;

public enum Color {

        GROC("Groc"), LILA("Lila"), VERD("Verd");

        private String name;

        Color(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
}
