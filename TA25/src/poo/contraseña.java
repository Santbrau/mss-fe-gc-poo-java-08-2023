package poo;

import java.util.Random;

public class contraseña {
	 // Atributos
    private int longitud;
    private String contraseña;
    
    // Longitud por defecto
    private static final int LONGITUD_POR_DEFECTO = 8;
    
    // Constructor por defecto
    public contraseña() {
        this.longitud = LONGITUD_POR_DEFECTO;
        generarContraseña();
    }
    
    // Constructor con longitud personalizada
    public contraseña(int longitud) {
        this.longitud = longitud;
        generarContraseña();
    }
    
    // Generar una contraseña aleatoria
    private void generarContraseña() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }
        
        contraseña = sb.toString();
    }
    
    // Métodos de acceso
    public int getLongitud() {
        return longitud;
    }
    
    public String getContraseña() {
        return contraseña;
    }
}