import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(final String[] args) throws IOException {

        final InputStreamReader sReader = new InputStreamReader(System.in);
        final BufferedReader buffer = new BufferedReader(sReader);

        int a = 0;
        int number = 0;
        a = Integer.parseInt(buffer.readLine());
        for (int i = 0; i < a; i++) {
            number = Integer.parseInt(buffer.readLine());

            verificarSinal(number);
        }
    }

    private static String verificarImparPar(int number) {

        if (number % 2 == 0 || number % 2 == -0) {
            return "EVEN";
        }
        if (number % 2 == 1 || number % 2 == -1) {
            return "ODD";
        }
        return null;
    }

    private static void verificarSinal(int number) {
        String imparOuPar = verificarImparPar(number);
        float sinal = Math.signum(number);

        if (sinal == 0) {
            System.out.println("NULL");
        } else {
            if (sinal == 1) {
                System.out.println(imparOuPar + " POSITIVE");
            }
            if (sinal == -1) {
                System.out.println(imparOuPar + " NEGATIVE");
            }
        }
    }

}