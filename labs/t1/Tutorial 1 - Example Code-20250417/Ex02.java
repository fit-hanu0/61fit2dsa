import java.util.Random;
import java.util.Scanner;

public class Ex02
{
    public static void main(String[]args)
    {
        int n;
        int [] a;
        
        System.out.println("Please input the integer N:");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        a = new int[n];
        
        Random rand = new Random(); 
        for (int i=0; i<n; i++)
        {
            a[i]=rand.nextInt(100)-10;
        }        
        
        System.out.println("The list of " + n + " integers is:");
        for (int i=0; i<n; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");     
        scanner.close();
    }
}
