/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hilos;

class Contador{
        int count=0;
        public void incrementar(){
            count++;
        }
        
        public int getContador(){
            return count;
        }
    }

class hilo extends Thread{
    Contador conta;
    
    public hilo(Contador conta){
        this.conta=conta;
    }
    
    
    public void run(){
        for (int i = 0; i < 10000000; i++) {
            conta.incrementar();
        }
    }
}
public class Hilos {
    
    

    public static void main(String[] args) throws InterruptedException {
        Contador conta = new Contador();
        
        Thread h1 = new hilo(conta);
        
        h1.start();
        h1.join();
        
        System.out.println(conta.getContador());
    }
}
