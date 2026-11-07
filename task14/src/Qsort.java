import java.util.Arrays;

public class Qsort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        QSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void QSort(int[] arr, int low, int high){
        if(low < high) {
            int pl = arr[low + (high - low) / 2];
            int i = low;
            int j = high;

            while (i <= j){
                while (arr[i] < pl) i++;
                while (arr[j] > pl) j--;
                if (i <= j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }
            if (low < j) {
                QSort(arr, low, j);
            }
            if (high > i) {
                QSort(arr, i, high);
            }
        }
    }
}
