import java.util.Random;

class dice {
    private Random rand = new Random();

    public int roll6() {
        int a;
        do { a = rand.nextInt(7); } while (a == 0);
        return a;
    }

    public int roll10() {
        int a;
        do { a = rand.nextInt(11); } while (a == 0);
        return a;
    }

    public int roll20() {
        int a;
        do { a = rand.nextInt(21); } while (a == 0);
        return a;
    }
}
