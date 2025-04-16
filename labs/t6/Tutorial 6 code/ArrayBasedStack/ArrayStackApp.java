/**
 * Write a description of class ArrayStackApp here.
 * 
 * @author (nxthang) 
 * @version (1.0)
 */

package ArrayBasedStack;
public class ArrayStackApp
{
    /**
     * Constructor for objects of class ArrayStackApp
     */
    public ArrayStackApp()
    {
    }

    public static void copyStack(ArrayStack scr, ArrayStack des)
    {
        ArrayStack tmp=new ArrayStack();
        String item;
        do
        {
            item=scr.pop();
            if (item != null)
                tmp.push(item);
        }
        while (item != null);
        //src empty
        //des empty
        
        /*item=scr.pop();
        while(item!=null)
        {
        	tmp.push(item);
        	item=scr.pop();
        }*/       		
        
        
        do
        {
            item=tmp.pop();
            if (item != null)
            {
                scr.push(item);
                des.push(item);
            }
        }
        while (item != null);        
    }
    
    public static void printStack(ArrayStack st)
    {
        ArrayStack tmp=new ArrayStack();
        copyStack(st,tmp);
        String item;
        do
        {
            item=tmp.pop();
            if (item != null)
                System.out.println(item);
        }
        while (item != null);
    }
    
    public static void main(String[]args)
    {    	
        ArrayStack s=new ArrayStack();
        System.out.println("Push three items into the stack:");                
        s.push("One");
        s.push("Two");
        s.push("Three");
        System.out.println("Print out all stack's items:");
        printStack(s);//s: one two three (#top)
        System.out.println("The current top item of the stack is: "+s.peek());//three
        System.out.println("Pop one item from the stack. Returned item is: "+s.pop());//three
        System.out.println("Now, the current top item of the stack is: "+s.peek());//two
        System.out.println("Push two items into the stack:");        
        s.push("Four");
        s.push("Five");        
        //s: one two four five (#top)
        
        ArrayStack s1=new ArrayStack();        
        copyStack(s,s1);
        //s1=s;
        System.out.println("Copy s to s1. Print out all s1's items:");
        printStack(s1);



    }    
}
