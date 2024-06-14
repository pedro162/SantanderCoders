/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dataStruture;

/**
 *
 * @author pedro
 */
public class BST {
    public Node root;
    
    public class Node{
        public int value;
        public Node left;
        public Node right;
        
        public Node(int value){
            this.value = value;
        }
                
    }
    
    public void insert(int value){
        if(this.root == null){
            this.root = new Node(value);
        }else{
            this.insert(this.root, value);
        }
    }
    
    private void insert(final Node root, final int value){
        if(root == null) return ;
        if(root.value == value) return ;
        
        if(value > root.value){
            if(root.right == null) root.right = new Node(value);
            else this.insert(root.right, value);
        }else{
            
            if(root.left == null) root.left = new Node(value);
            else this.insert(root.left, value);
        }        
    }
    
    public void inOder(){
        this.inOrder(this.root);
    }
    
    public void inOrder(final Node node){
        //E R D        
        if(node == null) return ;        
        this.inOrder(node.left);
        System.out.println(node.value);
        this.inOrder(node.right);
    }
    
    public boolean contains(int value){
        return this.contains(this.root, value);
    }
    
    private boolean contains(final Node root, final int value){
        if(root == null) return false;
        
        if(root.value == value){
            return true;
        }
        
        if(value > root.value){
            return this.contains(root.right, value);
        }else{
            return this.contains(root.left, value);
        }        
    }
    
    public int minValue(Node currentNode){
        while(currentNode.left != null){
            currentNode = currentNode.left;
        }
        return  currentNode.value;
    }
    
    public void deleteNode(int value){
        this.root = this.deleteNode(this.root, value);
    }
    
    private Node deleteNode(final Node root, int value){
        if(root == null) return null;
        
        if(value < root.value ){
            root.left = this.deleteNode(root.left, value);
        }else if(value > root.value){
            root.right = this.deleteNode(root.right, value);
        }else{
            if(root.left == null && root.right == null){
                return null;
            }else if(root.left == null){
                   return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                int minValue = this.minValue(root.right);
                root.value = minValue;
                root.right = this.deleteNode(root.right, value);
            }
        }
        
        return root;
    }
}
