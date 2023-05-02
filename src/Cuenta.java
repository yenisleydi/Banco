public class Cuenta {
    private double cantidad;
    private String nombre;
    private int claveInterbancaria;

    public Cuenta(double cantidad, String nombre, int claveInterbancaria) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.claveInterbancaria = claveInterbancaria;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setClaveInterbancaria(int claveInterbancaria) {
        this.claveInterbancaria = claveInterbancaria;
    }

    public int getClaveInterbancaria() {
        return claveInterbancaria;
    }
}
