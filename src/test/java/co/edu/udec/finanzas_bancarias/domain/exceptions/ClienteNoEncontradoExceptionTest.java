package co.edu.udec.finanzas_bancarias.domain.exceptions;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ClienteNoEncontradoExceptionTest {
    @Test
    public void debeCrearExcepcionConMensaje() {
        var excepcion = new ClienteNoEncontradoException("Cliente no encontrado");
        assertThat(excepcion.getMessage()).isEqualTo("Cliente no encontrado");
    }

    @Test
    public void debeSerInstanciaDeRuntimeException() {
        var excepcion = new ClienteNoEncontradoException("error");
        assertThat(excepcion).isInstanceOf(ClienteNoEncontradoException.class);
    }

    @Test
    public void debeLanzarseEnContextoCorrecto(){
        assertThatThrownBy(() -> {
            throw new ClienteNoEncontradoException("error");
        }).isInstanceOf(ClienteNoEncontradoException.class).hasMessageContaining("error");
    }
}
