import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long y = in.nextLong();
        long xz = x - 1;
        long yz = y - 1;
        long rx = xz / 4;
        long px = xz % 4;
        long ry = yz / 4;
        long py = yz % 4;
        if (rx == ry &&(px / 2 == py / 2)){
            System.out.println(1);
        } else if (ry == rx &&((px == 1 && py == 2) || (px == 2 && py == 1))) {
            System.out.println(2);
        } else if (Math.abs(rx - ry) == 1 && (px / 2 == py / 2)) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }

    }
}
