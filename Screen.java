/**
 * Prints things out to the screen, when needed
 */
public class Screen {
    private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;

        // Observador 1: imprime o dígito mais recente.
        model.addObserver(digit -> System.out.println(digit));

        // Observador 2: imprime "Agora discando <numero>..." quando
        // o número estiver completo (12 dígitos).
        model.addObserver(digit -> {
            if (model.getDigits().size() == 12) {
                StringBuilder sb = new StringBuilder();
                for (int d : model.getDigits()) {
                    sb.append(d);
                }
                System.out.println("Agora discando " + sb + "...");
            }
        });
    }
}