import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 13; i++) {
            int n = in.nextInt();
            sum += 60 / n;
        }
        System.out.println(sum);
    }
}
