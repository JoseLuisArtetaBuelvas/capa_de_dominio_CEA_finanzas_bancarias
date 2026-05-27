package co.edu.udec.finanzas_bancarias.domain.valueobjects;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.*;

public class SaldoTest {

    @Test
    public void debeTenerSaldoValido(){
        var saldo = new Saldo(new BigDecimal("1000"));
        assertThat(saldo.value()).isEqualTo(new BigDecimal("1000"));
    }

    @Test
    public void debeFallarConValorNulo(){
        assertThatThrownBy(()-> new Saldo(null)).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("nulo");
    }

    @Test
    public void debeFallarConValorNegativo(){
        assertThatThrownBy(() -> new Saldo(new BigDecimal("-1000"))).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("negativo");
    }
}
