/**
 * Write a description of class ShortestPath here.
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package Example2;
public class ShortestPath
{
    private static final int INF=100000;
    private static int n=8;
    private static int[][] w= {
                                {0,15,9,14,INF,INF,INF,INF},
                                {INF,0,INF,INF,20,INF,INF,44},
                                {INF,INF,0,INF,INF,INF,24,INF},
                                {INF,5,INF,0,30,INF,18,INF},
                                {INF,INF,INF,INF,0,11,INF,16},
                                {INF,INF,INF,INF,INF,0,6,6},
                                {INF,INF,INF,INF,2,INF,0,19},
                                {INF,INF,INF,INF,INF,INF,INF,0}                                
                              };
    private static char[] label;                          
    
    /**
     * Constructor for objects of class ShortestPath
     */
    public ShortestPath()
    {
    }
    
    public static void Dijkstra(int s)
    {

    }
    
    public static void BellmanFord(int s)
    {

    }
    
    public static void main(String[]args)
    {
        label = new char[n];
        label[0]='A'; label[1]='B'; label[2]='C';
        label[3]='D'; label[4]='E'; label[5]='F';
        label[6]='G'; label[7]='H'; 
        Dijkstra(0);
    }
}
