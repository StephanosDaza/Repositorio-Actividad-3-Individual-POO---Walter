    package TiendaMascotas;

    public class PerroPequeno extends Perro {
        private String raza;

        public PerroPequeno(String nombre, int edad, String color, double peso, boolean muerde, String raza) {
            super(nombre, edad, color, peso, muerde);
            this.raza = raza;
        }

        @Override
        public void mostrarDatos() {
            super.mostrarDatos();
            System.out.println("Raza (Pequeño): " + raza);
        }
    }
