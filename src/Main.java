
import Interface.MainWindow;
import Interface.ResourceRecord;
import java.util.Scanner;
import Data.Kruskal;
import static Data.Kruskal.br;
import Data.Graph;
import Data.LinkedList;
import Data.Matrix;
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
        Task task1 = new  Task("Tarea1", 1,"","","","","");
        Task task2 = new  Task("Tarea2", 2,"","","","","");
        Task task3 = new  Task("Tarea3", 4,"","","","","");
        Task task4 = new  Task("Tarea4", 3,"","","","","");
        Task task5 = new  Task("Tarea5", 5,"","","","","");
        Task task6 = new  Task("Tarea6", 6,"","","","","");
        
        Graph grapf =  new Graph();
        grapf.addEdge(task1);//0
        grapf.addEdge(task2);//1
        grapf.addEdge(task3);//2
        grapf.addEdge(task4);//3
        grapf.addEdge(task5);//4
        grapf.addEdge(task6);//5
        
        
        int amount = grapf.amount;
        System.out.println("Cantidad"+amount);
       // LinkedList<Task> list = taskHome.getAdjacencyList();*/
        //System.out.println("The shortest is: "+Arrays.toString(grapf.findShortestPath(1,3)));
        Matrix graph1 = new Matrix(amount);
        graph1.addEdge(0, 2, 5);
        graph1.addEdge(0, 3, 2);
        graph1.addEdge(1, 2, 3);
        graph1.addEdge(1, 5,2); 
        graph1.addEdge(1, 4,4);
        graph1.addEdge(2, 3,3);
        graph1.addEdge(3, 5,0);

        graph1.printMatrix();
        graph1.shortestPath(grapf,1,3);
        System.out.println(graph1.path());
        //Busque de tarea 1(posicion0) a tarea 3(posicion2)
        //En el codigo, le va a restar uno
        graph1.shortestPath(grapf,6,4);
        //Busque de tarea 6(posicion5) a 4(posicion3)
        
        System.out.println(graph1.path());
        
        
        

	
    
    
}
}
