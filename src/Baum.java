import java.util.ArrayList;
import java.util.List;

public class Baum {
    private final List<Ast> aeste;

    // Initialisierung Baum
    public static Baum zufallsBaum() {
        List<Ast> aeste = new ArrayList<>();
        System.out.println("Baum: 3 Äste");
        for (int i = 1; i <= 3; i++) {
            aeste.add(Ast.zufallsAst());
        }
        return new Baum(aeste);
    }

    public Baum(List<Ast> aeste) {
        this.aeste = aeste;
    }

    public List<Ast> getAeste() {
        return aeste;
    }
}
