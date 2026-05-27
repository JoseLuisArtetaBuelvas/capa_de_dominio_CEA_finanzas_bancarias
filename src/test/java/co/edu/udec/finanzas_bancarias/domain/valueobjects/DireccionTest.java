package co.edu.udec.finanzas_bancarias.domain.valueobjects;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class DireccionTest {

    @Test
    public void debeCrearDireccionValida(){
        var direccion = new Direccion("Calle 123 # 45-67");
        assertThat(direccion).isEqualTo(new Direccion("Calle 123 # 45-67"));
    }

    @Test
    public void debeFallarConValorNulo(){
        assertThatThrownBy(() -> new Direccion(null)).isInstanceOf(IllegalArgumentException.class).hasMessage("nula");
    }

    @Test
    public void debeFallarConValorVacio(){
        assertThatThrownBy(() -> new Direccion("")).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("vacía");
    }
}
