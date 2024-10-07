package giocatore;
import java.util.Scanner;

public class TestGiocatore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Giocatore[] squadra = new Giocatore[10];
        int numGiocatori = 0;
        int scelta;
        do {
            System.out.println("\nScegli un'opzione:");
            System.out.println("1. Aggiungi un giocatore");
            System.out.println("2. Visualizza tutti i giocatori");
            System.out.println("3. Modifica un giocatore");
            System.out.println("4. Cancella un giocatore");
            System.out.println("5. Visualizza giocatori con più di 5 gol");
            System.out.println("6. Visualizza il capitano");
            System.out.println("7. Assegna il capitano in modo casuale");
            System.out.println("0. Esci");
            scelta = in.nextInt();
            switch (scelta) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 0:
                    System.out.println("uscita dal programma in corso...");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        } while (scelta != 0);
    }
}
