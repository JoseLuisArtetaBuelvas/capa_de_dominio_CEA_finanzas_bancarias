package co.edu.udec.finanzas_bancarias.domain.events;
import java.time.Instant;

public record CuentaCerradaEvent(String ccc, Instant fecha) {
}
