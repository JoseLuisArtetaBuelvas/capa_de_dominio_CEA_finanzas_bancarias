package co.edu.udec.finanzas_bancarias.domain.valueobjects;

public record CCC (String value){
    public CCC {
        if (value == null) {
            throw new IllegalArgumentException("El CCC no puede ser nulo");
        }
        if (value.isBlank()) {
            throw new IllegalArgumentException("El CCC no puede estar vacío");
        }
        if (!value.matches("\\d+")) {
            throw new IllegalArgumentException("El CCC solo puede contener dígitos");
        }
    }
}
