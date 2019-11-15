/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;



/**
 *
 * @author fioro
 */
public class Matrix 
{
    static final int NO_PARENT = -1;	
    private final int numOfNodes;
    private final boolean directed;
    private final boolean weighted;
    private float[][] matrix;
    private boolean[][] isSetMatrix;
    static LinkedList<Task>  edges = new LinkedList(); //nodes in the shortest path
    static LinkedList<Integer> dists = new LinkedList<Integer>(); //l
    
    public Matrix(int numOfNodes) {

        this.directed = false;
        this.weighted = true;
        this.numOfNodes = numOfNodes;

        // Simply initializes our adjacency matrix to the appropriate size
        matrix = new float[numOfNodes][numOfNodes];
        isSetMatrix = new boolean[numOfNodes][numOfNodes];
    }
    
    public void addEdge(int source, int destination, float weight) {

        float valueToAdd = weight;

        if (!weighted) {
            valueToAdd = 1;
        }

        matrix[source][destination] = valueToAdd;
        isSetMatrix[source][destination] = true;

        if (!directed) {
            matrix[destination][source] = valueToAdd;
            isSetMatrix[destination][source] = true;
        }
    }
     public boolean hasEdge(int source, int destination) {
    return isSetMatrix[source][destination];
}

    /**
     *
     */
    public void printMatrix() {
        for (int i = 0; i < numOfNodes; i++) {
            for (int j = 0; j < numOfNodes; j++) {
                // We only want to print the values of those positions that have been marked as set
                if (isSetMatrix[i][j]) {
                    System.out.format("%8s", String.valueOf(matrix[i][j]));
                } else {
                    System.out.format("%8s", "/  ");
                }
            }
            System.out.println();
        }

    }
    public void shortestPath(Graph graph, int src, int dest) 
    {   edges.clear();
        dest = dest-1;
    // System.out.println("Destino: "+dest);
        src = src-1;
      //   System.out.println("Inicio: "+src);
        int n = matrix[0].length; 
        int[] shortest = new int[n]; 
        boolean[] added = new boolean[n]; 
        for (int v = 0; v < n;v++)  { 
            shortest[v] = Integer.MAX_VALUE; 
            added[v] = false; 
        } 
        shortest[src] = 0; 
        int[] parents = new int[n]; 
        parents[src] = NO_PARENT; 
 
        for (int i = 1; i < n; i++)  { 
            int v1 = -1; //store temp data
            int min = Integer.MAX_VALUE; 
            for (int v = 0;  v < n;  v++) { 
                if (!added[v] &&  shortest[v] < min) { 
                    v1 = v; 
                    min = shortest[v]; 
                } 
            } 
            added[v1] = true; 
            for (int v = 0; v < n; v++)  { 
                float dist = matrix[v1][v];                  
                if (dist > 0 && ((min + dist) <shortest[v])){ 
                    parents[v] = v1; 
                    shortest[v] = (int) (min + dist); 
                } 
            } 
        } 
        
        dists.insert(shortest[dest]);
        visitUtil(graph,dest, parents); 
    } 
    public static void visitUtil(Graph graph,int i,int[] parents)  { 	
        if (i == NO_PARENT)        	
            return; 
   	
        visitUtil(graph,parents[i], parents);
       
        Task toInsert = graph.findEdge(i+1);
        
        edges.insert(toInsert);
    } 
    public String path()
    {
        NodeLinkedList<Task>  temp = edges.head;
        //System.out.println(edges.amount);
        String path = "";
        while(temp!=null)
        {
            String toInsert = temp.getElement().getTipotarea();
            path+=toInsert+", ";
            temp = temp.getNext();
        }
        return path;
        
    }
    /*
    
    int minDistance(int dist[], bool sptSet[])
{
    // Initialize min value
    int min = INT_MAX, min_index;
 
    for (int v = 0; v < V; v++)
        if (sptSet[v] == false && dist[v] <= min)
            min = dist[v], min_index = v;
 
    return min_index;
}
 
// Function to print shortest path from source to j
// using parent array
void printPath(int parent[], int j)
{
    // Base Case : If j is source
    if (parent[j]==-1)
        return;
 
    printPath(parent, parent[j]);
 
    printf("%d ", j);
}
 
// A utility function to print the constructed distance
// array
int printSolution(int dist[], int n, int parent[])
{
    int src = 0;
    printf("Vertex\t  Distance\tPath");
    for (int i = 1; i < V; i++)
    {
        printf("\n%d -> %d \t\t %d\t\t%d ", src, i, dist[i], src);
        printPath(parent, i);
    }
}
 
// Funtion that implements Dijkstra's single source shortest path
// algorithm for a graph represented using adjacency matrix
// representation
    public void dijkstra(int graph[V][V], int src)
{
    int dist[V];  // The output array. dist[i] will hold
                  // the shortest distance from src to i
 
    // sptSet[i] will true if vertex i is included / in shortest
    // path tree or shortest distance from src to i is finalized
    bool sptSet[V];
 
    // Parent array to store shortest path tree
    int parent[V];
 
    // Initialize all distances as INFINITE and stpSet[] as false
    for (int i = 0; i < V; i++)
    {
        parent[0] = -1;
        dist[i] = INT_MAX;
        sptSet[i] = false;
    }
 
    // Distance of source vertex from itself is always 0
    dist[src] = 0;
 
    // Find shortest path for all vertices
    for (int count = 0; count < V-1; count++)
    {
        // Pick the minimum distance vertex from the set of
        // vertices not yet processed. u is always equal to src
        // in first iteration.
        int u = minDistance(dist, sptSet);
 
        // Mark the picked vertex as processed
        sptSet[u] = true;
 
        // Update dist value of the adjacent vertices of the
        // picked vertex.
        for (int v = 0; v < V; v++)
 
            // Update dist[v] only if is not in sptSet, there is
            // an edge from u to v, and total weight of path from
            // src to v through u is smaller than current value of
            // dist[v]
            if (!sptSet[v] && graph[u][v] &&
                dist[u] + graph[u][v] < dist[v])
            {
                parent[v]  = u;
                dist[v] = dist[u] + graph[u][v];
            }  
    }
 
    // print the constructed distance array
    printSolution(dist, V, parent);
}*/
}
