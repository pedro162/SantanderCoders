/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.implementation;

/**
 *
 * @author pedro
 */
public class SupermarketArray implements Supermarket {
    
    private final String[] items;
    private int lastIndex;

    public SupermarketArray(final int size) {
        this.items = new String[size];
        this.lastIndex = -1;
    }
        
    @Override
    public void add(String item) {
        if(this.lastIndex == (this.items.length - 1)){
            System.err.println("Lista de supermercado cheia");
        }else{
            this.lastIndex += 1;
            this.items[this.lastIndex] = item;
        }
    }

    @Override
    public void print() {
        System.out.println("######################################################");
        if(this.lastIndex < 0){
            System.out.println("Lista de supermercado vazia");
        }
        
        for (int i = 0; i <= this.lastIndex; i++) {
            System.out.println((i+1)+" - "+this.items[i]);
        }
        System.out.println("######################################################");
           
    }

    @Override
    public void delete(int index) {
        if(index >=0 && index <= this.lastIndex){
            this.shift(index);
            this.lastIndex --;
        }else{
            System.err.println("Infice inválido: "+index);
        }
    }

    private void shift(final int index) {
        for (int i = index; i < this.lastIndex; i++) {
            this.items[i] = this.items[i+1];
        }
    }
    
}
