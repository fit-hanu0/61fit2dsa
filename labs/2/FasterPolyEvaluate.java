package tut2;

/**
 * Class FasterPolyEvaluate provides a quick solution to evaluate the value of a polynomial of degree n.
 * The time complexity of this algorithm is O(N)
 * @author (nxthang)
 * @version (1.0)
 */

import java.util.Scanner;

public class FasterPolyEvaluate {
    /**
     * Constructor for objects of class FasterPolyEvaluate
     */
    public FasterPolyEvaluate()
    {
    }

    public static void print_poly(double [] a)
    {
        System.out.println("The polynomial is:");
        for (int i=a.length-1; i>0; i--)
        {
            if (i != 1)
                System.out.print(a[i] + "*x^" + i + " + ");
            else
                System.out.print(a[i] + "*x" + " + ");
        }
        System.out.println(a[0]);
    }

    public static double Evaluate(double [] a, double x)
    {
        double s=0;
        for (int i=a.length-1; i>=0; i--)
        {
            s=s*x+a[i];
        }
        return s;
    }

    public static double RecEvaluate(double [] a, double x, int index)
    {
        //Base case
        if (index==a.length-1)
            return a[index];
        else
            return x*RecEvaluate(a,x,index+1)+a[index];
    }
    public static void main(String[]args)
    {
        int n;
        double [] c;
        double x;

        System.out.println("Please enter the degree n of the polynomial:");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();

        c=new double[n+1];

        for (int i=0; i<c.length; i++)
        {
            System.out.println("Please enter the coefficient c["+i+"]:");
            c[i]=scanner.nextDouble();
        }
        print_poly(c);

        System.out.println("Please enter the value of x:");
        x=scanner.nextDouble();

        System.out.println("The value P(" + x + ") = " + Evaluate(c,x));
        System.out.println("Using a recursive method, the value P(" + x + ") = " + RecEvaluate(c,x,0));
    }
}
