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

        short mestreKung = 0;
        short mestreLu = 0;

        mestreKung = Short.parseShort(buffer.readLine());
        mestreLu = Short.parseShort(buffer.readLine());

        if ((mestreLu - 1) / 2 == (mestreKung - 1) / 2)
            System.out.println("oitavas");
        else if ((mestreLu - 1) / 4 == (mestreKung - 1) / 4)
            System.out.println("quartas");
        else if ((mestreLu - 1) / 8 == (mestreKung - 1) / 8)
            System.out.println("semifinal");
        else
            System.out.println("final");
    }
}