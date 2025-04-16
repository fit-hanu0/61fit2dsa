/**
 * Write a description of class ArrayQueueApp here.
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package ArrayBasedQueue;
public class ArrayQueueApp
{
    /**
     * Constructor for objects of class ArrayQueueApp
     */
    public ArrayQueueApp()
    {
    }

    public static void copyQueue(ArrayQueue scr, ArrayQueue des)
    {
        ArrayQueue tmp=new ArrayQueue();
        char item;
        do
        {
            item=scr.dequeue();
            if (item != '\u0000')
                tmp.enqueue(item);
        }
        while (item != '\u0000');
        
        do
        {
            item=tmp.dequeue();
            if (item != '\u0000')
            {
                scr.enqueue(item);
                des.enqueue(item);
            }
        }
        while (item != '\u0000');        
    }
    
    public static void printQueue(ArrayQueue q)
    {
        ArrayQueue tmp=new ArrayQueue();
        copyQueue(q,tmp);
        char item;
        do
        {
            item=tmp.dequeue();
            if (item != '\u0000')
                System.out.print(item+" ");
        }
        while (item != '\u0000');
        System.out.println(" ");
    }

    public static void main(String[]args)
    {
        ArrayQueue q=new ArrayQueue();
        System.out.println("Enqueue three items into the queue:");     
        q.enqueue('A');
        q.enqueue('B');
        q.enqueue('C');
        //q: #front A B C  #rear
        System.out.println("Print out all queue's items:");
        printQueue(q);//Print: A B C
        System.out.println("The current front item of the queue is: "+q.peek());//A
        System.out.println("Dequeue one item from the queue. Returned item is: "+q.dequeue());//A
        System.out.println("Now, the current front item of the queue is: "+q.peek());//B
        System.out.println("Enqueue two items into the queue:");        
        q.enqueue('D');
        q.enqueue('E'); 
        //q: #front B C D E #rear
        q.dequeue();
        printQueue(q);//q: #front C D E #rear

        ArrayQueue q1=new ArrayQueue();
        copyQueue(q,q1);
        System.out.println("Copy q to q1. Print out all q1's items:");
        printQueue(q1);        
    }    
}
