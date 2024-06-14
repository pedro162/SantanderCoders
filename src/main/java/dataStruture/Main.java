/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataStruture;

import java.util.Random;

/**
 *
 * @author pedro
 */
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList("Elemento 01");
        list.append("Elemento 02");
        list.append("Elemento 03");
        
        System.out.println(list.removeFirst());
        list.prepend("Elemento 00");
        list.insert(2,"Elemento mod 02");
        
        list.getHead();
        list.getTail();
        list.getLength();
        list.print();
        
        System.out.println(list.get(1).data);
        list.set(1, "Alterei o elemento de posição 1");
        System.out.println("====================================");
        list.remove(2);
        list.print();
        
        System.out.println("=================================== Pilha =================================");
        Stack stk = new Stack(1);
        stk.push(2);
        stk.push(3);
        stk.getTop();
        stk.getHeight();
        stk.print();
        System.out.println(stk.pop());
        stk.getTop();
        stk.getHeight();
        stk.print();
        
        System.out.println("=================================== Pilha =================================");
        int [] numeros = {5,4,3,2,1};
        inverter(numeros);
        
        
        System.out.println("============================= PRINT LISTA =====================================");
        
        Queue myQueue =  new Queue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLenght();
        myQueue.print();
        
        myQueue.dequeue();
        myQueue.print();
        System.out.println("==========================================================================");
        int n = 5;
        var random = new Random();
        int cliente = random.nextInt(101);
        Queue queueCliente = new Queue(cliente);
        System.out.println("Checou o cliente: "+cliente);
        //---Simula a chegada dos clientes
        for (int i = 2; i <= n; i++) {
            cliente = random.nextInt(101);
            System.out.println("Checou o cliente: "+cliente);
            queueCliente.enqueue(cliente);
        }
        
        //---Atendimento dos clientes
        var node = queueCliente.dequeue();
        while(node != null){
            System.out.println("Atendido o cliente: "+node.getValue());
            node = queueCliente.dequeue();
        }
        
        
        System.out.println("============================= Arvore =====================================");
        Tree tree = new Tree();
        for (int i = 1; i <= 15; i++) {
            tree.insert(i);
        }
        System.out.println(tree.root.value);
        System.out.println(tree.root.left.value);
        System.out.println(tree.root.right.value);
        System.out.println(tree.root.isLeaf());
        tree.BFS();
        
        
        
        System.out.println("============================= BST Arvore =====================================");
        
        BST bstTree = new BST();
        for (int i = 1; i <= 15; i++) {
            bstTree.insert(i);
        }
        
        bstTree.inOder();
        System.out.println(bstTree.contains(2));
        System.out.println(bstTree.contains(4));
        bstTree.deleteNode(2);
        bstTree.inOder();
        
        
    
        /**
         * Balanceamento de colchetes em uma expressão
         * Solução: uso de pilhas
         * 1 -Empilhar caracteres de abertura
         * 2 -Ao identificar caracter de fechamento, desempilhar e verificar se coincide com abertura
         * 3 - Ao final a pilha deve estar vazia
         */
        System.out.println("============================= BLC expression =====================================");
        String exression = "2*(3+4+5*[2+3)]";
        BalanceamentoDeParenteses blp = new BalanceamentoDeParenteses();
        System.out.println(blp.solve(exression));
        //        blp.solve(exression);
        
        
        /**
         * Problema: Maior valor em cada nível da Árvore Binária
         * Solução:
         * 1 - Utilize o algoritmo BFS para percorrer a árvore e uma lista auxiliar.
         * 2 - Para cada elemento e seu nível na árvore: se a lista possuir o índice == nível, substitua pelo maior valor, senão adicione na lista
         */
       
        
    }
    
    private static void inverter(final int [] numeros){
        Stack stk = new Stack(numeros[0]);
        for (int i = 1; i < numeros.length; i++) {
            stk.push(numeros[i]);
        }
        
        var node = stk.pop();
        while(node != null){
            System.out.println(node.getValue());
            node = stk.pop();
        }        
    }
    
}
