import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder text = new StringBuilder(new String());
        while (in.hasNext()) {
            text.append(in.nextLine());
        }
        char[] chars = text.toString().toCharArray();
        int countB = 0;
        int countG = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'B' || chars[i] == 'b') {
                countB++;
            } else if ((chars[i] == 'G' || chars[i] == 'g')) {
                countG++;
            }
        }

        if (countB == countG) {
            System.out.println(text + " is" + " NEUTRAL");
        } else if (countB > countG) {
            System.out.println(text + " is" + " A BADDY");
        } else if (countG > countB) {
            System.out.println(text + " is" + " GOOD");
        }
    }
}
