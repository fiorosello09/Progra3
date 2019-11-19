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
public class Task 
{
    //atributes
    
    private LinkedList adjacencyList;
    private String tasktype;
    private int taskNumber;
    private String description;
    private String Id;
    private String effort;
    private String manager;
    private int duration;
    
    /**
     * constructor by default
     */
    public Task(){
    }
    
    /** constructor 
     *
     * @param pTasktype
     * @param pTaskNumber
     * @param pdescription
     * @param pId
     * @param pEffort
     * @param pManager
     */
    public Task(String pTasktype, int pTaskNumber,String pdescription,String pId,String pEffort,String pManager)//int pDuration)
    {
        this.tasktype = pTasktype;
        this.taskNumber = pTaskNumber;
        this.description = pdescription;
        this.Id = pId;
        this.effort = pEffort;
        this.manager = pManager;
        this.duration = 0;
        this.adjacencyList = new LinkedList();
    }

    /**
     *
     * @return
     */
    public LinkedList getAdjacencyList() {
        return adjacencyList;
    }

    /** sets the adjacency list of the task
     * no return
     * @param adjacencyList LinkedList
     */
    public void setAdjacencyList(LinkedList adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    /** gets the tasktype of the task
     *
     * @return tasktype
     */
    public String getTasktype() {
        return tasktype;
    }

    /** sets the TaskType of the task
     *
     * @param tasktype String
     */
    public void setTasktype(String tasktype) {
        this.tasktype = tasktype;
    }

    /** gets the taskNumber of the task
     *
     * @return taskNumber int
     */
    public int getTaskNumber() {
        return taskNumber;
    }

    /** sets the taskNumber of the task
     * no return
     * @param taskNumber int
     */
    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    /** gets the description of the task
     *
     * @return description String
     */
    public String getDescription() {
        return description;
    }

    /** sets the description of the task
     * no return 
     * @param description String
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** gets the ID of the task
     *
     * @return Id String
     */
    public String getId() {
        return Id;
    }

    /** sets the ID of the task
     * no return 
     * @param Id String
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /** gets the effort of the task
     *
     * @return effort String
     */
    public String getEffort() {
        return effort;
    }

    /** Sets the effort of the task
     * no return 
     * @param effort String
     */
    public void setEffort(String effort) {
        this.effort = effort;
    }

    /**gets the manager of the task
     *
     * @return manager String
     */
    public String getManager() {
        return manager;
    }

    /** sets the manager of the task
     * no return
     * @param manager String
     */
    public void setManager(String manager) {
        this.manager = manager;
    }

    /** gets the duration of the task
     *
     * @return duration int
     */
    public int getDuration() {
        return duration;
    }

    /** sets the actual duration of the task
     * no return 
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    
    
}
