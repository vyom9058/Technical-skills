//Given an array count number of elements having atleast 1 element greater than itself.

public class Count {

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 2, 5, 7};
        int n = arr.length;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                count++;
            }
        }
        int elementCount = n - count;
        System.out.print(elementCount);
    }
}
