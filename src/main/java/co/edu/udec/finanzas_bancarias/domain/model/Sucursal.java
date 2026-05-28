package co.edu.udec.finanzas_bancarias.domain.model;

import co.edu.udec.finanzas_bancarias.domain.valueobjects.Direccion;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.NumeroSucursal;

public class Sucursal {
    private final Integer idSucursal;
    private NumeroSucursal numeroSucursal;
    private Direccion direccion;
    private String ciudadOperando;
    private Banco banco;
    public Sucursal(Integer idSucursal, NumeroSucursal numeroSucursal, Direccion direccion, String ciudadOperando, Banco banco) {
        if(numeroSucursal == null){
            throw new IllegalArgumentException("El numero de sucursal no puede ser nulo");
        }else if(direccion == null){
            throw new IllegalArgumentException("La direccion no puede ser nula");
        }else if(ciudadOperando == null){
            throw new IllegalArgumentException("La ciudad donde opera la sucursal no puede ser nula");
        }else if(banco == null){
            throw new IllegalArgumentException("El banco no puede ser nula");
        }
        this.idSucursal = idSucursal;
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudadOperando = ciudadOperando;
        this.banco = banco;
    }

    public void actualizarDireccion(Direccion direccion) {
        if(direccion == null){
            throw new IllegalArgumentException("La direccion no puede ser nula");
        }
        this.direccion = direccion;
    }

    public void actualizarNumeroSucursal(NumeroSucursal numeroSucursal) {
        if(numeroSucursal == null){
            throw new IllegalArgumentException("El numero de sucursal no puede ser nulo");
        }
        this.numeroSucursal = numeroSucursal;
    }

    public void actualizarCiudadOperando(String ciudadOperando) {
        if(ciudadOperando == null){
            throw new IllegalArgumentException("La ciudad donde opera la sucursal no puede ser nula");
        }
        this.ciudadOperando = ciudadOperando;
    }

    public void actualizarBanco(Banco banco) {
        if(banco == null){
            throw new IllegalArgumentException("La banco no puede ser nulo");
        }
        this.banco = banco;
    }

    public Integer getIdSucursal() {return this.idSucursal;}
    public NumeroSucursal getNumeroSucursal() {return this.numeroSucursal;}
    public Direccion getDireccion() {return this.direccion;}
    public String getCiudadOperando() {return this.ciudadOperando;}
    public Banco getBanco() {return this.banco;}
}
