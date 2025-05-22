package TiendaMascotas;

public class GatoPeloCorto extends Gato {
    private String raza;

    public GatoPeloCorto(String nombre, int edad, String color, double alturaSalto, double longitudSalto, String raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Raza (Pelo Corto): " + raza);
    }
}
