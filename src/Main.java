public class Main {

    /**
     * What the??… #RootsCoder?? Ich glaub ich steh im Wald!
     *
     * …dann aber hoffentlich in einem Mischwald. Sei ein produktiver Teil unseres Mischwald-Teams und bringe deine Stärken ein.
     * Denn wir brauche jetzt jemanden, der Käfer zählt! Irgendwie haben es die kleinen Biester geschafft sich einzuschleichen.
     * Wenn wir wissen, wie viele Käfer es schon sind, dann können wir die geeigneten Maßnahmen ergreifen und sie schnell los werden…da fällt dir gleich was ein?
     * Dann hau in die Tasten und rette unseren Wald: schreibe deine Methode für „findeKaeferInBaum(baum)“ and: #savethewoods
     *
     * Kleine Info für alle, die jetzt nicht so im Baumthema drin sind: eine Monokultur kann sich nicht gut wehren.
     * Nicht gegen Sturm, nicht gegen Trockenheit und auch nicht gegen Schädlinge. Aber ein Mischwald, der aus individuell gewachsenen Bäumen besteht,
     * die sich gegenseitig helfen und beschützen – der kann das wohl. Seine Wurzeln arbeiten symbiotisch nicht nur mit Pilzen – auch untereinander.
     *
     * Die Kronen lassen kleineren Bäumen Licht und stärken diese somit. Sie kommunizieren auch über Duftstoffe und warnen vor Gefahr.
     * So kann ein gesunder Baum dank einer Warnung ein spezielles Harz produzieren, welches Käfer abschreckt. Eben Teamwork und Rücksichtnahme. Der Mischwald.
     */
    public static void main(String[] args) {
        // Baum wird gebaut
        Baum baum = Baum.zufallsBaum();
        // Lösung
        int anzahlKaefer = findeKaeferInBaum(baum);
        System.out.println("Der Baum hat " + anzahlKaefer + " Käfer");
    }
    static int zaehler;

    static int findeKaeferInBaum(Baum baum) {
        // Bitte hier die Lösung eintragen
    	if (baum.getAeste()!=null) {
    		for (int i = 0; i<baum.getAeste().size(); i++) {
    			findeKaeferInAst(baum.getAeste().get(i));
    		}
    	}
    	int ergebnis = zaehler;
    	zaehler = 0;
        return ergebnis;
    }
    
    static void findeKaeferInAst (Ast ast) {
    	for (int i = 0; i<ast.getBlaetter().size(); i++) {
        	if (ast.getBlaetter().get(i).hatKaefer()) {
        		zaehler++;
        	}
    	}
    	if (ast.getAeste() != null) {
    		for (int i = 0; i<ast.getAeste().size(); i++) {
    			findeKaeferInAst(ast.getAeste().get(i));
    		}
    	}	
    }
}