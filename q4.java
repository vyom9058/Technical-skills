// given an array A. find and return the product array of the same size where product[i] is equal to the product of all the elements divided by the i-th element of array A.    

import java.util.Scanner;

public class ProductArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int[] product = new int[n];
        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    prod *= A[j];
                }
            }
            product[i] = prod;
        }

        System.out.println("Product Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(product[i] + " ");
        }
    }
}
