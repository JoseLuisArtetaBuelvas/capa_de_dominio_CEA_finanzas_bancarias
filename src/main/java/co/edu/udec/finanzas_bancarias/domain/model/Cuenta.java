package co.edu.udec.finanzas_bancarias.domain.model;

import co.edu.udec.finanzas_bancarias.domain.enums.TipoCuenta;
import co.edu.udec.finanzas_bancarias.domain.exceptions.SaldoInsuficienteException;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.CCC;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.NumeroCuenta;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.Saldo;

import java.time.LocalDate;

public class Cuenta {
    private final CCC ccc;
    private Sucursal sucursal;
    private Cliente cliente;
    private final NumeroCuenta numeroCuenta;
    private TipoCuenta tipoCuenta;
    private Saldo saldo;
    private LocalDate fechaApertura;
    private LocalDate fechaCierre;

    public Cuenta(CCC ccc, Sucursal sucursal, Cliente cliente,  NumeroCuenta numeroCuenta, TipoCuenta tipoCuenta, Saldo saldo, LocalDate fechaApertura, LocalDate fechaCierre) {
       if(ccc==null){
           throw new IllegalArgumentException("CCC no puede ser nulo");
       }else if(sucursal==null){
           throw new IllegalArgumentException("Sucursal no puede ser nulo");
       }else if(cliente==null){
           throw new IllegalArgumentException("Cliente no puede ser nulo");
       }else if(numeroCuenta==null){
           throw new IllegalArgumentException("NumeroCuenta no puede ser nulo");
       }else if(tipoCuenta==null){
           throw new IllegalArgumentException("TipoCuenta no puede ser nulo");
       }else if(saldo==null){
           throw new IllegalArgumentException("Saldo no puede ser nulo");
       }else if(fechaApertura==null){
           throw new IllegalArgumentException("Fecha Apertura no puede ser nulo");
       }
       this.ccc = ccc;
       this.sucursal = sucursal;
       this.cliente = cliente;
       this.numeroCuenta = numeroCuenta;
       this.tipoCuenta = tipoCuenta;
       this.saldo = saldo;
       this.fechaApertura = fechaApertura;
       this.fechaCierre = fechaCierre;
    }

    public void actualizarSucursal(Sucursal sucursal){
        if(sucursal==null){
            throw new IllegalArgumentException("Sucursal no puede ser nulo");
        }
        this.sucursal = sucursal;
    }

    public void actualizarCliente(Cliente cliente){
        if(cliente==null){
            throw new IllegalArgumentException("Cliente no puede ser nulo");
        }
        this.cliente = cliente;
    }

    public void actualizarTipoCuenta(TipoCuenta tipoCuenta){
        if(tipoCuenta==null){
            throw new IllegalArgumentException("TipoCuenta no puede ser nulo");
        }
        this.tipoCuenta = tipoCuenta;
    }

    //Métodos de saldo
    public  void actualizarSaldo(Saldo saldo){
        if(saldo==null){
            throw new IllegalArgumentException("Saldo no puede ser nulo");
        }
        this.saldo = saldo;
    }

    public void retirarSaldo(Saldo saldo){
        if(saldo.value().compareTo(this.saldo.value())>0){
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar un retiro");
        }
        this.saldo = new Saldo(this.saldo.value().subtract(saldo.value()));
    }

    public void depositarSaldo(Saldo saldo){
        if(saldo == null){
            throw new IllegalArgumentException("Saldo no puede ser nulo");
        }
        this.saldo = new Saldo(this.saldo.value().add(saldo.value()));
    }

    public void actualizarFechaApertura(LocalDate fechaApertura){
        if(fechaApertura==null){
            throw new IllegalArgumentException("Fecha Apertura no puede ser nula");
        }
        this.fechaApertura = fechaApertura;
    }
    public void actualizarFechaCierre(LocalDate fechaCierre){
        if(fechaCierre==null){
            throw new IllegalArgumentException("Fecha Cierre no puede ser nula");
        }
        this.fechaCierre = fechaCierre;
    }

    public CCC getCcc() {return this.ccc;}
    public Sucursal getSucursal() {return this.sucursal;}
    public Cliente getCliente() {return this.cliente;}
    public NumeroCuenta getNumeroCuenta() {return this.numeroCuenta;}
    public TipoCuenta getTipoCuenta() {return this.tipoCuenta;}
    public Saldo getSaldo() {return this.saldo;}
    public LocalDate getFechaApertura() {return this.fechaApertura;}
    public LocalDate getFechaCierre() {return this.fechaCierre;}
}
