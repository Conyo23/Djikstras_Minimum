
  
public class DjikstraMin
{
    private static int V;
    int minKey(int key[], Boolean mstSet[]) 
    { 
        // Initialize min value 
        int min = Integer.MAX_VALUE, min_index=-1; 
  
        for (int v = 0; v < V; v++) 
            if (mstSet[v] == false && key[v] < min) 
            { 
                min = key[v]; 
                min_index = v; 
            } 
  
        return min_index; 
    } 
 
    public void printMST(int parent[], int n, int graph[][]) 
    { 
        System.out.println("Edge \tWeight"); 
        for (int i = 1; i < V; i++) 
            System.out.println(parent[i]+" - "+ i+"\t"+ 
                            graph[i][parent[i]]); 
    }
    public void primMST(int graph[][]) 
    {
        int parent[] = new int[V];
        int key[] = new int [V];
        Boolean mstSet[] = new Boolean[V];
        for (int i = 0; i < V; i++) 
        { 
            key[i] = Integer.MAX_VALUE; 
            mstSet[i] = false; 
        }
        key[0] = 0;
        parent[0] = -1;
 
        for (int count = 0; count < V-1; count++) 
        {
            int u = minKey(key, mstSet); 
            mstSet[u] = true;
            for (int v = 0; v < V; v++) 
                
                if (graph[u][v]!=0 && mstSet[v] == false && 
                    graph[u][v] < key[v]) 
                { 
                    parent[v] = u; 
                    key[v] = graph[u][v]; 
                } 
        } 
  
        // print the constructed MST 
        printMST(parent, V, graph); 
    } 
  
    public static void main (String[] args) 
    {
        V= 8;
        DjikstraMin t = new DjikstraMin(); 
                                  // A  B  C  D  E  F  G  H
        int grapha[][] =new int[][]{{0, 2, 0, 0, 0, 3, 0, 0}, //A
                                    {2, 0, 5, 0, 4, 0, 3, 0}, //B
                                    {0, 5, 0, 0, 2, 0, 0, 4}, //C
                                    {0, 0, 0, 0, 2, 4, 2, 0}, //D
                                    {0, 4, 2, 2, 0, 0, 0, 3}, //E
                                    {3, 0, 0, 4, 0, 0, 1, 0}, //F
                                    {0, 3, 0, 2, 0, 1, 0, 1}, //G
                                    {0, 0, 4, 0, 3, 0, 1, 0}  //H
        };
        t.primMST(grapha);
        V=7;
        t = new DjikstraMin(); 
                                  // A  B  C  D  E  F  G  H
        int graphb[][] =new int[][]{{0, 2, 6, 4, 0, 0, 0}, //A
                                    {2, 0, 2, 0, 6, 0, 0}, //B
                                    {6, 2, 0, 1, 3, 0, 0}, //C
                                    {4, 0, 1, 0, 2, 3, 0}, //D
                                    {0, 6, 3, 2, 0, 0, 5}, //E
                                    {0, 0, 0, 3, 0, 0, 4}, //F
                                    {0, 0, 0, 0, 5, 4, 0}, //G
        };
        t.primMST(graphb); 
        V= 8;
        t = new DjikstraMin(); 
                                  // A  B  C  D  E  F  G  H
        int graphc[][] =new int[][]{{0, 1, 0, 5, 0, 2, 0, 0}, //A
                                    {1, 0, 0, 0, 2, 0, 0, 0}, //B
                                    {0, 0, 0, 0, 4, 0, 0, 1}, //C
                                    {5, 0, 0, 0, 3, 0, 2, 0}, //D
                                    {0, 2, 4, 2, 0, 0, 2, 0}, //E
                                    {2, 0, 0, 3, 0, 0, 4, 0}, //F
                                    {0, 0, 0, 0, 2, 4, 0, 5}, //G
                                    {0, 0, 1, 2, 0, 0, 5, 0}  //H
        };
        t.primMST(graphc);
        V= 8;
        t = new DjikstraMin(); 
                                  // A  B  C  D  E  F  G  H
        int graphd[][] =new int[][]{{0, 1, 0, 2, 0, 0, 0, 0}, //A
                                    {1, 0, 2, 0, 3, 0, 0, 0}, //B
                                    {0, 2, 0, 4, 0, 0, 0, 0}, //C
                                    {2, 0, 4, 0, 2, 2, 0, 0}, //D
                                    {0, 3, 0, 2, 0, 5, 0, 3}, //E
                                    {0, 0, 0, 2, 5, 0, 4, 5}, //F
                                    {0, 0, 0, 0, 0, 4, 0, 1}, //G
                                    {0, 0, 0, 0, 3, 5, 1, 0}  //H
        };
        t.primMST(graphd);
    } 
}


