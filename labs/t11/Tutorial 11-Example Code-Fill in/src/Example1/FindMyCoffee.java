
/**
 * Write a description of class FindMyCoffee here.
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package Example1;
public class FindMyCoffee
{
    private static int m=5;
    private static int n=8;
    private static char[][] map={
                            {'G','G','G','G','G','X','G','G'},
                            {'G','G','G','G','G','X','G','G'},
                            {'G','G','G','G','G','X','G','C'},                            
                            {'G','G','X','G','G','G','G','G'},
                            {'Y','G','X','G','G','G','G','G'}
                        };
    private static GVertex startVertex,endVertex;                    
    private static int numOfVertex=0;
    private static GVertex[] listVertex;
    private static GVertex[] path;
    /**
     * Constructor for objects of class FindMyCoffee
     */
    public FindMyCoffee()
    {
    }
    
    private static void constructGraph()
    {	

    }
    
    private static boolean BFS(GVertex s, GVertex t)
    {

    }
    
    //path[0] -> path[39]:
    //path[33]=Vertex(32)
    //path[32]=Vertex(25)
    //path[25]=Vertex(18)
    //.....
    //path[23]=Vertex(22)
    private static void showPath(GVertex src, GVertex des)
    {

    }
    
    public static void main(String[]args)
    {
        constructGraph();
        BFS(startVertex,endVertex);
    }
}
