package TiendaMascotas;

public class PerroMediano extends Perro {
    private String raza;

    public PerroMediano(String nombre, int edad, String color, double peso, boolean muerde, String raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Raza (Mediano): " + raza);
    }
}
