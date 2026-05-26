package co.edu.udec.finanzas_bancarias.domain.valueobjects;

import java.math.BigDecimal;

public record Saldo(BigDecimal value) {
    public Saldo{
        if(value == null){
            throw new IllegalArgumentException("El saldo no puede ser nulo");
        }else if(value.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }
    }
}
