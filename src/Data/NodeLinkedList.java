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
public class NodeLinkedList<T> {

    private T element;
    private NodeLinkedList next;

    //Constructors

    /** constructor by default
     *
     */
    public NodeLinkedList() {
        this.element = null;
        this.next = null;
    }

    /** creates a Node that contains the element T
     * no return 
     * @param element T
     */
    public NodeLinkedList(T element) {
        this.element = element;
        this.next = null;
    }

    /** creates a Node that contains a T element and sets its next with 
     *  an another Node
     * @param element T
     * @param next NodeLinkedList
     */
    public NodeLinkedList(T element, NodeLinkedList next) {
        this.element = element;
        this.next = next;
    }

    //methods

    /**  gets the actual element
     *
     * @return T element
     */
    public T getElement() {
        return this.element;
    }

    /** sets the actual element
     *  no return 
     * @param element T
     */
    public void setElement(T element) {
        this.element = element;
    }

    /** gets the next of the actual element
     *
     * @return this.next NodeLinkedList
     */
    public NodeLinkedList getNext() {
        return this.next;
    }

    /** sets the next of the actual element
     * no return 
     * @param next NodeLinkedList
     */
    public void setNext(NodeLinkedList next) {
        this.next = next;
    }

}
