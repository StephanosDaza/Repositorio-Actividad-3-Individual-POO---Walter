package TiendaMascotas;

public class PerroGrande extends Perro {
    private String raza;

    public PerroGrande(String nombre, int edad, String color, double peso, boolean muerde, String raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Raza (Grande): " + raza);
    }
}
