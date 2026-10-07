import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = 0;
        long b = 0;
        long c = 0;
        int M = in.nextInt();
        int N = in.nextInt();
        int v = in.nextInt();
        int h = in.nextInt();
        int[] X = new int[v];
        int[] Y = new int[h];
        int[][] S = new int[N][M];
        for (int i = 0; i < v; i++) {
            int xi = in.nextInt();
            X[i] = xi;
            for (int j = 0; j < N; j++) {
                S[j][0 + xi - 1] = 1;
            }
        }
        for (int i = 0; i < h; i++) {
            int yi = in.nextInt();
            Y[i] = yi;
            for (int j = 0; j < M; j++) {
                S[0 + yi - 1][j] = 1;
            }
        }

        c = (M * v) + (N * h) - (h * v);

        for (int i = 1; i < N - 1; i++) {
            for (int j = 1; j < M - 1; j++) {
                if (S[i][j] == 0 && S[i - 1][j] == 1 || S[i][j] == 0 && S[i][j - 1] == 1 || S[i][j] == 0 && S[i + 1][j] == 1 || S[i][j] == 0 && S[i][j + 1] == 1) {
                    S[i][j] = 2;
                    a++;
                }
                if (S[i][j] == 0 && S[i - 1][j] == 2 || S[i][j] == 0 && S[i][j - 1] == 2 || S[i][j] == 0 && S[i + 1][j] == 2 || S[i][j] == 0 && S[i][j + 1] == 2) {
                    S[i][j] = 3;
                    b++;
                }
            }
        }
        System.out.println(a + " " + b + " " + c);
    }
}
