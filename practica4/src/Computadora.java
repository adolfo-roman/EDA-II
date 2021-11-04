public class Computadora {

    private String marca;
    private double precio;
    private String tipo;

    private int ram;
    private String os;
    private String procesador;

    public Computadora(String marca,
                       double precio,
                       String tipo)
    {
        this.marca = marca;
        this.precio = precio;
        this.tipo = tipo;
    }

    public Computadora(int ram,
                       String os,
                       String procesador)
    {
        this.ram = ram;
        this.os = os;
        this.procesador = procesador;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String toStringStore() {
        return String.format("Marca : %s\n" +
                        "Precio : %.2f\n" +
                        "Tipo : %s",
                         marca, precio, tipo);
    }

    public String toStringSpecs() {
        return String.format("RAM : %d\n" +
                        "OS : %s\n" +
                        "Procesador : %s\n",
                        ram, os, procesador);
    }
}
