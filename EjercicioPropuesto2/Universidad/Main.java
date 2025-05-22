public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Laura", "Calle 123", "Ingeniería", 4);
        Profesor profesor = new Profesor("Carlos", "Av. 45", "Matemáticas", "Titular");

        System.out.println("Estudiante:");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Dirección: " + estudiante.getDireccion());
        System.out.println("Carrera: " + estudiante.getCarrera());
        System.out.println("Semestre: " + estudiante.getSemestre());

        System.out.println("\nProfesor:");
        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("Dirección: " + profesor.getDireccion());
        System.out.println("Departamento: " + profesor.getDepartamento());
        System.out.println("Categoría: " + profesor.getCategoria());
    }
}
