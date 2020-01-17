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

        int ddd = 0;

        ddd = Integer.parseInt(buffer.readLine());

        getCity(ddd);

    }

    private static void getCity(int ddd) {
        switch (ddd) {
        case 61:
            System.out.println("Brasilia");
            break;
        case 71:
            System.out.println("Salvador");
            break;
        case 11:
            System.out.println("Sao Paulo");
            break;
        case 21:
            System.out.println("Rio de Janeiro");
            break;
        case 32:
            System.out.println("Juiz de Fora");
            break;
        case 19:
            System.out.println("Campinas");
            break;
        case 27:
            System.out.println("Vitoria");
            break;
        case 31:
            System.out.println("Belo Horizonte");
            break;
        default:
            System.out.println("DDD nao cadastrado");
        }
    }
}