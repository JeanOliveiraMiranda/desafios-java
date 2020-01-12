import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
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

        double R = 0;
        R = Double.parseDouble(buffer.readLine());

        final double area = (3.14159 * (R * R));

        DecimalFormat f = new DecimalFormat("##.0000");

        System.out.println("A=" +  f.format(area));

    }

}