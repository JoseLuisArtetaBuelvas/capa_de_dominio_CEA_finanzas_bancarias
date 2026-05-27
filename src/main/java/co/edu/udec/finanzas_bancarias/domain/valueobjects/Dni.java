package co.edu.udec.finanzas_bancarias.domain.valueobjects;

public record Dni(String value) {
    public Dni{
        if(value==null || value.isBlank()){
            throw new IllegalArgumentException("El número del Dni no puede ser nulo o no puede estar vacío");
        }else if(value.matches("\\d+")){
            throw new IllegalArgumentException("El Dni solo puede contener números");
        }
    }
}
