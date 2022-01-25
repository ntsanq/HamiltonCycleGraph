package Hamilton;
import java.util.Arrays;
import static Hamilton.MainFrame.final_path;
//import static Hamilton.MainFrame.VNumber;
public class Hamilton_Althorithm
{
    private int V, pathCount;
    private int[] path;     
    private int[][] graph;
    
    Hamilton_Althorithm(){
    
    }
    
 
    /** Function to find cycle **/
    public void findHamiltonianCycle(int[][] g)
    {
        V = g.length;
        path = new int[V];
 
        Arrays.fill(path, -1);
        graph = g;     
        
        try
        {            
            path[0] = 0;
            pathCount = 1;            
            solve(0);
            System.out.println("No path");
            final_path += "Can't find Hamilton cycle in this graph";
            
            //number of vertex
//            String s =Integer.toString(V);
//            VNumber = s;
        }
        catch (Exception e)
        {
            display();
        }
    }
    /** function to find paths recursively **/
    public void solve(int vertex) throws Exception
    {
        /** solution **/
        if (graph[vertex][0] == 1 && pathCount == V)
            throw new Exception("\nKet qua duong di Hamilton la:");
        /** all vertices selected but last vertex not linked to 0 **/
        
        if (pathCount == V)
            return;
 
        for (int v = 0; v < V; v++)
        {
            /** if connected **/
            if (graph[vertex][v] == 1 )
            {
                /** add to path **/            
                path[pathCount++] = v;    
                /** remove connection **/            
                graph[vertex][v] = 0;
                graph[v][vertex] = 0;
 
                /** if vertex not already selected  solve recursively **/
                if (!isPresent(v))
                    solve(v);
 
                /** restore connection **/
                graph[vertex][v] = 1;
                graph[v][vertex] = 1;
                /** remove path **/
                path[--pathCount] = -1;                    
            }
        }
    }    
    /** function to check if path is already selected **/
    public boolean isPresent(int v)
    {
        for (int i = 0; i < pathCount - 1; i++)
            if (path[i] == v)
                return true;
        return false;                
    }
    /** display solution **/
    public void display()
    {
        System.out.print("Path : ");
        for (int i = 0; i <= V; i++){
           System.out.print(path[i % V]+1 +"  ");
           final_path+= path[i % V]+1 + "  ";
        }
        
    }    
   
}