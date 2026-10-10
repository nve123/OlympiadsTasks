import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int maxPossibleSum = n * (k - 1);
        long[] dp = new long[maxPossibleSum + 1];
        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            long[] nextDp = new long[maxPossibleSum + 1];
            for (int digit = 0; digit < k; digit++) {
                for (int sum = 0; sum <= maxPossibleSum; sum++) {
                    if (dp[sum] > 0 && sum + digit <= maxPossibleSum) {
                        nextDp[sum + digit] += dp[sum];
                    }
                }
            }
            dp = nextDp;
        }

        long totalLuckyTickets = 0;
        for (int sum = 0; sum <= maxPossibleSum; sum++) {
            totalLuckyTickets += dp[sum] * dp[sum];
        }

        System.out.println(totalLuckyTickets);
    }
}
