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

    //Constructores

    /**
     *
     */
    public NodeLinkedList() {
        this.element = null;
        this.next = null;
    }

    /**
     *
     * @param element
     */
    public NodeLinkedList(T element) {
        this.element = element;
        this.next = null;
    }

    /**
     *
     * @param element
     * @param next
     */
    public NodeLinkedList(T element, NodeLinkedList next) {
        this.element = element;
        this.next = next;
    }

    //m�todos

    /**
     *
     * @return
     */
    public T getElement() {
        return this.element;
    }

    /**
     *
     * @param element
     */
    public void setElement(T element) {
        this.element = element;
    }

    /**
     *
     * @return
     */
    public NodeLinkedList getNext() {
        return this.next;
    }

    /**
     *
     * @param next
     */
    public void setNext(NodeLinkedList next) {
        this.next = next;
    }

}
