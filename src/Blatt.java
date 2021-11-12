public class Blatt {
    private final boolean kaefer;

    public Blatt(boolean kaefer) {
        this.kaefer = kaefer;
    }

    public static Blatt zufallsBlatt() {
        int zahl = (int) ((Math.random() * 10) + 1);
        if (zahl % 7 == 0 || zahl % 11 == 0) {
            return new Blatt(true);
        } else {
            return new Blatt(false);
        }
    }

    public boolean hatKaefer() {
        return kaefer;
    }
}
