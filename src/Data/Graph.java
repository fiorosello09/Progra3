/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author fioro
 * @param <T>
 */
public class Graph<T> {

    //atributes
    
    /**
     *
     */
    public Edge<T> head;
    private Edge<T> current;
    private Edge<T> tail;

    /**
     *
     */
     public String shortest[];


    /**
     *
     */
    public int amount;

    /** constructor by default
     * create a graph with a null edge
     */
    public Graph() {
        this.head = new Edge();
        this.current = this.head;
        this.tail = this.head;
        this.amount = 0;
    }

    /** adds edge to graph
     * no return 
     * @param element T
     */
    public void addEdge(T element) {
        //always insert at the end of the list
        Edge object = new Edge(element);
        this.tail.setNext(object);
        this.tail = object;
        this.amount = amount+1;
    }

    /** finds task in graph
     *
     * @param task in
     * @return Task
     */
    public Task findEdge(int task) {
        if (amount == 0) {
            return null;
        }
        Edge<Task> nodoTemp = (Edge<Task>) this.head.getNext();
        while (nodoTemp != null) {
            int taskElement = nodoTemp.getTask().getTaskNumber();
            //System.out.println("temporaaaal"+nombre);
            //System.out.println("Elemento por buscar" +nombreFarmacia);
            if (task == taskElement) {
                //System.out.println("entrooo");
                return nodoTemp.getTask();

            }
            nodoTemp = nodoTemp.getNext();
        }
        //System.out.println("No se encontro"); 
        return null;
    }

    /** gets the actual element
     *
     * @return T 
     */
    public T getElement() {
        return this.current.getTask();
    }

    /** verifies if in linkedlist is an adjancency of the task we are looking for
     *
     * @param list
     * @param task2
     * @return Task 
     */
    public Task findEquals(LinkedList list, int task2) {
        if (list.amount == 0) 
        {
            System.out.println(list.amount);
            return null;
        }
        //System.out.println("Cantidad"+list.amount);
        NodeLinkedList<Task> temp = list.head;
        while(temp!=null)
        {
            
            int other = temp.getElement().getTaskNumber();
            //System.out.println("Comparando"+other);
            if(task2==other)
            {
                return temp.getElement();
            }
            temp = temp.getNext();
        }
        return null;
    }
}
    
    

    

