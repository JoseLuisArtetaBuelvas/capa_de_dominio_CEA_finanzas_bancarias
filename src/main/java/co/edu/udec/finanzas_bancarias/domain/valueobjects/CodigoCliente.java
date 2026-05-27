package co.edu.udec.finanzas_bancarias.domain.valueobjects;

public record CodigoCliente(String value) {
    public CodigoCliente {
        if (value == null) {
            throw new IllegalArgumentException("El código del cliente no puede ser nulo");
        }
        if (value.isBlank()) {
            throw new IllegalArgumentException("El código del cliente no puede estar vacío");
        }
        if (!value.matches("\\d+")) {
            throw new IllegalArgumentException("El código del cliente solo puede contener dígitos");
        }
    }
}
