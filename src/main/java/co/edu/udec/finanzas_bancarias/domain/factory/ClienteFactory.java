package co.edu.udec.finanzas_bancarias.domain.factory;
import co.edu.udec.finanzas_bancarias.domain.model.Cliente;
import co.edu.udec.finanzas_bancarias.domain.model.Persona;
import co.edu.udec.finanzas_bancarias.domain.model.Organizacion;
import co.edu.udec.finanzas_bancarias.domain.enums.Sexo;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.CodigoCliente;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.Direccion;
import co.edu.udec.finanzas_bancarias.domain.model.Empleado;
import co.edu.udec.finanzas_bancarias.domain.model.Sucursal;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.Dni;
import co.edu.udec.finanzas_bancarias.domain.exceptions.SucursalNoEncontradaException;
import java.time.LocalDate;

public class ClienteFactory {
    public static Persona crearPersona(CodigoCliente codigoCliente, String nombre, Direccion direccion, LocalDate fechaNacimiento, Sexo sexo) {
        if (codigoCliente == null)
            throw new IllegalArgumentException("El código del cliente no puede ser nulo");
        return new Persona(codigoCliente, nombre, direccion, fechaNacimiento, sexo);
    }

    public static Organizacion crearOrganizacion(CodigoCliente codigoCliente, String nombre, Direccion direccion, String tipoOrganizacion, String representante, Integer cantidadEmpleados) {
        if (codigoCliente == null)
            throw new IllegalArgumentException("El código del cliente no puede ser nulo");
        return new Organizacion(codigoCliente, nombre, direccion,
                tipoOrganizacion, representante, cantidadEmpleados);
    }

    public static Empleado crearEmpleado(CodigoCliente codigoCliente, String nombre,
                                         Direccion direccion, Dni dni,
                                         LocalDate fechaNacimiento, Sexo sexo,
                                         Sucursal sucursal) {
        if (codigoCliente == null)
            throw new IllegalArgumentException("El código del cliente no puede ser nulo");
        if (sucursal == null)
            throw new SucursalNoEncontradaException("La sucursal no existe");

        return new Empleado(codigoCliente, nombre, direccion, dni, fechaNacimiento, sexo, sucursal);
    }
}
