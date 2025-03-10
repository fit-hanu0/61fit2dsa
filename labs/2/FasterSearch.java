package tut2;

/**
 * An ordered array is an array of integers that all elements are sorted:
 *         A[1]<A[2]<A[3]<A[4]<…<A[n]
 * For an integer M, we want to determine if there exists an integer i such that A[i]=M.
 * Class FasterSearch presents a solution for this problem, which uses divide and conquer method.
 * The time complexity of this algorithm is O(logN)
 *
 */

import java.util.Scanner;

public class FasterSearch {
    /**
     * Constructor for objects of class FasterSearch
     */
    public FasterSearch()
    {
    }

    public static void print_array(int [] a)
    {
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }

    public static int Search(int [] a, int m, int left, int right)
    {
        while (left <= right)
        {
            int mid = (int) ((left + right)/2);
            if (a[mid] == m)
                return mid;
            else
            {
                if (m < a[mid])
                    right=mid-1;
                else
                    left=mid+1;
            }
        }
        return -1;
    }

    public static int RecSearch(int []a, int m, int left, int right)
    {
        //Base case
        if (left == right-1)
        {
            if (a[left]==m)
                return left;
            if (a[right]==m)
                return right;
            return -1;
        }
        else
        {
            int mid = (int) ((left + right)/2);
            if (a[mid] == m)
                return mid;
            else
            {
                if (m < a[mid])
                    return (RecSearch(a,m,left,mid));
                else
                    return (RecSearch(a,m,mid,right));
            }
        }
    }
    public static void main(String[]args)
    {
        int n,m;
        int [] a;

        System.out.println("Please enter the integer n:");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();

        a=new int[n];

        for (int i=0; i<a.length; i++)
        {
            System.out.println("Please enter the integer a["+i+"]:");
            a[i]=scanner.nextInt();
        }

        System.out.println("Please enter the integer m for searching:");
        m=scanner.nextInt();

        System.out.println("The search result is: " + Search(a,m,0,a.length-1));
        System.out.println("The search result is (using recursive version): " + RecSearch(a,m,0,a.length-1));
    }
}
