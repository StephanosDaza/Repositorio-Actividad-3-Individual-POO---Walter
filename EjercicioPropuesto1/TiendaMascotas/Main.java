package TiendaMascotas;

public class Main {
    public static void main(String[] args) {
        PerroPequeno p1 = new PerroPequeno("Firulais", 3, "Marrón", 5.5, true, "Chihuahua");
        p1.mostrarDatos();
        Perro.sonido();

        System.out.println();

        PerroGrande p2 = new PerroGrande("Rex", 5, "Negro", 25.0, true, "Pastor Alemán");
        p2.mostrarDatos();
        Perro.sonido();

        System.out.println();

        GatoPeloCorto g1 = new GatoPeloCorto("Michi", 2, "Gris", 1.2, 2.0, "Azul Ruso");
        g1.mostrarDatos();
        Gato.sonido();

        System.out.println();

        GatoSinPelo g2 = new GatoSinPelo("Esfinge", 4, "Beige", 0.8, 1.5, "Esfinge");
        g2.mostrarDatos();
        Gato.sonido();
    }
}
