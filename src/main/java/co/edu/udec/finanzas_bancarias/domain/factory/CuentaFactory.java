package co.edu.udec.finanzas_bancarias.domain.factory;
import co.edu.udec.finanzas_bancarias.domain.enums.TipoCuenta;
import co.edu.udec.finanzas_bancarias.domain.exceptions.SucursalNoEncontradaException;
import co.edu.udec.finanzas_bancarias.domain.exceptions.ClienteNoEncontradoException;
import co.edu.udec.finanzas_bancarias.domain.model.Cuenta;
import co.edu.udec.finanzas_bancarias.domain.model.Cliente;
import co.edu.udec.finanzas_bancarias.domain.model.Sucursal;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.CCC;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.NumeroCuenta;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.Saldo;
import java.math.BigDecimal;
import java.time.LocalDate;

public class CuentaFactory {
    public static Cuenta crear(CCC ccc, Sucursal sucursal, Cliente cliente, NumeroCuenta numeroCuenta, TipoCuenta tipoCuenta) {
        if (sucursal == null)
            throw new SucursalNoEncontradaException("La sucursal no existe");
        if (cliente == null)
            throw new ClienteNoEncontradoException("El cliente no existe");

        return new Cuenta(
                ccc,
                sucursal,
                cliente,
                numeroCuenta,
                tipoCuenta,
                new Saldo(BigDecimal.ZERO),  // saldo inicial en cero
                LocalDate.now(),              // fecha apertura hoy
                null                          // fecha cierre nula al inicio
        );
    }
}
