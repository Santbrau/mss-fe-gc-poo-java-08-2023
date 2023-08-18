package poo;

import java.util.Random;

public class persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    private static final char SEXO_POR_DEFECTO = 'H';

    // Constructor por defecto
    public persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = generarDNI();
        this.sexo = SEXO_POR_DEFECTO;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    // Constructor con nombre, edad y sexo
    public persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generarDNI();
        if (sexo == 'H' || sexo == 'M') {
            this.sexo = sexo;
        } else {
            this.sexo = SEXO_POR_DEFECTO;
        }
        this.peso = 0.0;
        this.altura = 0.0;
    }

    // Constructor con todos los atributos como parámetro
    public persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        if (sexo == 'H' || sexo == 'M') {
            this.sexo = sexo;
        } else {
            this.sexo = SEXO_POR_DEFECTO;
        }
        this.peso = peso;
        this.altura = altura;
    }

    // Método para generar un DNI aleatorio (solo como ejemplo, no es seguro)
    private String generarDNI() {
        return "12345678A";
    }

    // Otros métodos de la clase
}
