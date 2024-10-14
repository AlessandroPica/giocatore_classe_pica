package giocatore;
import java.util.Scanner;
import java.util.Arrays;

public class TestGiocatore {
    static Scanner input = new Scanner(System.in);
    static Giocatore[] squadra;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        squadra = new Giocatore[10];
        int numGiocatori = 0;
        int scelta;
        for (int i = 0; i < numGiocatori; i++) {
            System.out.print("Inserisci il nome del giocatore: ");
            String nome = input.next();
            System.out.print("Il giocatore è capitano? (true/false): ");
            Boolean capitano = input.nextBoolean();
            capitano = (capitano);
            System.out.print("Inserisci il numero di goal segnati: ");
            int goals = input.nextInt();
            squadra[i] = new Giocatore(nome, capitano, goals);
        }
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
                    System.out.print("Inserisci il nome del giocatore: ");
                    String nome = input.next();
                    System.out.print("Il giocatore è capitano? (true/false): ");
                    Boolean capitano = input.nextBoolean();
                    capitano = (capitano);
                    System.out.print("Inserisci il numero di goal segnati: ");
                    int goals = input.nextInt();
                    inserisciGiocatore(nome, capitano, goals);
                    break;
                case 2:
                    System.out.println("la tua squadra è" + visualizzaSquadra());
                    break;
                case 3:
                    System.out.print("Inserisci il numero del giocatore da modificare: ");
                    int num = input.nextInt();
                    System.out.print("Inserisci il nuovo nome del giocatore: ");
                    String nome2 = input.next();
                    System.out.print("Il giocatore è capitano? (true/false): ");
                    Boolean capitano2 = input.nextBoolean();
                    System.out.print("Inserisci il numero di goal segnati: ");
                    int goals2 = input.nextInt();
                    modificaGiocatore(num, nome2, capitano2, goals2);
                    break;
                case 4:
                    System.out.print("Inserisci il numero del giocatore da rimuovere: ");
                    int num2 = input.nextInt();
                    rimuoviGiocatore(num2);
                    break;
                case 5:
                    System.out.println(visualizzaCinqueGoals());
                    break;
                case 6:
                    System.out.println(visualizzaCapitano());
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
    public static void inserisciGiocatore(String nome, Boolean capitano, int goals) {

        squadra = Arrays.copyOf(squadra, squadra.length+1);
        squadra[squadra.length-1] = new Giocatore(nome, capitano, goals);
    }
    public static String visualizzaSquadra() {
        String output = "";
        for (Giocatore giocatore : squadra) {
            output += "Nome: " + giocatore.getNome() + "\n" + "Capitano: " + giocatore.getCapitano() + "\n" + "Goal segnati: " + giocatore.getGoal() + "\n";
        }
        return output;
    }
    public static void modificaGiocatore(int n, String nome, Boolean capitano, int goals) {
        squadra[n].setNome(nome);
        squadra[n].setCapitano(capitano);
        squadra[n].setGoal(goals);
    }
    public static void rimuoviGiocatore(int n) {
        squadra[n] = squadra[squadra.length-1];
        squadra = Arrays.copyOf(squadra, squadra.length-1);

    }
    public static String visualizzaCinqueGoals() {
        String output = "";
        for (Giocatore giocatore : squadra) {
            if (giocatore.getGoal() >= 5) {
                output += "Nome: " + giocatore.getNome() + "\n" + "Capitano: " + giocatore.getCapitano() + "\n" + "Goal segnati: " + giocatore.getGoal() + "\n";
            }
        }
        return output;
    }
    public static String visualizzaCapitano() {
            for (Giocatore giocatore : squadra) {
                if (giocatore.getCapitano()) {
                    return giocatore.getNome() + " è il capitano";
                }
                return giocatore.getNome() + "non è il capitano!";
            }
            return null;
    }
}
