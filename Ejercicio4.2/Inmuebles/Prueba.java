package inmuebles;

public class Prueba {
    public static void main(String[] args) {
        ApartamentoFamiliar apto1 = new ApartamentoFamiliar(103067, 120, "Avenida Santander 45-45", 3, 2, 200000);
        System.out.println("Datos apartamento familiar");
        apto1.calcularPrecioVenta(ApartamentoFamiliar.valorArea);
        apto1.imprimir();
        System.out.println();

        Apartaestudio estudio1 = new Apartaestudio(12354, 50, "Avenida Caracas 30-15");
        System.out.println("Datos apartaestudio");
        estudio1.calcularPrecioVenta(Apartaestudio.valorArea);
        estudio1.imprimir();
    }
}
