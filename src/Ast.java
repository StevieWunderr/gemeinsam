import java.util.ArrayList;
import java.util.List;

public class Ast {
    private final List<Blatt> blaetter;
    private final List<Ast> aeste;

    public Ast(List<Blatt> blaetter, List<Ast> aeste) {
        this.blaetter = blaetter;
        this.aeste = aeste;
    }

    //Initialisierung der Blätter und Äste
    public static Ast zufallsAst() {
        int anzahlAeste = (int) (((Math.random() * 10) + 1) % 4);// zwischen 0 und 3 Äste
        int anzahlBlaetter = (anzahlAeste + 1) * (int) ((Math.random() * 10) + 10);// zwischen 10 und 76 Blätter
        List<Ast> aeste = new ArrayList<>();
        List<Blatt> blaetter = new ArrayList<>();
        // Es gibt keine neuen Äste, wenn die Anzahl Äste durch 3 Teilbar ist oder kein Rest übrig bleibt
        if (anzahlAeste == 0 || anzahlAeste % 3 != 0) {
            for (int i = 1; i <= anzahlAeste; i++) {
                aeste.add(Ast.zufallsAst());
            }
        }
        // Blätter
        for (int i = 1; i <= anzahlBlaetter; i++) {
            blaetter.add(Blatt.zufallsBlatt());
        }
        System.out.println("Ast mit " + anzahlAeste + " Äste und " + anzahlBlaetter + " Blätter");
        return new Ast(blaetter, aeste);
    }

    public List<Blatt> getBlaetter() {
        return blaetter;
    }

    public List<Ast> getAeste() {
        return aeste;
    }
}
