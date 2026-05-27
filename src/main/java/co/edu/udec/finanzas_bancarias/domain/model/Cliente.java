package co.edu.udec.finanzas_bancarias.domain.model;

import co.edu.udec.finanzas_bancarias.domain.valueobjects.CodigoCliente;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.Direccion;

public class Cliente {
    private final CodigoCliente id_cliente;
    private String nombre;
    private final Direccion direccion;

    public Cliente(CodigoCliente id_cliente, String nombre, Direccion direccion) {
        if(nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre es obligatorio");
        }else if(direccion == null){
            throw new IllegalArgumentException("La dirección es obligatoria");
        }else  if(id_cliente == null){
            throw new IllegalArgumentException("El codigo de cliente es obligatorio");
        }
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public CodigoCliente getCodigoCliente() {return this.id_cliente;}
    public String getNombre() {return this.nombre;}
    public Direccion getDireccion() {return this.direccion;}
}
