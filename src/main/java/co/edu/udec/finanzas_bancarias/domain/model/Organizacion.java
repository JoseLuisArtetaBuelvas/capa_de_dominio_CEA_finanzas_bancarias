package co.edu.udec.finanzas_bancarias.domain.model;

import co.edu.udec.finanzas_bancarias.domain.valueobjects.CodigoCliente;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.Direccion;

public class Organizacion extends Cliente{
    private String tipoOrganizacion;
    private String representante;
    private Integer cantidadEmpleados;

    public Organizacion(CodigoCliente codigoCliente, String nombre, Direccion direccion, String tipoOrganizacion, String representante, Integer cantidadEmpleados) {
        super(codigoCliente, nombre, direccion);
        if (tipoOrganizacion == null) {
            throw new IllegalArgumentException("El tipo de organizacion no puede ser nula");
        }else if(representante == null) {
            throw new IllegalArgumentException("El representante no puede ser nulo");
        }else if(cantidadEmpleados == null) {
            throw new IllegalArgumentException("El cantidadEmpleados no puede ser nula");
        }else if(cantidadEmpleados < 0) {
            throw new IllegalArgumentException("El cantidad de empleados no puede ser negativo");
        }
        this.tipoOrganizacion = tipoOrganizacion;
        this.representante = representante;
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public void actualizarTipoOrganizacion(String tipoOrganizacion) {
        if (tipoOrganizacion == null) {
            throw new IllegalArgumentException("El tipo de organizacion no puede ser nulo");
        }
        this.tipoOrganizacion = tipoOrganizacion;
    }

    public void actualizarRepresentante(String representante) {
        if (representante == null) {
            throw new IllegalArgumentException("El representante no puede ser nulo");
        }
        this.representante = representante;
    }

    public void  actualizarCantdidadEmpleados(Integer cantdidadEmpleados) {
        if (cantdidadEmpleados == null) {
            throw new IllegalArgumentException("El cantdidadEmpleados no puede ser nulo");
        }
        this.cantidadEmpleados = cantdidadEmpleados;
    }

    public String getTipoOrganizacion() {return tipoOrganizacion;}
    public String getRepresentante() {return representante;}
    public Integer getCantdidadEmpleados() {return cantidadEmpleados;}
}
