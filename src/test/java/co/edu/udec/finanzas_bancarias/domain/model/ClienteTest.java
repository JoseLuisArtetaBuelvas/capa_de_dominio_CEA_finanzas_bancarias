package co.edu.udec.finanzas_bancarias.domain.model;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.CodigoCliente;
import co.edu.udec.finanzas_bancarias.domain.valueobjects.Direccion;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
public class ClienteTest {

    @Test
    public void debeCrearClienteValido(){
        var cliente = new Cliente(new CodigoCliente("11935842254"), "José Luis Arteta Buelvas", new Direccion("Calle 123 # 45-67"));
        assertThat(cliente.getCodigoCliente().value()).isEqualTo("11935842254");
        assertThat(cliente.getNombre()).isEqualTo("José Luis Arteta Buelvas");
        assertThat(cliente.getDireccion().value()).isEqualTo("Calle 123 # 45-67");
    }

    @Test
    public void debeFallarConCodigoClienteNulo(){
        assertThatThrownBy(()-> new Cliente(null, "José Luis Arteta Buelvas", new Direccion("Calle 123 # 45-67"))).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("código");
    }

    @Test
    public void debeFallarConNombreNulo(){
        assertThatThrownBy(()-> new Cliente(new CodigoCliente("11935842254"), null, new Direccion("Calle 123 # 45-67"))).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("nombre");
    }

    @Test
    public void debeFallarConDireccionNula(){
        assertThatThrownBy(()-> new Cliente(new CodigoCliente("11935842254"), "José Luis Arteta Buelvas", null)).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("dirección");
    }
}
