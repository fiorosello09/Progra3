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
    private LinkedList adjacencyList;
    private String tipotarea;
    private int taskNumber;
    private String descripccion;
    private String Id;
    private String esfuerzo1;
    private String encargado1;
    private int duration;
    
    
    public Task(){
    }
    
    public Task(String ptipotarea, int pTaskNumber,String pdescripccion,String pNacionalidad,String pId,String pesfuerzo,String pEncargado)//int pDuration)
    {
        this.tipotarea = ptipotarea;
        this.taskNumber = pTaskNumber;
        this.descripccion = pdescripccion;
        this.Id = pId;
        this.esfuerzo1 = pesfuerzo;
        this.encargado1 = pEncargado;
       // this.duration = pDuration;
        this.adjacencyList = new LinkedList();
    }

    public String getTipotarea() {
        return tipotarea;
    }

    public void setTipotarea(String tipotarea) {
        this.tipotarea = tipotarea;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumer(int pTaskNumber) {
        this.taskNumber = pTaskNumber;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getEsfuerzo1() {
        return esfuerzo1;
    }

    public void setEsfuerzo1(String esfuerzo1) {
        this.esfuerzo1 = esfuerzo1;
    }

    public String getEncargado1() {
        return encargado1;
    }

    public void setEncargado1(String encargado1) {
        this.encargado1 = encargado1;
    }

    public LinkedList getAdjacencyList() {
        return adjacencyList;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
      
    
    

    /**
     * sets the LinkedList in case of change
     * @param adjacencyList
     */
    public void setAdjacencyList(LinkedList adjacencyList) {
        this.adjacencyList = adjacencyList;
    }
    
}
