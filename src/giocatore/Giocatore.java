package giocatore;

public class Giocatore {
    private String nome;
    private boolean capitano;
    private int goal;

    public Giocatore (){
        nome = "";
        capitano=false;
        goal = 0;
    }
    public Giocatore (String n, boolean cap,int g){
        nome = n;
        capitano = cap;
        if (g >= 0) {
            goal = g;
        } else {
            System.out.println("Il numero di gol deve essere positivo, Assegnato 0 gol.");
            goal = 0;
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String n) {
        nome = n;
    }
    public boolean getCapitano() {
        return capitano;
    }
    public void setCapitano(boolean cap) {
        capitano = cap;
    }
    public int getGoal() {
        return goal;
    }
    public void setGoal(int g) {
        if (g >= 0) {
            goal = g;
        } else {
            System.out.println("Il numero di gol deve essere positivo, Assegnato 0 gol.");
            goal = 0;
        }
    }
}
