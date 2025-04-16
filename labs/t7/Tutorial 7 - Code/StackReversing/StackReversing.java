/**
 * Class StackReversing demonstrates the algorithm to reverse a stack using a queue.
 * In the main function of the class, the starting stack s, that contains charater item
 * is reversed using a queue q.
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package Example2;
public class StackReversing
{
    /**
     * Constructor for objects of class StackReversing
     */
    public StackReversing()
    {
    }

    public static void copyStack(SLLStack scr, SLLStack des)
    {
        SLLStack tmp=new SLLStack();
        StackNode node;
        do
        {
            node=scr.pop();
            if (node != null)
                tmp.push(node);
        }
        while (node != null);
        do
        {
            node=tmp.pop();
            if (node != null)
            {
                scr.push(node);
                des.push(node);
            }
        }
        while (node != null);        
    }
    
    public static void printStack(SLLStack s)
    {
        SLLStack tmp=new SLLStack();
        copyStack(s,tmp);
        StackNode node;
        do
        {
            node=tmp.pop();
            if (node != null)
                System.out.print(node.getData()+" ");
        }
        while (node != null);
        System.out.println(" ");
    }
    
    public static void main (String[]args) 
    {
        System.out.println("Create a stack s to store some character items");                

        SLLStack s = new SLLStack();
        for (char c = 'a'; c<='z'; c++)
        {
            StackNode newnode = new StackNode(c);
            s.push(newnode); 
           
        }
        //Stack s: a b c ....z #top
        System.out.println("The original stack");                 
        printStack(s);

        ArrayQueue q = new ArrayQueue();
        while (!s.isEmpty())
        {
            StackNode node = s.pop();//pop z; pop y  ....                 
            q.enqueue(node.getData());//enqueue z; enqueue y...
            
        }
        //Stack s: empty
        //Queue q: #front z y x...c b a # rear 
        while (!q.isEmpty())
        {
            StackNode newnode = new StackNode(q.dequeue());//dequeue z; dequeue y;...;dequeue a
            s.push(newnode);//push z; push y....push a
        }

        System.out.println("The reversed stack");                 
        printStack(s);
        //Stack s: z y x....c b a #top
    }   
}
