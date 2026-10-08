import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = 0;
        long b = 0;
        long c = 0;
        int m = in.nextInt();
        int n = in.nextInt();
        int v = in.nextInt();
        int h = in.nextInt();
        int[] x = new int[v];
        int[] y = new int[h];
        int[][] s = new int[n][m];
        for (int i = 0; i < v; i++) {
            int xi = in.nextInt();
            x[i] = xi;
            for (int j = 0; j < n; j++) {
                s[j][0 + xi - 1] = 1;
            }
        }
        for (int i = 0; i < h; i++) {
            int yi = in.nextInt();
            y[i] = yi;
            for (int j = 0; j < m; j++) {
                s[0 + yi - 1][j] = 1;
            }
        }

        c = (m * v) + (n * h) - (h * v);

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                if (s[i][j] == 0 && s[i - 1][j] == 1 || s[i][j] == 0 && s[i][j - 1] == 1 || s[i][j] == 0 && s[i + 1][j] == 1 || s[i][j] == 0 && s[i][j + 1] == 1) {
                    s[i][j] = 2;
                    a++;
                }
                if (s[i][j] == 0 && s[i - 1][j] == 2 || s[i][j] == 0 && s[i][j - 1] == 2 || s[i][j] == 0 && s[i + 1][j] == 2 || s[i][j] == 0 && s[i][j + 1] == 2) {
                    s[i][j] = 3;
                    b++;
                }
            }
        }
        System.out.println(a + " " + b + " " + c);
    }
}
