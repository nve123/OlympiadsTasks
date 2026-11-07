import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            long n = sc.nextLong();
            Set<Long> a = new HashSet<>();
            if (n % 3 == 2) {
                System.out.println(-1);
                continue;
            }
            int cnt = 0;
            while (!a.contains(n)) {
                if (n % 3 == 2) {
                    System.out.println(-1);
                    break;
                }
                a.add(n);
                if (n % 3 == 0) {
                    n = n / 3;
                } else n = 2 * n + 1;
                cnt++;
                if (a.contains(n)) {
                    System.out.println(cnt);
                    break;
                }
            }
        }
    }
}
