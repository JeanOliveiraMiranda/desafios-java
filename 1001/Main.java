import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        InputStreamReader sReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(sReader);

        int a = 0;
        int b = 0;

        a = Integer.parseInt(buffer.readLine());
        b = Integer.parseInt(buffer.readLine());

        System.out.println("X = " + (a + b));
    }

}