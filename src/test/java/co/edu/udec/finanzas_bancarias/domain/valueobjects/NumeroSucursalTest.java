package co.edu.udec.finanzas_bancarias.domain.valueobjects;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class NumeroSucursalTest {
    @Test
    public void debeCrearNumeroSucursalValido(){
        var numeroSucursal = new NumeroSucursal("00123");
        assertThat(numeroSucursal).isEqualTo(new NumeroSucursal("00123"));
    }

    @Test
    public void debeFallarConValorNulo(){
        assertThatThrownBy(()-> new NumeroSucursal(null)).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("nulo");
    }

    @Test
    public void debeFallarConValorVacío(){
        assertThatThrownBy(() -> new NumeroSucursal("")).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("vacío");
    }
}
