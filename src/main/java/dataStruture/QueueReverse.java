/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataStruture;
import java.util.Queue;

/**
 *
 * @author pedro
 */
public class QueueReverse {
    
    public static Queue<Integer> reverseFirstK(Queue <Integer> queue, int k){
        solveQueue(queue, k);
        int n = queue.size() - k;
        while(n-- > 0){
            int elemt = queue.remove();
            queue.add(elemt);
        }
        return queue;
    }
    
    public static void solveQueue(Queue <Integer> queue, int k){
        if(k == 0) return ;
        int elemento = queue.remove();
        solveQueue(queue, k-1);
        queue.add(elemento);
    }
    
    
    public static void main(String[] args) {
         /**
         * Reverter os primeiros K elementos de uma fila
         * Dado um inteiro K e uma fila de inteiros, a tarefa é inverter a ordem dos primeiros K elementos da fila,
         * deixando os demais elementos na mesma ordem relativa
         * 
         * Dolução
         * 1 - Para os K primeiros elementos, desenfileirar elemento x, reordenar(k - 1) elementos, enfileirar elemento x
         * 2 - para os N-K elementos, desenfileirar, enfileirar
         */ 
        
        Queue<Integer> queue = new java.util.LinkedList<>();
        for (int i = 1; i <= 15; i++) {
            queue.add(i);
        }
        System.out.println(reverseFirstK(queue, 5));
        
    }
}
