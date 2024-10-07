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
        goal = g;
    }
}
