import java.util.Scanner;
//import it.unibs.fp.mylib.*;

	public class TamaMain {

	public static void main(String[] args) {
		System.out.println("Ciao questo è TabaBase, dai un nome al tuo Tama");
		
			Scanner scanner = new Scanner(System.in);
			String nome = scanner.nextLine();
			System.out.print("Inserisci valore per sazietà: ");
			int sazieta = scanner.nextInt();
			System.out.print("Inserisci valore per  Soddisfazione: ");
			int  soddisfazione = scanner.nextInt();
			scanner.close();
			System.out.println(nome + " " + sazieta + " " + soddisfazione );
		
	
	}
	}
