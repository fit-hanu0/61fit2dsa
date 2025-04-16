
/**
 * Radix sort assumes that each element in the input array has m digits,
 * where digit 1 is the lowest-order digit and digit m is the highest-order digit.
 * The time complexity of the algorithm is O(M*(N+10)).
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
import java.util.Scanner;

public class RadixSort
{

    public static void print_array(int [] a)
    {
        for (int i=0; i<a.length; i++)
        {
           System.out.print(a[i]+" ");
        }        
        System.out.println(" ");
    }

    /**
     * This method calculates the value of digit d of an integer x, where digit 1 is the lowest-order digit.
     * For example, Digit(549,1) returns 9, Digit(549,2) retunrs 4, and Digit(549,3) returns 5.
     * The following formula is used to find the value of digit d of an integer x:
     *          Digit(x,d) = (x / 10^(d-1)) % 10
     * @author (nxthang) 
     * @version (1.0)
     */
    
    public static int Digit(int x, int d)
    {//Digit(329,2)

        int p=1;
        for (int i=0; i< d-1; i++)//X //i:0-0
            p=p*10;//1//10
 
        return (x/p)%10;//return 9//return 2 
    }

    /**
     * This method sorts the array based on the value of digit d (column d), where digit 1 is the lowest-order digit.
     * For example, if input array a = [329,457,657,839,436,720,355]. 
     * The result of Colum_Sort(a,b,1) will be:
     *      b = [720,355,436,457,657,329,839]
     * Or the result of Colum_Sort(a,b,2) will be:
     *      b = [329,720,839,436,457,657,355]
     * Counting sort algorithm is used as a stable sort method (with m=9 because the range of elements
     * in counting sort is 0..9).     
     * 
     * @author (nxthang) 
     * @version (1.0)
     */
    
    public static void Column_Sort(int [] a, int [] b, int d)
    {//CS(a,b,1)
    	//a: 9 7 7 9 6 0 5
    	
        int [] c;
        c=new int[10];
        for (int i=0; i<=9; i++)
            c[i]=0;//c: 0000000000
            
        for (int i=0; i<a.length; i++)
        {
            int dg=Digit(a[i],d);//return each digit in a[i]
            c[dg]=c[dg]+1;  
        }      
        for (int i=1; i<=9; i++)
            c[i]=c[i]+c[i-1];
        for (int i=a.length-1; i>=0; i--)
        {
        	int dg=Digit(a[i],d); 
            b[c[dg]-1]=a[i];
            c[dg]=c[dg]-1;
        }
        //
        System.out.println("Array b: Sorted array in column "+d+"(digit "+d+")");
        print_array(b);//b: 0 5 6 7 7 9 9
    }   
    
     /**
     * This method implements Radix sort algorithm to sort an input array a, where each element has m digits.
     * The result is stored in array b.
     * 
     * @author (nxthang) 
     * @version (1.0)
     */
    public static void Radix_Sort(int [] a, int [] b, int m)
    {//RS(a,b,3)
        for (int i=1; i<=m; i++)
        {
            Column_Sort(a,b,i);//CS(a,b,1)
          

            //copy array b to array a
            for (int j=0;j<a.length;j++)
            {
            	a[j]=b[j];
            }
            System.out.println("\narray a");
            print_array(a);
            System.out.println("array b");
            print_array(b);
            
        }  
    }

    public static void main(String[]args)
    {
        int n,m;
        int [] a; 
        int [] b;
        
        System.out.println("Please input the integer N:");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();        
        System.out.println("Please input the integer M:");
        m=scanner.nextInt();        

        a=new int[n];
        b=new int[n];
        
        for (int i=0; i<n; i++)
        {
            System.out.println("Please input the integer a["+i+"]" + "(a["+i+"] must have "+m+" digits):");
            a[i]=scanner.nextInt();
        }        
  
        System.out.println("The list of integers is: ");
        print_array(a);
  
        Radix_Sort(a,b,m);
        
        System.out.println("The list of sorted integers is: ");       
        print_array(b);        

    }
    
}
