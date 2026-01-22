
public class InsertElement {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        int pos = 2;
        int element = 99;
        int[] newArr = new int[n + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < pos) {
                newArr[i] = arr[i];
            } else if (i == pos) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        System.out.println("Array after insertion:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
