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

    private Edge<T> head;
    private Edge<T> current;
    private Edge<T> tail;

    /**
     *
     */
     public String shortest[];


    /**
     *
     */
    public int amount = 0;

    /**
     *
     */
    public Graph() {
        this.head = new Edge();
        this.current = this.head;
        this.tail = this.head;
        this.amount = 0;
    }

    public void addEdge(T element) {
        //always insert at the end of the list
        Edge object = new Edge(element);
        this.tail.setNext(object);
        this.tail = object;
        this.amount++;
    }

    //insert a element in at the end of the list
    /**
     *
     * @param element
     * @param element2
     */
    public void addEdge(T element, int element2) {
        //always insert at the end of the list
        Edge<Task> object = new Edge(element);
        this.tail.setNext(object);
        this.tail = (Edge<T>) object;
        Task toInsert = findEdge(element2);
        LinkedList list = toInsert.getAdjacencyList();
        list.insert(element);
        this.amount++;
    }

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

    public T getElement() {
        return this.current.getTask();
    }

    /** verifies if in linkedlist is an adjancency of the task we are looking for
     *
     * @param list
     * @param task2
     * @return
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
    
    public Task findShortest(LinkedList list)
    {   NodeLinkedList<Task> actual = list.head;
        NodeLinkedList<Task> temp = list.head;
        Task shortest = actual.getElement();
        while(temp!=null)
        {
            int duration = temp.getElement().getDuration();
            if(shortest.getDuration()>duration)
            {
                shortest = temp.getElement();
            }
            temp = temp.getNext();
        }
        return shortest;
    }
    
    public String[] findShortestPath(int task1, int task2)
    {
        int position = 0;
        shortest = new String[amount];
        Task task = findEdge(task1);
        shortest[position]= task.getTipotarea();
        LinkedList list = task.getAdjacencyList();
        Task found = findEquals(list,task2);
        if(found!=null)
        {
            position = position+1;
            shortest[position] = found.getTipotarea();
        }
        else{
            
            Task other = findShortest(list);
            position = position+1;
           // System.out.println("Shortest path"+other.getTipotarea());
            shortest[position] = other.getTipotarea();
            
            
            
            //shortest.addEdge(another);
        }
        
        

        return shortest;
    }
     
    
    public void shortest ()
    {
        int position = 0;
        while(position!=amount)
        {
            System.out.println("Shortest path is: ");
            System.out.println(shortest[position]);
            position = position+1;
        }
    }
}
