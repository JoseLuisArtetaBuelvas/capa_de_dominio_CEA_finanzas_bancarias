package co.edu.udec.finanzas_bancarias.domain.exceptions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CuentaNoEncontradaExceptionTest {

    @Test
    public void debeCrearExcepcionConMensaje(){
        var excepcion = new CuentaNoEncontradaException("Cuenta no encontrada");
        assertThat(excepcion.getMessage()).isEqualTo("Cuenta no encontrada");
    }

    @Test
    public void debeSerInstanciaDeRuntimeException(){
        var excepcion = new CuentaNoEncontradaException("error");
        assertThat(excepcion).isInstanceOf(CuentaNoEncontradaException.class);
    }

    @Test
    public void debeLanzarseEnContextoCorrecto(){
        assertThatThrownBy(()->{
            throw new CuentaNoEncontradaException("error");
        }).isInstanceOf(CuentaNoEncontradaException.class).hasMessageContaining("error");
    }
}
