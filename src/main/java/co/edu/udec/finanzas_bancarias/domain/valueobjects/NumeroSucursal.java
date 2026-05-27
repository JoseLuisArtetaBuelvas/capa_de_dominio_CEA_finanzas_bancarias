package co.edu.udec.finanzas_bancarias.domain.valueobjects;

public record NumeroSucursal(String value) {
    public NumeroSucursal {
        if(value==null || value.isBlank()){
            throw new IllegalArgumentException("El número de la sucursal no puede ser nulo o estar vacío");
        }else if(!value.matches("\\d+")){
            throw new IllegalArgumentException("El número de la sucursal solo puede tener números");
        }
    }
}