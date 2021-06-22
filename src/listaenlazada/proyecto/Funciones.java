/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada.proyecto;


public class Funciones {
  
  Nodo head;
  
  //método para insertar un nuevo elemento
  public void insertar(int data)
  {
    Nodo nodo = new Nodo();
    nodo.data = data;
    nodo.siguiente = null;
    
    if(head == null)
    {
      head = nodo;
    }
    else
    {
      Nodo n = head;
      while(n.siguiente != null)
      {
        n = n.siguiente;
      }
      n.siguiente = nodo;
    }   
  }
  
  //método para borrar un elemento
  public String eliminar(int index)
  {
    if(index == 0)
    {
      head = head.siguiente;
    }
    else
    {
      Nodo n = head;
      Nodo n1 = null;
      for(int i=0;i<index-1;i++)
      {
        n = n.siguiente;
      }
      n1 = n.siguiente;
      n.siguiente = n1.siguiente;
      
      return String.valueOf(n1.data);
      //System.out.println("n1" + n1.data);
    }
    
    return null;
  }
  
  //método para mostrar todos los elementos
  public void mostrarTodos()
  {
    Nodo nodo = head;
    
    while(nodo.siguiente != null)
    {
      System.out.println(nodo.data);
      nodo = nodo.siguiente;
    }
    System.out.println(nodo.data);
  }
  
  //MOSTRAR ELEMENTO DEL ÍNDICE INDICADO
  public String mostrarEn(int indice)
  {
    Nodo nodo = head;
    int contador = 1;
    
    while(nodo.siguiente != null)
    {
      if(contador == indice){
        return String.valueOf(nodo.siguiente.data); 
      }
       nodo = nodo.siguiente;
       contador++;
    }
    
    if(indice == 0)
        return String.valueOf(head.data);
    
    //si no hay datos que coincidan, se devuelve nulo
    return null;
  }
  
  //elimina todos los nodos de la lista
  public void borrarCola(){
      Nodo nodoRespaldo = null;
      
      while(head != null){
          nodoRespaldo = head.siguiente;
          head = null;
          head = nodoRespaldo;
      }
  }
  
  //envía el tamaño de la cola
  public int tamanioCola(){
    
    Nodo nodo = head;
    
    if(head == null){
        return 0;
    }
    
    int contador = 1;
    
    while(nodo.siguiente != null)
    {
      nodo = nodo.siguiente;
      contador++;
    }
    
    return contador;
  }
  
}
