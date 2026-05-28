package co.edu.udec.finanzas_bancarias.domain.model;

import co.edu.udec.finanzas_bancarias.domain.enums.TipoCuenta;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.CCC;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.NumeroCuenta;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.Saldo;

import java.time.LocalDate;

public class CuentaAhorro extends Cuenta {
    private String tipoAmortizacion;

    public CuentaAhorro(CCC ccc, Sucursal sucursal, Cliente cliente, NumeroCuenta numeroCuenta, TipoCuenta tipoCuenta, Saldo saldo, LocalDate fechaApertura, LocalDate fechaCierre, String tipoAmortizacion) {
        super(ccc, sucursal, cliente, numeroCuenta, tipoCuenta, saldo, fechaApertura, fechaCierre);
        if(tipoAmortizacion==null){
            throw new IllegalArgumentException("El tipo de amortizacion no puede ser nulo");
        }
        this.tipoAmortizacion = tipoAmortizacion;
    }

    public void actualizarTipoAmortizacion(String tipoAmortizacion){
        if(tipoAmortizacion==null){
            throw new IllegalArgumentException("El tipo de amortizacion no puede ser nulo");
        }
        this.tipoAmortizacion = tipoAmortizacion;
    }

    public String getTipoAmortizacion() {return tipoAmortizacion;}
}
