import java.util.ArrayDeque;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayDeque<Integer> shelf = new ArrayDeque<>();
        ArrayDeque<Integer> actions = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int numAction = in.nextInt();
            if(numAction < 3){
                int numDvd = in.nextInt();
                if (numAction == 1) {
                    shelf.addFirst(numDvd);
                }else {
                    shelf.addLast(numDvd);
                }
                actions.addFirst(numAction);
            } else {
                actions.addFirst(numAction);
            }
        }
        for (int i = 0; i < n; i++) {
            int numAction = actions.pollLast();
            if(numAction > 2){
                if(numAction == 3){
                    System.out.println(shelf.pollFirst());
                } else if (numAction == 4) {
                    System.out.println(shelf.pollLast());
                }
            }
        }
    }
}
