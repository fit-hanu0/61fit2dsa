
import java.util.Random;

public class MaxSubSum
{

    /**
     * Algorithm 1 : Brute force search
     * 
     */
	//O(n^3)
    public static int FindMaxSubSeqSum1(int [] a)
    {
        int maxSum=a[0];
        
        for (int i=0; i<a.length; i++)
            for (int j=i; j<a.length; j++)
            {
                int thisSum=0;
                for (int k=i; k<=j; k++)
                    thisSum+=a[k];
                if (thisSum>maxSum)
                    maxSum=thisSum;
            }       
        
        return maxSum;

    }
    /**
     * Algorithm 2 : Improved brute force search
     *     
     *     O(n^2)
     */
    public static int FindMaxSubSeqSum2(int [] a)
    {
        int maxSum=a[0];
        
        for (int i=0; i<a.length; i++)
        {
            int thisSum=0;            
            for (int j=i; j<a.length; j++)
            {
                thisSum+=a[j];
                if (thisSum>maxSum)
                    maxSum=thisSum;
            }       
        }
        return maxSum;

    }
    /**
     * Algorithm 3 : Divide and conquer method
     * 
     * O(n*logn)
     */
    public static int FindMaxSubSeqSum3(int [] a, int left, int right)
    {
        //Base case
        if (left == right)
        {
        	return a[left];
                
        }
        int center=(left + right) / 2;
        
        int maxLeftSum = FindMaxSubSeqSum3(a, left, center);
        int maxRightSum = FindMaxSubSeqSum3(a, center+1, right);
        
        int maxLeftBorderSum=a[center], leftBorderSum=0;
        for (int i= center; i>= left; i--)
        {
            leftBorderSum+=a[i];
            if (leftBorderSum > maxLeftBorderSum)
                maxLeftBorderSum=leftBorderSum;            
        }

        int maxRightBorderSum=a[center+1], rightBorderSum=0;

        for (int i= center+1; i<= right; i++)
        {
            rightBorderSum+=a[i];
            if (rightBorderSum > maxRightBorderSum)
                maxRightBorderSum=rightBorderSum;            
        }
        int y = max3(maxLeftSum, maxRightSum, maxLeftBorderSum + maxRightBorderSum);

        return y;
    }
    
    public static int max(int a, int b)
    {
        if (a>b)
            return a;
        else
            return b;
    }
    public static int max3(int a, int b, int c)
    {
        return max(a,max(b,c));
    }    

    /**
     * Algorithm 4 : Linear version
     * 
     * O(n)
     */
    

    
    public static int FindMaxSubSeqSum4(int [] a)
    {
        int maxSum=a[0];

        int thisSum=0;
        for (int i=0; i<a.length; i++)//O(n)
        {
            thisSum+=a[i];
            if (thisSum > maxSum)
                maxSum=thisSum;
            if (thisSum < 0)
                thisSum=0;
        }
        return maxSum;
    }    
    
    public static void print_array(int [] a)
    {
        System.out.println("The list of integers is:");
        for (int i=0; i<a.length; i++)
        {
           System.out.print(a[i]+" ");
        }        
        System.out.println(" ");
    }
    
    public static void main(String[]args)
    {
        int [] data;
        int n=1000;
        data=new int[n];
    
        
        Random rand = new Random(); 
        for (int i=0; i<n; i++)
        {
            data[i]=rand.nextInt(2*n)-n;// [-n,n-1]
        }
        
    	
        print_array(data);
        
        long startTime, stopTime, elapsedTime;
        startTime=System.currentTimeMillis();

        System.out.println("The maximum subsequence sum is: " + FindMaxSubSeqSum1(data));        
        stopTime=System.currentTimeMillis();
        elapsedTime=stopTime - startTime;
        System.out.println("Algorithm 1 took : " + elapsedTime + " milliseconds to finish");
        
        startTime=System.currentTimeMillis();
        System.out.println("The maximum subsequence sum is: " + FindMaxSubSeqSum2(data));                
        stopTime=System.currentTimeMillis();
        elapsedTime=stopTime - startTime;
        System.out.println("Algorithm 2 took : " + elapsedTime + " milliseconds to finish");

        startTime=System.currentTimeMillis();        
        System.out.println("The maximum subsequence sum is: " + FindMaxSubSeqSum3(data,0,data.length-1));                        
        stopTime=System.currentTimeMillis();
        elapsedTime=stopTime - startTime;
        System.out.println("Algorithm 3 took : " + elapsedTime + " milliseconds to finish");

        startTime=System.currentTimeMillis();
        System.out.println("The maximum subsequence sum is: " + FindMaxSubSeqSum4(data));                                
        stopTime=System.currentTimeMillis();
        elapsedTime=stopTime - startTime;
        System.out.println("Algorithm 4 took : " + elapsedTime + " milliseconds to finish");

    }    
}
