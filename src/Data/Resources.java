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
public class Resources
{
    String ID;
    String name;
    String type;
    int capacity;
    int amount;
    String inCharge;

    /** Creates the object "Resources" 
     *
     * @param ID
     * @param name
     * @param type
     * @param capacity
     * @param amount
     * @param inCharge
     */
    public Resources(String ID, String name, String type, int capacity, int amount, String inCharge) {
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.amount = amount;
        this.inCharge = inCharge;
    }

    /** gets the ID of the object
     *
     * @return ID
     */
    public String getID() {
        return ID;
    }

    /** set the ID of the object
     *
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**gets the name of the object
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /** sets the name of the object
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** gets the type of the object
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /** set type of the object
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** gets the capacity of the object
     *
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /** sets the capacity of the object
     *
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     *
     * @return amount
     */
    public int getAmount() {
        return amount;
    }

    /** sets the amount of the object
     *
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * gets the person inCharge of the object
     * @return inCharge
     */
    public String getInCharge() {
        return inCharge;
    }

    /** sets the person in Charge of the object
     *
     * @param inCharge
     */
    public void setInCharge(String inCharge) {
        this.inCharge = inCharge;
    }
    
    
    
    
    
    
}
