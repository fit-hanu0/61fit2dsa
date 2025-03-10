package tut1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input a list of N int: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i=0;  i<n; i++) {
            System.out.print("input data element " + i+ ": ");
            array[i] =sc.nextInt();
        }
        int max = array[0];
        for (int num : array) {
            if(max < num) {
                max = num;
            }
        }
        System.out.println("the maximum integer of the list: " + max);
    }
}
