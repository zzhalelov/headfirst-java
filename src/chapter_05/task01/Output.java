package chapter_05.task01;

public class Output {
    public static void main(String[] args) {
        Output o = new Output();
        o.go();
    }

    void go() {
        int y = 7;
        for (int x = 1; x < 7; x++) {
            y++;
            if (x > 4) {
                System.out.println(++y + " ");
            }
            if (y > 14) {
                System.out.println(" x  = " + x);
                break;
            }
        }
    }
}