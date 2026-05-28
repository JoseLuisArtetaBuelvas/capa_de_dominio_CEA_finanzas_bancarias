package co.edu.udec.finanzas_bancarias.domain.model;

public class Banco {
    private final Integer id_banco;
    private String nombre;

    public Banco(Integer id_banco, String nombre) {
        if(nombre == null || nombre.isEmpty()) throw new IllegalArgumentException("El nombre no puede ser nulo");
        this.id_banco = id_banco;
        this.nombre = nombre;
    }

    public void actualizarNombre(String nombre) {
        if(nombre == null || nombre.isEmpty()) throw new IllegalArgumentException("El nombre es obligatorio");
        this.nombre = nombre;
    }

    public Integer getIdbanco() {return id_banco;}
    public String getNombre() {return nombre;}
}
