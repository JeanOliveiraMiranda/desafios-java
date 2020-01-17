import java.io.*;

class Main {
    private static String string;

    public static void main(final String... args) throws IOException {
        final InputStreamReader isr = new InputStreamReader(System.in);
        final BufferedReader in = new BufferedReader(isr);
        int qtde = 0;

        // meu codigo ,3
        qtde = Integer.parseInt(in.readLine());
        String lines = "";

        for (int i = 0; i < qtde; i++) {
            lines = in.readLine();
            String strSpace = lines.replaceAll("\\s+", " ");
            String[] vals = strSpace.trim().split(" ");
            String valores = "";

            // System.out.println(vals[i]);
            for (String item : vals) {

                if (item != null && item.length() > 0) {

                    final char firstLetter = item.charAt(0);
                    valores = valores.concat(Character.toString(firstLetter));
                }
            }

            System.out.println(valores);
        }
    }
}
