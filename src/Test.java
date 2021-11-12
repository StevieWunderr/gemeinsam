import java.util.Collections;
import java.util.List;

public class Test {

    private static final Baum TEST_BAUM = new Baum(List.of(
            new Ast(
                    Collections.emptyList(),
                    List.of(
                            new Ast(List.of(
                                    new Blatt(true),
                                    new Blatt(false),
                                    new Blatt(true)
                            ), Collections.emptyList()),
                            new Ast(List.of(
                                    new Blatt(true),
                                    new Blatt(false),
                                    new Blatt(false)
                            ), List.of(
                                    new Ast(
                                            List.of(
                                                    new Blatt(true),
                                                    new Blatt(true)
                                            ),
                                            Collections.emptyList()
                                    )
                            ))
                    )),
            new Ast(
                    List.of(
                            new Blatt(false),
                            new Blatt(false),
                            new Blatt(true)
                    ),
                    Collections.emptyList()
            )
    ));

    // diese Methode kannst du nutzen, um das Ergebnis deiner Routine gegen einen Baum mit bekannter Blätterzahl zu testen
    public static void main(String[] args) {
        int anzaehlKaeferLautRoutine = Main.findeKaeferInBaum(TEST_BAUM);
        System.out.println("Anzahl Käfer im Baum ist laut Routine " + anzaehlKaeferLautRoutine + ", sollte 6 sein");
    }

}
