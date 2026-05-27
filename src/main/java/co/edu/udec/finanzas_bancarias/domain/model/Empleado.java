package co.edu.udec.finanzas_bancarias.domain.model;

import co.edu.udec.finanzas_bancarias.domain.enums.Sexo;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.CodigoCliente;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.Direccion;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.Dni;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.NumeroSucursal;

import java.time.LocalDate;

public class Empleado extends Cliente {
    private final Dni dni;
    private LocalDate fechaNacimiento;
    private Sexo sexo;
    private final NumeroSucursal idSucursal;

    public Empleado(CodigoCliente codigoCliente, String nombre, Direccion direccion, Dni dni, LocalDate fechaNacimiento, Sexo sexo, NumeroSucursal idSucursal) {
        super(codigoCliente, nombre, direccion);
        if(dni == null){
            throw new IllegalArgumentException("El dni no puede ser nulo");
        }else if(fechaNacimiento == null){
            throw new IllegalArgumentException("El fecha nacimiento no puede ser nula");
        }else if(sexo == null){
            throw new IllegalArgumentException("El sexo no puede ser nulo");
        }else if(idSucursal == null){
            throw new IllegalArgumentException("El Identificacion no puede ser nulo");
        }
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.idSucursal = idSucursal;
    }

    public void actualizarFechaNacimiento(LocalDate fechaNacimiento) {
        if(fechaNacimiento == null){
            throw new IllegalArgumentException("El fecha nacimiento no puede ser nula");
        }
        this.fechaNacimiento = fechaNacimiento;
    }

    public void actualizarSexo(Sexo sexo) {
        if(sexo == null){
            throw new IllegalArgumentException("El sexo no puede ser nulo");
        }
        this.sexo = sexo;
    }

    public Dni getDni() {return dni;}
    public LocalDate getFechaNacimiento() {return fechaNacimiento;}
    public Sexo getSexo() {return sexo;}
    public NumeroSucursal getIdSucursal() {return idSucursal;}
}
