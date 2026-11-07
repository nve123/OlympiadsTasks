import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }

        int max = 0;
        int min = 0;

        for (int i = 1; i < n - 1; i++) {
            if(num[i - 1] < num[i] && num[i] > num[i + 1]) {
                max++;
            } else if (num[i - 1] > num[i] && num[i] < num[i + 1]) {
                min++;
            }
        }
        System.out.println(min + " " + max);
    }
}
