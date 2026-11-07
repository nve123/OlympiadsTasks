import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int k = in.nextInt();
        if(((k - 1) * (a - b)) + a <= 0 ){
            System.out.println(a);
        } else {
            System.out.println(((k - 1) * (a - b)) + a);
        }
    }
}
