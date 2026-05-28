package co.edu.udec.finanzas_bancarias.domain.model;

import co.edu.udec.finanzas_bancarias.domain.enums.Sexo;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.CodigoCliente;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.Direccion;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.Dni;

import java.time.LocalDate;

public class Empleado extends Cliente {
    private final Dni dni;
    private LocalDate fechaNacimiento;
    private Sexo sexo;
    private Sucursal sucursal;

    public Empleado(CodigoCliente codigoCliente, String nombre, Direccion direccion, Dni dni, LocalDate fechaNacimiento, Sexo sexo, Sucursal sucursal) {
        super(codigoCliente, nombre, direccion);
        if(dni == null){
            throw new IllegalArgumentException("El dni no puede ser nulo");
        }else if(fechaNacimiento == null){
            throw new IllegalArgumentException("El fecha nacimiento no puede ser nula");
        }else if(sexo == null){
            throw new IllegalArgumentException("El sexo no puede ser nulo");
        }else if(sucursal == null){
            throw new IllegalArgumentException("El sucursal no puede ser nulo");
        }

        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.sucursal = sucursal;
    }

    public void actualizarFechaNacimiento(LocalDate fechaNacimiento) {
        if(fechaNacimiento == null){
            throw new IllegalArgumentException("El fecha nacimiento no puede ser nula");
        }
        this.fechaNacimiento = fechaNacimiento;
    }

    public void actualizarSucursal(Sucursal sucursal) {
        if(sucursal == null){
            throw new IllegalArgumentException("La sucursal no puede ser nula");
        }
        this.sucursal = sucursal;
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
    public Sucursal getSucursal() {return sucursal;}
}
