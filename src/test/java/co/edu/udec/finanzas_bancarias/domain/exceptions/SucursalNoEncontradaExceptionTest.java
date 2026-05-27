package co.edu.udec.finanzas_bancarias.domain.exceptions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class SucursalNoEncontradaExceptionTest {

    @Test
    void debeCrearExcepcionConMensaje() {
        var excepcion = new SucursalNoEncontradaException("Sucursal no encontrada");
        assertThat(excepcion.getMessage()).isEqualTo("Sucursal no encontrada");
    }

    @Test
    void debeSerInstanciaDeRuntimeException() {
        var excepcion = new SucursalNoEncontradaException("error");
        assertThat(excepcion).isInstanceOf(SucursalNoEncontradaException.class);
    }

    @Test
    void debeLanzarseEnContextoCorrecto(){
        assertThatThrownBy(() -> {
            throw new SucursalNoEncontradaException("error");
        }).isInstanceOf(SucursalNoEncontradaException.class).hasMessageContaining("error");
    }

}
