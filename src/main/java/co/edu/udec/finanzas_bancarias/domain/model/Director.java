package co.edu.udec.finanzas_bancarias.domain.model;

public class Director {
    private Empleado empleado;
    private Sucursal sucursal;

    public Director(Empleado empleado, Sucursal sucursal) {
        if(empleado == null) {
            throw new IllegalArgumentException("El empleado es obligatorio");
        }else if(sucursal == null) {
            throw new IllegalArgumentException("La sucursal es obligatoria");
        }
        this.empleado = empleado;
        this.sucursal = sucursal;
    }

    public void actualizarEmpleado(Empleado empleado) {
        if(empleado == null) {
            throw new IllegalArgumentException("El empleado es obligatorio");
        }
        this.empleado = empleado;
    }

    public void actualizarSucursal(Sucursal sucursal) {
        if(sucursal == null) {
            throw new IllegalArgumentException("La sucursal es obligatoria");
        }
        this.sucursal = sucursal;
    }

    public Empleado getEmpleado() {return this.empleado;}
    public Sucursal getSucursal() {return this.sucursal;}
}
