package inmuebles;

public class Local extends Inmueble {
    public enum TipoLocal { INTERNO, CALLE }
    protected TipoLocal tipoLocal;

    public Local(int identificadorInmobiliario, int area, String direccion, TipoLocal tipoLocal) {
        super(identificadorInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo de local = " + tipoLocal);
    }
}
