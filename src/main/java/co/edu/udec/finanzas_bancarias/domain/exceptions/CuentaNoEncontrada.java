package co.edu.udec.finanzas_bancarias.domain.exceptions;

public class CuentaNoEncontrada extends RuntimeException {
    public CuentaNoEncontrada(String message) {
        super(message);
    }
}
