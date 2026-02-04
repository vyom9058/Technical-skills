// Objective:- given an array A of size n. in 1 second you can increase the value of 1 by 1. find the minimum time in seconds to make all elements of array equal.
//eg:- {1, 2,5,6} = it will take 10 seconds to make all elements equal to 6.
//Observation:- to minimise time make all elements equal we need to make all elements equal to maximum element of array.
//pseudocode:-
//1. find maximum element of array.
//2. for each element calculate how much it needs to be increase to reach the maximum number.
//3. sum all those differences and print it.

import java.util.Scanner;

public class ArrayEqual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int max = A[0];
        for (int i = 1; i < n; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        int time = 0;
        for (int i = 0; i < n; i++) {
            time += (max - A[i]);
        }
        System.out.println("Minimum time: " + time);
    }
}
