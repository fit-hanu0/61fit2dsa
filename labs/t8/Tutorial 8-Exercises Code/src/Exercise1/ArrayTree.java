package Exercise1;
/**
 * Class ArrayTree implements Tree data structure using arrays. 
 * Tree's nodes are indexed using the numbering scheme introduced in Lecture.
 * Node has a string label that is stored in the l array. p array is used to store
 * parent-child relationship.
 * Please refers to Lecture and tutorial instruction for more detail on Tree's ADT.
 * @author (nxthang) 
 * @version (1.0)
 */
import java.util.Arrays;
public class ArrayTree
{
    private static final int maxSize=100; //Maximum possible number of nodes in the tree
    private int n;                        //Current number of nodes in the tree
    private String[] l;
    private int[] p;
    
    /**
     * Constructor for objects of class ArrayTree
     * Create an empty Tree.
     */
    public ArrayTree()
    {
        n=0;
        l=new String[maxSize];
        p=new int[maxSize];
        Arrays.fill(p,-2);
    }
    
    public boolean isFull()
    {
        return (n==maxSize-1);
    }
    
    public boolean isEmpty()
    {
        return (n==0);
    }
    
    public void addNode(String label, int parent)
    {
        if (!isFull())
        {
            if (parent==-1) //Adding a root node
            {
                l[0]=label;
                p[0]=-1;
            }
            else
            {
                //Finding a correct position in the array for the new node 
                int pos=parent+1;
                while ((pos<n)&&(getParent(pos)<=parent))
                {
                    pos++;
                }
                //Shift all array elements from pos one slot to the right
                for (int i=n;i>pos;i--)
                {
                    l[i]=l[i-1];
                    p[i]=p[i-1];
                }
                l[pos]=label;
                p[pos]=parent;
            }
            n++;
        }
    }

    public int getParent(int node)
    {
        return p[node];
    }
    
    public String getNodeLabel(int node)
    {
        if (node != -1)
            return l[node];
        else
            return null;
    }

    public void setNodeLabel(int node, String label)
    {
        l[node]=label;
    }
    
    public int leftMostChild(int node)
    {
        int i=node+1;
        //Find the first node i that i's parent is node (p[i]==node).
        while ((i<n)&&(getParent(i)!=node))
            i++;

        if (getParent(i)==node)
            return i;
        else
            return -1;
    }
    
    public int rightSibling(int node)
    {
        int i=node+1;
        //Find the first node i that i's parent is node's parent
        while ((i<n)&&(getParent(i)!=getParent(node))) 
            i++;       
        
        if (getParent(i)==getParent(node))
            return i;
        else    
            return -1;
    }
    
    public int getDegree(int node)
    {
        int count=0;
        for (int i=0; i<n; i++)
            if (p[i]==node)
                count++;
        return count;
    }
    
    public boolean isLeaf(int node)
    {
        return (getDegree(node) == 0);
    }
    
    public int countLeaves()
    {
        int count=0;
        for (int i=0; i<n; i++)
            if (isLeaf(i))
                count++;
        return count;
    }
    
    public int getLevel(int node)
    {
        int count=0;
        int tmp=node;
        while (getParent(tmp)!= -1)
        {
            tmp=getParent(tmp);
            count++;
        }
        return count;
    }
    
    public int getDepth()
    {
        int maxLevel=0;
        for (int i=0; i<n; i++)
            if (isLeaf(i))
            {
                int level=getLevel(i);
                if (maxLevel<level)
                    maxLevel=level;
            }
        return maxLevel;
    }
    
    public int search(String label)
    {
        for (int i=0;i<n;i++)
            if (l[i]==label)
                return i;
        return -1;
    }
}