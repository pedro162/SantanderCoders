
package dataStruture;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
public class Stack {
    private Node top;
    private int height;
    
    public class Node{
        int value;
        Node next;
        
        public Node(int value){
            this.value = value;
        }
        
        public int getValue(){
            return this.value;
        }
    }
    
    
    public Stack(int value){
        Node newNode = new Node(value);
        this.top = newNode;
        this.height += 1;
    }
    
    public void getTop(){
        if(this.top == null){
            System.out.println("Pilha vazia");
        }else{
            System.out.println("Topo: "+this.top.value);
        }
    }
    
    public void getHeight(){
        System.out.println("Altura: "+this.height);
    }
    
    public void print(){
        System.out.println("=================================================================");
        Node temp = this.top;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("=================================================================");
    }
    
    public void push(int value){
        Node newNode = new Node(value);
        if(this.height == 0){
            this.top = newNode;
        }else{
            newNode.next = this.top;
            this.top = newNode;
        }        
        this.height++;
    }
    
    public Node pop(){
        if(!(this.height > 0)) return null;
        
        Node tmp = this.top;
        this.top = this.top.next;
        tmp.next = null;
        this.height --;
        return tmp;
    }
    
}
