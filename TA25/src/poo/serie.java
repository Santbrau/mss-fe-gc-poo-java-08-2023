package poo;

public class serie {
    // Atributos
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;
    
    // Valores por defecto
    private static final int TEMPORADAS_POR_DEFECTO = 3;
    private static final boolean ENTREGADO_POR_DEFECTO = false;
    
    // Constructor por defecto
    public serie() {
        this.titulo = "";
        this.numeroTemporadas = TEMPORADAS_POR_DEFECTO;
        this.entregado = ENTREGADO_POR_DEFECTO;
        this.genero = "";
        this.creador = "";
    }
    
    // Constructor con título y creador
    public serie(String titulo, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = TEMPORADAS_POR_DEFECTO;
        this.entregado = ENTREGADO_POR_DEFECTO;
        this.genero = "";
        this.creador = creador;
    }
    
    // Constructor con todos los atributos excepto entregado
    public serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = ENTREGADO_POR_DEFECTO;
        this.genero = genero;
        this.creador = creador;
    }
    
}

