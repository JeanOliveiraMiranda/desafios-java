import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int t=1, ANOS;
		int PA, PB;
		double G1, G2;
		
		t = sc.nextInt();
		while (t > 0) {

			PA = sc.nextInt();
			PB = sc.nextInt();
			G1 = sc.nextDouble();
			G2 = sc.nextDouble();
			
			ANOS = 0;
			
			while (PA <= PB){
				
				PA+= PA*(G1/100.0);
				PB+= PB*(G2/100.0);

				ANOS++;
				
				if (ANOS > 100){
					System.out.println("Mais de 1 seculo.");
					PA=PB+1;
				}
			}
			if (ANOS <= 100)
				System.out.printf("%d anos.\n",ANOS);
			
			t = t - 1;
			
		}
		sc.close();
	}
}