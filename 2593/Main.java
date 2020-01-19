import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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

        String characters = "";
        characters = " " + buffer.readLine() + " ";
        int M = 0;
        M = Integer.parseInt(buffer.readLine());

        String words = "";
        words = buffer.readLine();

        for (int i = 0; i < M; i++) {
            String[] wordsToCompare = words.trim().split(" ");
            String[] charsToCompare = characters.trim().split(" ");

            String wordToCompare = wordsToCompare[i];
            ArrayList<String> arr = new ArrayList<String>();

            int indexes = -1;

            for (String item : charsToCompare) {
                if (item.equals(wordToCompare)) {

                    if (characters.contains(item)) {

                        indexes = characters.indexOf(" " + item + " ", indexes + 1);
                        arr.add(indexes + "");

                    }
                }
            }

            String res = String.join(" ", arr); // "foo and bar and baz"

           if (res.equals("")) {
              System.out.println(-1);
            } else {
             System.out.println(res);
            }
        }
    }
}