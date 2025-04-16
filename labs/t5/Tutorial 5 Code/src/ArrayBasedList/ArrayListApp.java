/**
 * Write a description of class ArrayListApp here.
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package ArrayBasedList;
public class ArrayListApp
{

    /**
     * Constructor for objects of class ArrayListApp
     */
    public ArrayListApp()
    {
    }

    public static void printList(ArrayList list)
    {
        int l=list.getLength();
        String str="";
        for (int i=1; i<=l; i++)
        {
            str=str+list.get(i)+"  ";
        }
        System.out.println(str);
    }

    public static void main(String[]args)
    {
        ArrayList myList=new ArrayList();
        myList.add(1,100);//100
        myList.add(2,200);//100 200
        myList.add(2,300);//100 300 200
        myList.add(4,400);//100 300 200 400
        printList(myList); //myList: 
      
        myList.remove(2);//100 200 400
        
        System.out.println(myList.getLength());//3
        printList(myList);//
        System.out.println("Is the list empty? " + myList.isEmpty());
        myList.removeAll();//myList empty
        System.out.println("Is the list empty? " + myList.isEmpty());        
        myList.add(1,1000);
        myList.add(2,2000);
        printList(myList);//1000 2000
    }    
}
