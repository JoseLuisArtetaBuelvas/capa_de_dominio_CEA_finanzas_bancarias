package co.edu.udec.finanzas_bancarias.domain.enums;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class SexoTest {

    @Test
    public void esFemenino(){
        var sexo = Sexo.FEMININO;
        assertThat(sexo).isEqualTo(Sexo.FEMININO);
    }

    public void esMasculino(){
        var sexo = Sexo.MASCULINO;
        assertThat(sexo).isEqualTo(Sexo.MASCULINO);
    }

    public void debeFallarConValorInexistente(){
        assertThatThrownBy(()->Sexo.valueOf(null)).isInstanceOf(IllegalArgumentException.class);
    }
}
