/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author fioro
 * @param <L>
 */
public class LinkedList<L>
{
    

    // atributes of LinkedList

    /**
     *
     */
    public NodeLinkedList<L> head;
    private NodeLinkedList<L> current;
    private NodeLinkedList<L> tail;

    /**
     *
     */
    public int amount;

    
    
    //constructor

    /**
     * creates a new Linked List
     */
        public LinkedList()
    {
        this.head = new NodeLinkedList();
        this.current = this.head;
        this.tail = this.head;
        this.amount = 0; 
    }
     //getters y setters

        
    /** gets the head of the linkedlist
     *
     * @return head
     */
    public NodeLinkedList<L> getHead()
    {
        return head;
    }

    
   
    /** sets the head of the linked list
     *
     * @param head
     */
        public void setHead(NodeLinkedList<L> head) {
        this.head = head;
    }

    /** gets the amount of the linked list
     *
     * @return amount
     */
    public int getAmount() {
        return this.amount;
    }
    
    /** gets the element of the type to find
     *
     * @return
     */
    public L getElement()
    {
        return this.current.getElement();
    }
    
    
    //methods
    
    
    
    
    /** finds the object in linkedlist
     *
     * @param name
     * @return null
     */
        
    public L find(L name)
    {
        if (amount==0)
        {
            return null;
        }
        NodeLinkedList<L> nodoTemp = (NodeLinkedList<L>) this.head;
        while(nodoTemp!=null)
        {
            
            System.out.println("temporaaaal"+nodoTemp);
            System.out.println("Elemento por buscar" +name);
            if(name.equals(nodoTemp))
            {
                //System.out.println("entrooo");
                return nodoTemp.getElement();
                        
            }
            nodoTemp = nodoTemp.getNext();
        }
        //System.out.println("No se encontro"); 
        return null;
    }
    
    
    /** inserts the object in linked list
     *
     * @param element
     */
        public void insert(L element)
    {
        if (this.amount == 0) 
        {
            this.head = new NodeLinkedList<>(element);
            this.current = this.head;
            this.tail = this.current;
            this.amount++;
            
        }
        else 
        {
            NodeLinkedList<L> object = new NodeLinkedList<>(element);
            if (this.current == this.tail)
            {
               
                this.tail.setNext(object);
                this.tail = object;
                
                
            }
            this.current.setNext(object);
            //System.out.println("Current" +this.current.getElement());
            this.current = object;
            
            this.amount++;
            
        } 
    } 
    
    
    

    /** deletes an element from linked list
     *
     * @param element
     */
        public void delete(L element)
    {
        NodeLinkedList<L> temp = this.head;
        this.current = this.head;
        if(this.amount==0)
        {
            System.out.println("LinkedList is empty");
        }
        while(temp!=null)
        {
            L objet = temp.getElement();
            if(objet.equals(element))
            {
                if(temp == this.head)
                {
                    this.head = this.head.getNext();
                }
                if(this.current == this.tail)
                {
                    this.current = this.tail = temp;
                }
                this.current.setNext(temp.getNext());
            }
            temp = temp.getNext();
        }
        this.amount--;
        //System.out.println("No se encontro el elemento por eliminar");
           
    }

    /**
     * clears the linked list
     */
    public void clear()
    {
        this.head = this.tail = this.current = new NodeLinkedList();
        this.amount=0;
    }
    
    

    /** prints the elements of the linked list
     *
     * @return
     */
        public String toString()
    {
        String lista = "";

        NodeLinkedList<Resources> currentNodo = (NodeLinkedList<Resources>) this.head;

        while (currentNodo!=null)
        {
            Resources node = currentNodo.getElement();
            lista +="(";
            
            lista += node;
            lista+= "), ";
            currentNodo = currentNodo.getNext();
        }
        return lista;
    }

   
    
   
    
    
        
    
    
}
   

