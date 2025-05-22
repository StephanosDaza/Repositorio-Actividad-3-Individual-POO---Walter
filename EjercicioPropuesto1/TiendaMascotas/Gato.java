package TiendaMascotas;

public class Gato extends Mascota {
    protected double alturaSalto;
    protected double longitudSalto;

    public Gato(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }

    public static void sonido() {
        System.out.println("Los gatos maúllan y ronronean");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Altura de salto: " + alturaSalto + " m, Longitud de salto: " + longitudSalto + " m");
    }
}
