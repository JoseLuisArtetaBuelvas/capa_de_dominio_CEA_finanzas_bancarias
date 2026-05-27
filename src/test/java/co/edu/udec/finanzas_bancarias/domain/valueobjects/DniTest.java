package co.edu.udec.finanzas_bancarias.domain.valueobjects;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class DniTest {

    @Test
    public void debeCrearNumeroDniValido(){
        var dni = new Dni("12345");
        assertThat(dni.value()).isEqualTo("12345");
    }

    @Test
    public void debeFallarConValorNulo(){
        assertThatThrownBy(() -> new Dni(null)).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("nulo");
    }

    @Test
    public void debeFallarConValorVacio(){
        assertThatThrownBy(() -> new Dni("")).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("vacío");
    }
}
