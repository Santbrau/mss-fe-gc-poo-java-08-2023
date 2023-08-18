package poo;

public class electrodomestico {

	private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;
    
    // Valores por defecto
    private static final String COLOR_POR_DEFECTO = "blanco";
    private static final char CONSUMO_POR_DEFECTO = 'F';
    private static final double PRECIO_POR_DEFECTO = 100.0;
    private static final double PESO_POR_DEFECTO = 5.0;
    
    // Colores disponibles
    private static final String[] COLORES_DISPONIBLES = {"blanco", "negro", "rojo", "azul", "gris"};
    
    // Constructor por defecto
    public electrodomestico() {
        this.precioBase = PRECIO_POR_DEFECTO;
        this.color = COLOR_POR_DEFECTO;
        this.consumoEnergetico = CONSUMO_POR_DEFECTO;
        this.peso = PESO_POR_DEFECTO;
    }
    
    // Constructor con precio y peso
    public electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.color = COLOR_POR_DEFECTO;
        this.consumoEnergetico = CONSUMO_POR_DEFECTO;
        this.peso = peso;
    }
    
    // Constructor con todos los atributos
    public electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }
    
    // Métodos privados para validar el color y consumo energético
    private String comprobarColor(String color) {
        for (String col : COLORES_DISPONIBLES) {
            if (col.equalsIgnoreCase(color)) {
                return color;
            }
        }
        return COLOR_POR_DEFECTO;
    }
    
    private char comprobarConsumoEnergetico(char consumo) {
        if (consumo >= 'A' && consumo <= 'F') {
            return consumo;
        }
        return CONSUMO_POR_DEFECTO;
    }
    
}