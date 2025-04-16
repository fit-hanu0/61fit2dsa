/**
 * Class GVertex implements the graph Vertex ADT that is introduced in lecture 12.
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package Example1;
public class GVertex
{
    private int index;
    private int row;
    private int column;
    private boolean marked;
    private int numOfAdjVertex;
    private int[] adjVertex;
    /**
     * Constructor for objects of class GVertex
     */
    public GVertex(int index, char[][] map, int m, int n)
    {

    }
    
    public int getIndex()
    {

    }
    
    public int getRow()
    {

    }
    
    public int getColumn()
    {

    }
    
    public boolean getMarked()
    {
    }
    
    public void setMarked(boolean marked)
    {

    }
    
    public int getNumOfAdjVertex()
    {

    }
    
    public int[] getAdjVertex()
    {

    }
    
    public String toString()
    {
        String s = String.format("Vertex: %d Row: %d Column: %d Marked: %b numOfAdjVertex: %d%n {",index,row,column,marked,numOfAdjVertex);
        for (int i=0; i<numOfAdjVertex; i++)  {
            String s1 = String.format("%d ",adjVertex[i]);
            s+=s1;
        }
        return s+"}";
    }
}
