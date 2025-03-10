package tut1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" please input a list of N integers :");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i=0;  i<n; i++) {
            System.out.print("input data element " + i+ ": ");
            array[i] =sc.nextInt();
        }
        Arrays.sort(array);
        for (int numb : array) {
            System.out.println("the sort list  in ascending order: " + numb);
        }
    }
}
