import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = j; k < n; k++) {
                    if (i + j + k == n){
                       cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
