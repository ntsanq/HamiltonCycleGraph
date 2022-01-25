package Hamilton;

import java.util.ArrayList;
class Connectivity
{
    int V;
    ArrayList<ArrayList<Integer> > adjListArray;
 
    // constructor
    Connectivity(int V)
    {
        this.V = V;
       
        adjListArray = new ArrayList<>();
 
        for (int i = 0; i < V; i++) {
            adjListArray.add(i, new ArrayList<>());
        }
    }
 
    void addEdge(int src, int dest)
    {
        adjListArray.get(src).add(dest);// 2 chiều vô hướng
        adjListArray.get(dest).add(src);
    }
 
    public static String connectivityString = "";
    
    void DFSUtil(int v, boolean[] visited)
    {
        visited[v] = true;
        if(v!=0){
            System.out.print(v + " ");
            connectivityString += v + " ";
        }
        
        // Recur cho tất cả các đỉnh
        // kề với đỉnh
        for (int x : adjListArray.get(v)) {
            if (!visited[x])
                DFSUtil(x, visited);
        }
    }
    
    void connectedComponents()
    {
        connectivityString = "";
        // Mark những đỉnh chưa được duyệt
        boolean[] visited = new boolean[V];
        for (int v = 1; v < V; ++v) {
            if (!visited[v]) {
                // in tất cả các đỉnh đã được duyệt
                // từ V
                        DFSUtil(v, visited);
                        connectivityString =  connectivityString + ".\n"; 
                        System.out.print("\n");
            }
        }

    }
    

}