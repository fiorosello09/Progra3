
import Interface.MainWindow;
import Interface.ResourceRecord;
import java.util.Scanner;
import Data.Kruskal;
import static Data.Kruskal.br;
import Data.Graph;
import Data.LinkedList;
import Data.Task;
import java.io.IOException;
import java.util.Arrays;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fioro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Task task1 = new  Task("Tarea1", 1,"","","","","",5);
        Task task2 = new  Task("Tarea2", 2,"","","","","",15);
        Task task3 = new  Task("Tarea3", 4,"","","","","",6);
        Task task4 = new  Task("Tarea4", 3,"","","","","",9);
        Task task5 = new  Task("Tarea5", 5,"","","","","",3);
        Task task6 = new  Task("Tarea6", 6,"","","","","",8);
        
        Graph grapf =  new Graph();
        grapf.addEdge(task1);
        grapf.addEdge(task2);
        grapf.addEdge(task3);
        grapf.addEdge(task4);
        grapf.addEdge(task5);
        grapf.addEdge(task6);
        
        
        Task taskHome= grapf.findEdge(1);
       // LinkedList<Task> list = taskHome.getAdjacencyList();
        System.out.println("The shortest is: "+Arrays.toString(grapf.findShortestPath(1,3)));
        
        
        
        

	
    
    
}
}
