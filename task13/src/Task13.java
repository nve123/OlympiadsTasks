import java.util.Queue;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long lFree = 0;
        long rFree = 0;
        long lastEnter = 0;
        long total = 1;
        for (int i = 0; i < n; i++) {
            long t = in.nextLong();
            long dur = Math.abs(t);

            if(t < 0){
                long st = Math.max(lastEnter, lFree);
                lFree = st + dur;
                lastEnter = st;
            } else {
                long st = Math.max(lastEnter, rFree);
                rFree = st + dur;
                lastEnter = st;
            }
        }
        total = Math.max(lFree, rFree);
        System.out.println(total);
    }
}
