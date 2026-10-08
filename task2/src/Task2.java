import java.util.ArrayDeque;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayDeque<Integer> shelf = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int numAction = in.nextInt();
            if (numAction < 3) {
                int numDvd = in.nextInt();
                if (numAction == 1) {
                    shelf.addFirst(numDvd);
                } else {
                    shelf.addLast(numDvd);
                }
            } else {
                if (numAction == 3) {
                    System.out.println(shelf.pollFirst());
                } else if (numAction == 4) {
                    System.out.println(shelf.pollLast());
                }
            }
        }

    }
}
