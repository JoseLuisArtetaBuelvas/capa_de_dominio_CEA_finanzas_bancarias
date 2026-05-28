package co.edu.udec.finanzas_bancarias.domain.services;
import co.edu.udec.finanzas_bancarias.domain.exceptions.CuentaNoEncontradaException;
import co.edu.udec.finanzas_bancarias.domain.model.Cuenta;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.Saldo;

public class TransferenciaService {
    public void transferir(Cuenta origen, Cuenta destino, Saldo monto) {
        if (origen == null)
            throw new CuentaNoEncontradaException("La cuenta origen no existe");
        if (destino == null)
            throw new CuentaNoEncontradaException("La cuenta destino no existe");
        if (monto == null)
            throw new IllegalArgumentException("El monto no puede ser nulo");

        origen.retirarSaldo(monto);   // lanza SaldoInsuficienteException si no hay saldo
        destino.depositarSaldo(monto);
    }

    public boolean validarSaldoSuficiente(Cuenta cuenta, Saldo monto) {
        if (cuenta == null)
            throw new CuentaNoEncontradaException("La cuenta no existe");
        if (monto == null)
            throw new IllegalArgumentException("El monto no puede ser nulo");

        return cuenta.getSaldo().value().compareTo(monto.value()) >= 0;
    }
}
