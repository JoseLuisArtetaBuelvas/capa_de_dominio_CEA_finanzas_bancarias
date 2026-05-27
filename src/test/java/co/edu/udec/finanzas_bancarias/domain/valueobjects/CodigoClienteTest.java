package co.edu.udec.finanzas_bancarias.domain.valueobjects;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CodigoClienteTest {
    @Test
    public void debeCrearCodigoClienteValido(){
        var codigoCliente = new CodigoCliente("1193542254");
        assertThat(codigoCliente).isEqualTo(new CodigoCliente("1193542254"));
    }

    @Test
    public void debeFallarConValorNulo(){
        assertThatThrownBy(()-> new CodigoCliente(null)).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("nulo");
    }

    @Test
    public void debeFallarConValorVacío(){
        assertThatThrownBy(() -> new CodigoCliente("")).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("vacío");
    }
}
