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
    //Atributes
    
    String ID;
    String name;
    String type;
    String capacity;
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
    public Resources(String ID, String name, String type, String capacity, int amount, String inCharge) {
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
     * no return 
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
     * no return 
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }

    /** gets the type of the object
     *
     * @return type 
     */
    public String getType() {
        return type;
    }

    /** set type of the object
     * no return 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** gets the capacity of the object
     *
     * @return capacity String
     */
    public String getCapacity() {
        return capacity;
    }

    /** sets the capacity of the object
     * no return 
     * @param capacity String
     */
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    /** gets the amount available of the resource
     *
     * @return amount int
     */
    public int getAmount() {
        return amount;
    }

    /** sets the amount of the object
     * no return 
     * @param amount int
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * gets the person inCharge of the object
     * @return inCharge String
     */
    public String getInCharge() {
        return inCharge;
    }

    /** sets the person in Charge of the object
     * no return
     * @param inCharge String
     */
    public void setInCharge(String inCharge) {
        this.inCharge = inCharge;
    }
    
    
    
    
    
    
}
