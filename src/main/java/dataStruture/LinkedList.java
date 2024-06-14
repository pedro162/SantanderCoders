package dataStruture;
        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
public class LinkedList {
    private Node head;
    private Node tail;
    private int length;
       //Last class time: 22:03
    class Node{
        String data;
        Node next;

        Node(String data)    {
            this.data = data;
        }    
    }
    
    public LinkedList(String data){
        this.length=1;
        Node newNode = new Node(data);
        this.head  = newNode;
        this.tail  = newNode;
    }
    
    public void getHead(){
        if(this.head == null){
            System.out.println("Lista vazia");
        }else{
            System.out.println("Head: "+this.head.data);
        }
    }
    
    public void getTail(){
        if(this.tail == null){
            System.out.println("Lista vazia");
        }else{
            System.out.println("Tail: "+this.tail.data);
        }
    }
    
    public void getLength(){
        System.out.println("length: "+this.length);
    }
    
    
    public void print(){
        Node temp = this.head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public void append(String data){
        Node newNode = new Node(data);
        if(this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }else{
            this.tail.next = newNode;
            this.tail = newNode;
        }
        
        this.length += 1;
    }
    
    public Node removeFirst(){
        if (this.length == 0) return null;
        Node temp = this.head;
        this.head = this.head.next;
        temp.next = null;
        this.length --;
        if(this.length == 0){
            this.head = null;
            this.tail = null;
        }
        return temp;
    }
    
    public void makeEmpty(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    
    public Node removeLast(){
        if(this.length == 0) return null;
        Node pre = this.head;
        Node temp = null;
        
        while(pre.next != this.tail){
            pre = pre.next;
        }
        temp = this.tail;
        this.tail = pre;
        this.tail.next = null;
        this.length --;
        if(this.length == 0){
            this.head = null;
            this.tail = null;
        }
        
        return temp;
    }
    
    public void prepend(String data){
        Node newNode = new Node(data);
        if(this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }else{
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
    }
    
    public Node get(int index){
        if(index < 0 || index >= this.length) return null;
        
        Node temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        
        return temp;
    }
    
    public boolean insert(int index, String data){
        if(index < 0 && index > this.length) return false;
        
        if(index == 0){
            this.prepend(data);
        }else if(index == this.length){
            this.append(data);
        }
        
        Node newNode = new Node(data);
        Node temp = this.get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        
        this.length ++;        
        return true;
    }
    
    public boolean set(int index, String data){
        Node temp = this.get(index);
        if(temp != null){
            temp.data = data;
            return true;
        }        
        return false;
    }
    
    public Node remove(int index){
        if(index < 0 || index >= this.length) return null;
        
        if(index == 0){
            this.removeFirst();
        }else if(index == this.length - 1){
            this.removeLast();
        }
        
        Node before = this.get(index - 1);
        Node temp = before.next;//this.get(index);
        
        before.next = temp.next;
        temp.next = null;
        this.length --;
        return temp;
    }
    
    /**
     * Vantagens das listas ligadas
     * Utilização da memória
     * Utilizado na construção de outras estruturas
     * 
     * Desvantagens:
     * Acesso sequencial
     * Complexidade
    */
}
