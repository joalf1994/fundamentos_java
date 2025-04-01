public class Automovil {
    // Atributos de instancia
    private String fabricante;
    private String modelo;
    private Color color;
    private double cilindrada;

    // Atributos de clase
    private static int ruedas;
    private static int id;

    //Metodos de clase
    public static int getRuedas() {
        return ruedas;
    }

    public static int getId() {
        return id;
    }

    //Metodos de instancia

    // Sobrecarga de constructores
    public Automovil() {
        ++id; // Cuenta el número de instancias del objeto
    }
    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante, modelo);
        this.color = color;
        this.cilindrada = cilindrada;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public Color getColor() {
        return color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color=" + color.getColor() +
                ", cilindrada=" + cilindrada +
                '}';
    }
}
