/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.santandercoders;

import com.mycompany.implementation.Supermarket;
import com.mycompany.implementation.SupermarketArray;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class SantanderCoders {
    private static int SIZE=3;
    
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        Supermarket supermaket = new SupermarketArray(SIZE);
        int opcao;
       
        do {
            System.out.println("\nLista de Compras");
            System.out.println("1 - Insert");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Digite o item a ser inserido: ");
                    String item  = scanner.next();
                    supermaket.add(item);
                break;
                case 2:
                    supermaket.print();
                break;
                case 3:
                    System.out.println("Digite a posição do item a ser removido: ");
                    int index = scanner.nextInt();
                    supermaket.delete(index-1);
                break;
                case 4:
                    System.out.println("Saindo do programa...");
                break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente");
                    
            }        
            
        } while (opcao!=4);
        scanner.close();
    }
}
