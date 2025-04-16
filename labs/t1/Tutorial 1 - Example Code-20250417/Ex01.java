/*import java.util.Scanner;
public class Ex01 {

  public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 1st floating-point number: ");
        double numberOne = scanner.nextDouble();
        System.out.print("Input 2nd floating-point number: ");
        double numberTwo = scanner.nextDouble();
        

        numberOne = Math.round(numberOne * 1000);
        numberOne = numberOne / 1000;
        
        System.out.println(numberOne);
        

        numberTwo = Math.round(numberTwo * 1000);
        numberTwo = numberTwo / 1000;
        
        System.out.println(numberTwo);
        
        if (numberOne == numberTwo)
        {
            System.out.println("Two numbers are the same up to three decimal places");
        }
        else
        {
            System.out.println("Two numbers are different");
        }
    }
}
*/
import java.math.RoundingMode;  
import java.text.DecimalFormat;  
public class Ex01   
{  
//constructor of the DecimalFormat class  
private static final DecimalFormat decfor = new DecimalFormat("0.00");  
public static void main(String args[])   
{  
//defining a number of type double   
double num = 123.9876543567;  
System.out.println("Double Number: " + num);  
System.out.println("Double Number: " + decfor.format(1.246));    //123.99  
//DecimalFormat, default is RoundingMode.HALF_EVEN  
decfor.setRoundingMode(RoundingMode.DOWN);  
System.out.println("\nBefore Rounding: " + decfor.format(num));  //123.98  
decfor.setRoundingMode(RoundingMode.UP);  
System.out.println("After Rounding Up: " + decfor.format(num));    //123.99  
}  
}  