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
    //atributes
    
    static final int NO_PARENT = -1;	
    private final int numOfNodes;
    private final boolean directed;
    private final boolean weighted;
    private float[][] matrix;
    private boolean[][] isSetMatrix;
    static LinkedList<Task>  edges = new LinkedList(); //nodes in the shortest path
    static LinkedList<Integer> dists = new LinkedList<Integer>(); //l
    
    /** creates a matrix based on the number enter
     *
     * @param numOfNodes
     */
    public Matrix(int numOfNodes) {

        this.directed = false;
        this.weighted = true;
        this.numOfNodes = numOfNodes;

        // Simply initializes our adjacency matrix to the appropriate size
        matrix = new float[numOfNodes][numOfNodes];
        isSetMatrix = new boolean[numOfNodes][numOfNodes];
    }
    
    /** add edge with source, destination and weight 
     *
     * @param source int
     * @param destination int
     * @param weight float
     */
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

    /** looks if the source and destination have and edge
     *
     * @param source
     * @param destination
     * @return true o false
     */
    public boolean hasEdge(int source, int destination) {
    return isSetMatrix[source][destination];
}

    /** prints the matrix 
     * no return
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

    /** finds the shortest path between two points
     * no return 
     * @param graph Graph
     * @param src int
     * @param dest int
     */
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

    /**
     *
     * @param graph
     * @param i
     * @param parents
     */
    public static void visitUtil(Graph graph,int i,int[] parents)  { 	
        if (i == NO_PARENT)        	
            return; 
   	
        visitUtil(graph,parents[i], parents);
       
        Task toInsert = graph.findEdge(i+1);
        
        edges.insert(toInsert);
    } 

    /**
     *
     * @return edges LinkedList
     */
    public LinkedList path()
    {
        
        return edges;
        
    }
    
    /** prints each data in edges 
     *
     * @return tasks String
     */
    public String printEdges()
    {
        String tasks ="";
        NodeLinkedList<Task> temp = edges.head;//.getNext();
        while(temp!=null)
        {
            int task = temp.getElement().getTaskNumber();
            tasks +=task;
            tasks+="";
            temp =  temp.getNext();
        }
        return tasks;
    }
    
    
    
}
