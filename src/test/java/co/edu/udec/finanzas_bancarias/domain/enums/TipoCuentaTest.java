package co.edu.udec.finanzas_bancarias.domain.enums;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class TipoCuentaTest {

    @Test
    public void debeContenederValorAhorros(){
        var tipo = TipoCuenta.AHORRO;
        assertThat(tipo).isEqualTo(TipoCuenta.AHORRO);
    }

    @Test
    public void debeContenederValorCorriente(){
        var tipo = TipoCuenta.CORRIENTE;
        assertThat(tipo).isEqualTo(TipoCuenta.CORRIENTE);
    }

    @Test
    public void debeFallarConValorInexistente(){
        assertThatThrownBy(()->TipoCuenta.valueOf(null)).isInstanceOf(IllegalArgumentException.class);
    }
}
