/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataStruture;
import java.util.LinkedList;

/**
 *
 * @author pedro
 */
public class Tree {
    public Node root;
    
    public static class Node{
        public int value;
        public Node left;
        public Node right;
        
        private Node(int value){
            this.value = value;
        }
        
        public boolean isLeaf(){
            return (this.left == null) && this.right == null;
        }
    }
    
    public void insert(int value){
        if(this.root == null) this.root = new Node(value);
        else{
            Node newNode = new Node(value);
            var queue = new LinkedList<Node>();
            queue.add(root);
            while(queue.size() > 0){
                Node currentNode = queue.remove();
                if(currentNode.left == null){
                    currentNode.left = newNode;
                    break;
                }else{
                    queue.add(currentNode.left);
                }
                
                if(currentNode.right == null){
                    currentNode.right = newNode;
                    break;
                }else{
                    queue.add(currentNode.right);
                }
            }
        }
    }
    
    public void preOrder(){
        this.preOrder(this.root);
    }
    
    public void preOrder(final Node node){
        //R-E-D
        if(node != null){
            System.out.println(node.value);
            this.preOrder(node.left);
            this.preOrder(node.right);
        }        
    }
    
    public void inOrder(){
        this.preOrder(this.root);
    }
    
    public void inOrder(final Node node){
        //E-R-D
        if(node != null){
            this.preOrder(node.left);
            System.out.println(node.value);
            this.preOrder(node.right);
        }        
    }
    
    public void posOrder(){
        this.posOrder(this.root);
    }
    
    public void posOrder(final Node node){
        //E-D-R
        if(node != null){
            this.posOrder(node.left);
            this.posOrder(node.right);
            System.out.println(node.value);
        }        
    }
    
    public void BFS(){
        if(this.root != null){
            
            var queue = new LinkedList<Node>();
            queue.add(this.root);
            
            while(! queue.isEmpty()){
                Node node = queue.remove();
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                System.out.println(node.value);
            }
        }
    }
    
}
