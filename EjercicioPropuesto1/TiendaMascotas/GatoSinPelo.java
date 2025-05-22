package TiendaMascotas;

public class GatoSinPelo extends Gato {
    private String raza;

    public GatoSinPelo(String nombre, int edad, String color, double alturaSalto, double longitudSalto, String raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Raza (Sin Pelo): " + raza);
    }
}
