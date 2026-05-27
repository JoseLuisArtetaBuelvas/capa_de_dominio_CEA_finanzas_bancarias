package co.edu.udec.finanzas_bancarias.domain.model;

import co.edu.udec.finanzas_bancarias.domain.enums.Sexo;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.CodigoCliente;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.Direccion;

import java.time.LocalDate;

public class Persona extends Cliente{
    private LocalDate fechaNacimiento;
    private Sexo sexo;

    public Persona(CodigoCliente codigoCliente, String nombre, Direccion direccion, LocalDate fechaNacimiento, Sexo sexo){
        super(codigoCliente, nombre, direccion);
        if(fechaNacimiento == null){
            throw new IllegalArgumentException("La fecha de nacimiento es obligatoria");
        } else if (sexo == null) {
            throw  new IllegalArgumentException("El sexo es obligatorio");
        }
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }
    public void actualizarFechaNacimiento(LocalDate fechaNacimiento){
        if(fechaNacimiento == null){
            throw new IllegalArgumentException("La fecha de nacimiento es obligatoria");
        }
        this.fechaNacimiento = fechaNacimiento;
    }

    public void actualizarSexo(Sexo sexo){
        if(sexo == null){
            throw new IllegalArgumentException("El sexo es obligatorio");
        }
        this.sexo = sexo;
    }
    public LocalDate getFechaNacimiento() {return this.fechaNacimiento;}
    public Sexo getSexo() {return this.sexo;}
}
