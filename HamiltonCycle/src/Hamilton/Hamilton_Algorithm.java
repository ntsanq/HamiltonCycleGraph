package Hamilton;
import static Hamilton.Graph_Panel.redline_array;
import java.util.Arrays;
import static Hamilton.MainFrame.final_path;
public class Hamilton_Algorithm
{
    private int V, pathCount;
    private int[] path;     
    private int[][] graph;
    
    Hamilton_Algorithm(){
    }
    
     //**tim chu trình**//
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
            System.out.println("\nNo path");
            final_path += "Can't find Hamilton cycle in this graph";

        }
        catch (Exception e)
        {
            display();
        }
    }
    
    // **đệ quy**// 
    public void solve(int node) throws Exception
    {
        //kết quả
        if (graph[node][0] == 1 && pathCount == V)
            throw new Exception("\nKet qua duong di Hamilton la:");
        /** all vertices selected but last vertex not linked to 0 **/
        
        if (pathCount == V)
            return;
 
        for (int v = 0; v < V; v++)
        {
            //nếu connected
            if (graph[node][v] == 1 )
            {
                //thì add vô path           
                path[pathCount++] = v;    
                //bỏ connection           
                graph[node][v] = 0;
                graph[v][node] = 0;
 
                //nếu đỉnh chưa được đi qua
                if (!isPresent(v))
                    solve(v);
 
                // restore lại connection
                graph[node][v] = 1;
                graph[v][node] = 1;
                // bỏ path
                path[--pathCount] = -1;                    
            }
        }
    }    
    
    //check xem path có được đi qua chưa
    public boolean isPresent(int v)
    {
        for (int i = 0; i < pathCount - 1; i++)
            if (path[i] == v)
                return true;
        return false;                
    }
    
    // display ra màn hình kết quả
    public void display()
    {
        System.out.println("\nChu trình : ");
        
        redline_array = new int[V+1];
        
        for (int i = 0; i <= V; i++){
           System.out.print(path[i % V]+1 +"  ");
           final_path+= path[i % V]+1 + " ";
           redline_array[i] =  path[i % V]+1;
        }
        
    }    
   
}