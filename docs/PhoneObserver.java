/**
 * Observador de dígitos do telefone.
 * A UI implementa esta interface para ser notificada a cada novo dígito.
 */
public interface PhoneObserver {
    void onDigit(int digit);
}