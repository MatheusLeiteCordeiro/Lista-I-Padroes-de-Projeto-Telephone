import java.util.ArrayList;
import java.util.List;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel {
    private final List<Integer> digits = new ArrayList<>();
    private final List<PhoneObserver> observers = new ArrayList<>();

    public void addObserver(PhoneObserver observer) {
        observers.add(observer);
    }

    public void addDigit(int newDigit) {
        digits.add(newDigit);
        notifyObservers(newDigit);
    }

    public List<Integer> getDigits() {
        return digits;
    }

    private void notifyObservers(int newDigit) {
        for (PhoneObserver observer : observers) {
            observer.onDigit(newDigit);
        }
    }
}