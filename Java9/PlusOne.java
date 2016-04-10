import java.io.BufferedInputStream;
import java.util.Scanner;

class PlusOne {
    public static void main(String argv[]) throws Exception {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int x, y;
        while(true) {
            x = in.nextInt();
            y = x + 1;
            System.err.println("(+1) " + x + " => " + y);
            System.out.println("" + y);
        }
    }
}
