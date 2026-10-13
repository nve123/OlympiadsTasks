import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int n = in.nextInt();
        int[] frames = new int[n];
        for (int i = 0; i < n; i++) {
            frames[i] = in.nextInt();
        }

        Arrays.sort(frames);
        int corect = 0;

        for (int i = frames.length - 1; i > 0; i--) {
            if (frames[i] <= r) {
                if (frames[i] == frames[i - 1]) {
                    corect = frames[i];
                    break;
                }
            }
        }

            System.out.println(corect);
    }
}
