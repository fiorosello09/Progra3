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
public class Edge<T>
{
    private T task;
    private Edge next;
    
    

    //Constructors

    /** constructor by default, creates a null node
     *
     */
    
    public Edge() {
        this.task = null;
        this.next = null;
    }


    /** creates a Node with a Task
     *
     * @param task
     */
    public Edge(T task) {
        this.task = task;
        this.next = null;
        
    }
    
    /** gets the object Taks from the Node
     *
     * @return task
     */
    public T getTask() {
        return task;
    }

    /** sets the Task in case of change
     *
     * @param task
     */
    public void setTask(T task) {
        this.task = task;
    }

    /** gets the next node from the actual node
     *
     * @return next
     */
    public Edge getNext() {
        return next;
    }

    /** sets the next node from the actual node in case of change
     *   
     * @param next
     */
    public void setNext(Edge next) {
        this.next = next;
    }

    /** gets the LinkedList from the Node
     *
     * @return adjacencyList
     */
   
    



  
}
