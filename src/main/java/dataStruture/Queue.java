/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataStruture;

/**
 *
 * @author pedro
 */
public class Queue {
    private Node first;
    private Node last;
    private int length;
        
    public class Node{
        int value;
        Node next;
        
        public Node(int data){
            this.value = data;
        }
        
        public int getValue(){
            return this.value;
        }
    }
    
    public Queue(int value){
        Node newNode = new Node(value);
        this.first = newNode;
        this.last = newNode;
        this.length ++;
    }
    
    public void getFirst(){
        if(this.first != null){
            System.out.println("First: "+this.first.value);
        }else{
            System.out.println("Fila vazia");
        }
        
    }
    
    public void getLast(){
        
         if(this.last != null){
            System.out.println("Last: "+this.last.value);
        }else{
            System.out.println("Fila vazia");
        }
    }
    
    public void getLenght(){
        System.out.println("Lenght: "+this.length);
    }
    
    public void print(){
        System.out.println("============================= PRINT LISTA =====================================");
        Node temp = this.first;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("============================= PRINT LISTA =====================================");
    }
    
    public void enqueue(int value){
        Node newNode = new Node(value);
        if(this.length == 0){
            this.first = newNode;
            this.last = newNode;
        }else{
            this.last.next = newNode;
            this.last = newNode;
        }
        
        this.length +=1;
    }
    
    public Node dequeue(){
        if(this.length == 0) return null;
        
        Node temp = this.first;
        
        if(this.length == 1){
            this.first = null;
            this.last = null;
        }else{
            this.first = first.next;
            temp.next = null;  
        }      
        this.length --;
        
        return temp;        
    }
}
