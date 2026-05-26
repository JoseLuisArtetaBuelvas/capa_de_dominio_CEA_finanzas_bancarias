package co.edu.udec.finanzas_bancarias.domain.exceptions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class SaldoInsuficienteExceptionTest {

    @Test
    public void debeCrearExcepcionConMensaje() {
        var excepcion = new SaldoInsuficienteException("Saldo insuficiente para realizar el retiro");
        assertThat(excepcion.getMessage()).isEqualTo("Saldo insuficiente para realizar el retiro");
    }

    @Test
    public void debeSerInstanciaDeRuntimeException(){
        var excepcion = new SaldoInsuficienteException("error");
        assertThat(excepcion).isInstanceOf(SaldoInsuficienteException.class);
    }

    @Test
    public void debeLanzarseEnContextoCorrecto(){
        assertThatThrownBy(()->{
            throw new SaldoInsuficienteException("error");
        }).isInstanceOf(SaldoInsuficienteException.class).hasMessageContaining("error");
    }

}
