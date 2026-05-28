package co.edu.udec.finanzas_bancarias.domain.services;

import co.edu.udec.finanzas_bancarias.domain.exceptions.ClienteNoEncontradoException;
import co.edu.udec.finanzas_bancarias.domain.exceptions.CuentaNoEncontradaException;
import co.edu.udec.finanzas_bancarias.domain.exceptions.SucursalNoEncontradaException;
import co.edu.udec.finanzas_bancarias.domain.model.Cuenta;
import co.edu.udec.finanzas_bancarias.domain.model.Cliente;
import co.edu.udec.finanzas_bancarias.domain.model.Sucursal;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.Saldo;

public class TransferenciaService {

    public void transferir(Cuenta origen, Cuenta destino, Saldo monto) {
        if (origen == null)
            throw new CuentaNoEncontradaException("La cuenta origen no existe");
        if (destino == null)
            throw new CuentaNoEncontradaException("La cuenta destino no existe");
        if (monto == null)
            throw new IllegalArgumentException("El monto no puede ser nulo");

        origen.retirarSaldo(monto);
        destino.depositarSaldo(monto);
    }

    public boolean validarSaldoSuficiente(Cuenta cuenta, Saldo monto) {
        if (cuenta == null)
            throw new CuentaNoEncontradaException("La cuenta no existe");
        if (monto == null)
            throw new IllegalArgumentException("El monto no puede ser nulo");

        return cuenta.getSaldo().value().compareTo(monto.value()) >= 0;
    }

    public boolean validarTitularidad(Cuenta cuenta, Cliente cliente) {
        if (cuenta == null)
            throw new CuentaNoEncontradaException("La cuenta no existe");
        if (cliente == null)
            throw new ClienteNoEncontradoException("El cliente no existe");

        return cuenta.getCliente().getCodigoCliente()
                .equals(cliente.getCodigoCliente());
    }

    public boolean validarSucursalActiva(Cuenta cuenta, Sucursal sucursal) {
        if (cuenta == null)
            throw new CuentaNoEncontradaException("La cuenta no existe");
        if (sucursal == null)
            throw new SucursalNoEncontradaException("La sucursal no existe");

        return cuenta.getSucursal().getIdSucursal()
                .equals(sucursal.getIdSucursal());
    }
}