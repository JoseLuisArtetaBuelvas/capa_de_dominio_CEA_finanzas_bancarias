package co.edu.udec.finanzas_bancarias.domain.valueobjects;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class NumeroCuentaTest {

    @Test
    public void debeCrearNumeroCuentaValido(){
        var numeroCuenta = new NumeroCuenta("1234567890");
        assertThat(numeroCuenta).isEqualTo(new NumeroCuenta("1234567890"));
    }

    @Test
    public void debeFallarConValorNulo(){
        assertThatThrownBy(()-> new NumeroCuenta(null)).isInstanceOf(IllegalArgumentException.class).hasMessageContaining(null);
    }

    @Test
    public void debeFallarConValorVacio(){
        assertThatThrownBy(() -> new NumeroCuenta("")).isInstanceOf(NumeroCuenta.class).hasMessageContaining("vacío");
    }
}
