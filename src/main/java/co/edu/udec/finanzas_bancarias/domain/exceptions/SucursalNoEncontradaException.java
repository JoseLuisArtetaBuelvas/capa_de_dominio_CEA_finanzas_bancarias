package co.edu.udec.finanzas_bancarias.domain.exceptions;

public class SucursalNoEncontradaException extends RuntimeException {
    public SucursalNoEncontradaException(String message) {
        super(message);
    }
}
