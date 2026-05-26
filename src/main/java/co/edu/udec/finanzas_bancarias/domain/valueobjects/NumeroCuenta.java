package co.edu.udec.finanzas_bancarias.domain.valueobjects;

//Record es para crear clases inmutables más cortas
public record NumeroCuenta(String value) {
    public NumeroCuenta {
        if(value==null || value.isBlank()){
            throw new IllegalArgumentException("El número de la cuenta no puede ser nulo o estar vacío");
        }
        if (!value.matches("\\d+")) {
            throw new IllegalArgumentException("El número de cuenta solo puede contener dígitos");
        }
    }
}
