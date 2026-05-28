package co.edu.udec.finanzas_bancarias.domain.events;
import java.time.Instant;

public record CuentaAbiertaEvent(String CCC, Instant fecha) {
}
