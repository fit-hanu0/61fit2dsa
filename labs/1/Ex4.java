package tut1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input a list of N  names : ");
        int n = Integer.valueOf(sc.nextLine());
        // create array
        String[] array = new String[n];
        for(int i = 0; i <array.length; i++) {
            System.out.print("input  the list of names: ");
            array[i] = sc.nextLine();
        }
        System.out.println("Which name do you want to search ?");
        String searchName = sc.next ();
        boolean name = false;
        int nameIndex = 0;
        for (int i = 0; i < n; i++) {
            if (array[i].equals(searchName)) {
                name = true;
                nameIndex = i;
                System.out.println("The index of searching name is: " + nameIndex + 1);
            } else {
                System.out.println(-1);
            }
        }
    }
}
