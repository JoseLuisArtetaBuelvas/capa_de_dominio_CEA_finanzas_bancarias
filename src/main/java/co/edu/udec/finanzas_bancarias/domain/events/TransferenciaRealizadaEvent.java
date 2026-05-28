package co.edu.udec.finanzas_bancarias.domain.events;
import java.time.Instant;

public record TransferenciaRealizadaEvent(String cccOrigen, String cccDestino, Instant fecha) {
}
