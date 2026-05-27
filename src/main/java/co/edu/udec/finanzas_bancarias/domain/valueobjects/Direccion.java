package co.edu.udec.finanzas_bancarias.domain.valueobjects;

public record Direccion(String value) {
    public Direccion{
        if(value==null || value.isEmpty()){
            throw new IllegalArgumentException("Direccion no puede ser nula o vacía");
        }
    }
}
