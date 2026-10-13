import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        if(n % 10 != 0){
            System.out.println((n / 10) + 1);
        } else {
            System.out.println(n / 10);
        }
    }
}
