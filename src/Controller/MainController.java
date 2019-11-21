/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Data.Edge;
import Data.Graph;
import Data.LinkedList;
import Data.Matrix;
import Data.NodeLinkedList;
import Data.Resources;
import Data.Task;

/**
 *
 * @author fioro
 */
public class MainController {
    //Atributes
    
    /**
     *
     */
    public static Graph<Task> taskGraph = new Graph<>();

    /**
     *
     */
    public static LinkedList<Resources> resourceList = new LinkedList<>();

    /**
     *
     */
    public static int other = 1;
    
    //methods
    
    /** inserts a task in graph 
     * no return 
     * @param pTaskType String
     * @param pDescription String 
     * @param pId String
     * @param pEffort String 
     * @param pManager String
     */
    public void insertTask(String pTaskType,String pDescription,String pId,String pEffort,String pManager)
    {
        int taskNumber = other;
        other = other +1;
        Task toInsert = new Task(pTaskType,taskNumber, pDescription,pId, pEffort, pManager);
        taskGraph.addEdge(toInsert);
    }
    
    /** inserts a resource in resource list
     *  no return
     * @param ID
     * @param name
     * @param type
     * @param capacity
     * @param amount
     * @param inCharge
     */
    public void insertResource(String ID, String name, String type, String capacity, String amount, String inCharge)
    {
        //falta validarrrrrrrrrrr las demas
        int newAmount;
        if(amount.equals(""))
        {
            newAmount = 0;
            Resources toInsert = new Resources(ID,name,type,capacity,newAmount,inCharge);
            resourceList.insert(toInsert);
            System.out.println(resourceList.amount);
        }
        else
        {
            newAmount = Integer.parseInt(amount);
            Resources toInsert = new Resources(ID,name,type,capacity,newAmount,inCharge);
            resourceList.insert(toInsert);
            System.out.println(resourceList.amount);
        }
        
    }

    /** find shortest path in the matrix
     * 
     * @param pSource int
     * @param pDestination int
     * @return path LinkedList
     */
    public LinkedList  findShortestPath(int pSource, int pDestination)
    {
        Matrix matrix = new Matrix(taskGraph.amount);
        Edge<Task> temp = taskGraph.head.getNext();
        //System.out.println(temp.getTask().getTaskNumber());
        while(temp!=null)
        {
            Task other = temp.getTask();
//            System.out.println(other.getTaskNumber());
            LinkedList list = other.getAdjacencyList();
            NodeLinkedList<Task> temp2 = list.head.getNext();
            while(temp2!=null)
            {
                int destination = temp2.getElement().getTaskNumber();
                int source = temp.getTask().getTaskNumber();
                int duration = temp2.getElement().getDuration();
                matrix.addEdge(source-1, destination-1, duration);
                temp2 = temp2.getNext();
            }
            temp = temp.getNext();
        }
        matrix.shortestPath(taskGraph, pSource, pDestination);
        LinkedList<Task> path = matrix.path();
        return path;
    }
    
    /** inserts the dependencie of the task in the adjacency list
     * no return
     * @param task1
     * @param task2
     * @param duration
     */
    public void insertDependencie(int task1,int task2, int duration)
    {
        Task find = taskGraph.findEdge(task1);
        Task toInsert = taskGraph.findEdge(task2);
        LinkedList temp = find.getAdjacencyList();
        toInsert.setDuration(duration);
        temp.append(toInsert);
        System.out.println(temp.amount);
    }
    
    
    
}
