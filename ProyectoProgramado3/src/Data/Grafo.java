/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graf;

/**
 *
 * @author julian
 */
/*File: Grafo.java
 *Descripción: Grafo Dirigido implementado con matrices de adyacencia.
 *Las aristas no van a tener peso, por lo tanto la matriz es binaria, 
 *un valor de 1 indica que existe una arista entre dos vertices, y un valor
 *de cero indica que no existe una arista entre los vertices.*/

//Obtenido de: https://github.com/anvicordova/Estructura-de-Datos/blob/master/Grafo%20Dirigido%20-%20Matrices%20de%20Adyacencia%20-%20Sin%20Peso/src/Grafo.java

import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.UnsupportedOperationException;
import java.lang.RuntimeException;

public class Grafo {
	private final int MAX_VERTICES;
	private final int MAX_ARISTAS;
	private int nroAristas;
	private int grafo[][];
	
	//Crea un grafo vacío, con un máximo numero de vertices y aristas
	public Grafo(int nroVertices, int  nroAristas){
		MAX_VERTICES = nroVertices;
		MAX_ARISTAS = nroAristas;
		
		this.nroAristas = 0;
		
		grafo = new int[MAX_VERTICES][MAX_VERTICES];
		
		for(int i = 0; i < getMAX_VERTICES();i++){
			for (int j = 0; j < getMAX_VERTICES(); j++){
				grafo[i][j] = 0;
			}
		}
	}
	
	//Crea un grafo vacío, con un máximo número de vertices, y 
	//vertices al cuadrado como número máximo de aristas.
	public Grafo(int nroVertices){
		//Llamada al constructor con dos argumentos
		this(nroVertices, nroVertices);
	}
	
	//Crea un grafo vacío con un máximo número de vertices = 5
	//y máximo numero de aristas = 25.
	public Grafo(){
		//Llamada al constructor con dos argumentos
		this(5,25);
	}

	public int getMAX_VERTICES()
	{
		return MAX_VERTICES;
	}

	public int getMAX_ARISTAS()
	{
		return MAX_ARISTAS;
	}
	
	//Inserta una arista entre dirigida del vertice v1 al vertice v2
	public void insertaArista(int v1, int v2)
				throws ArrayIndexOutOfBoundsException, UnsupportedOperationException
	{
		if(v1 >= MAX_VERTICES || v2 >= MAX_VERTICES){ 
			throw new ArrayIndexOutOfBoundsException("Vertices inválidos, fuera de rango"+
					"\nRango de vertices: 0 - " + (getMAX_VERTICES() - 1));
		}
		else if(nroAristas == MAX_ARISTAS){
			throw new UnsupportedOperationException("No se puede añadir más aristas");
		}		
		else{
			grafo[v1][v2] = 1;
		}
	}
	
	//Retorna verdadero si existe una arista dirigida entre los vertices v1 y v2
	public boolean existeArista(int v1, int v2){
		if(v1 >= MAX_VERTICES || v2 >= MAX_VERTICES){ 
			throw new ArrayIndexOutOfBoundsException("Vertices inválidos, fuera de rango"+
					"\nRango de vertices: 0 - " + (getMAX_VERTICES() - 1));
		}
		else if(grafo[v1][v2] == 1){
			return true;
		}		
		return false;
	}
	
	//Elimina la arista entre los vertices v1 y v2
	public void eliminaArista(int v1, int v2){
		if(v1 >= MAX_VERTICES || v2 >= MAX_VERTICES){ 
			throw new ArrayIndexOutOfBoundsException("Vertices inválidos, fuera de rango"+
					"\nRango de vertices: 0 - " + (getMAX_VERTICES() - 1));
		}
		else if(grafo[v1][v2] == 0){
			System.err.println("La arista NO existe");
		}
		else{
			grafo[v1][v2] = 0;
		}
	}
	
	//Elimina todas las aristas. Se llena toda la matriz de ceros
	public void liberaGrafo(){
		for(int i = 0; i < grafo.length; i++){
			for(int j = 0; j < grafo[i].length; j++){
				grafo[i][j] = 0;
			}
		}
	}
	
	public void mostrarGrafo(){
		System.out.print(" ");
		for(int i = 0; i < MAX_VERTICES; i++)
		{
			System.out.printf("  %3d", i);
		}
		System.out.println();
		for( int i = 0; i < MAX_VERTICES; i++){
			System.out.printf(" %3d", i);
			for(int j = 0; j < MAX_VERTICES; j++){
				System.out.printf(" %3d" ,grafo[i][j]);
			}
			System.out.println();
		}
	}
	
        
        public static void main(String[] args) {
            // TODO code application logic here
            Grafo g = new Grafo(10,4);
            g.insertaArista(2, 9);
            g.insertaArista(2, 9);
            g.insertaArista(2,2);
            g.mostrarGrafo();
        }
    }
	


