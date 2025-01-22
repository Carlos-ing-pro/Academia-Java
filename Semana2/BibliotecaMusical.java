/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bibliotecamusical;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author cg873
 */
public class BibliotecaMusical {


 
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int num;
        int res;
        
        System.out.println("Estes es nuestro listado de canciones:");
        
        List<String> canciones = new ArrayList<>();
        
        canciones.add("1-Sing of the time");
        canciones.add("2-Man");
        canciones.add("3-Issues");
        canciones.add("4-Just like heaven");
        canciones.add("5-All the stars");
        canciones.add("6-Under Control");
        canciones.add("7-Im born to run");
        canciones.add("8-20 de Enero");
        
        System.out.println("Que cancion desea seleccionar? (ingrese el numero)"
                + "\n1-Sing of the time \n2-Man \n3-Issues \n4-Just like heaven"
                + "\n5-All the star \n6-Under Control \n7-Im born to run \n8-20 de Enero");
        num=z.nextInt();
        
        switch(num){
            case 1:
                System.out.println("Que desea hacer con la cancion?:\n 1-Reproducir\n 2-Eliminar");
                res=z.nextInt();
                if (res==1) {
                    System.out.println("Se esta respoduciendo: Sing of the time");
                }else{
                    canciones.remove(0);
                    System.out.println("Se borro la cancion de la biblioteca.");
                }
                break;
            case 2:
                System.out.println("Que desea hacer con la cancion?:\n 1-Reproducir\n 2-Eliminar");
                res=z.nextInt();
                if (res==1) {
                    System.out.println("Se esta respoduciendo: Man");
                }else{
                    canciones.remove(1);
                    System.out.println("Se borro la cancion de la biblioteca.");
                }
                break;
            case 3:
                System.out.println("Que desea hacer con la cancion?:\n 1-Reproducir\n 2-Eliminar");
                res=z.nextInt();
                if (res==1) {
                    System.out.println("Se esta respoduciendo: Issues");
                }else{
                    canciones.remove(2);
                    System.out.println("Se borro la cancion de la biblioteca.");
                }
                break;
            case 4:
                System.out.println("Que desea hacer con la cancion?:\n 1-Reproducir\n 2-Eliminar");
                res=z.nextInt();
                if (res==1) {
                    System.out.println("Se esta respoduciendo: Just like heaven");
                }else{
                    canciones.remove(3);
                    System.out.println("Se borro la cancion de la biblioteca.");
                }
                break;
            case 5:
                System.out.println("Que desea hacer con la cancion?:\n 1-Reproducir\n 2-Eliminar");
                res=z.nextInt();
                if (res==1) {
                    System.out.println("Se esta respoduciendo: All the stars");
                }else{
                    canciones.remove(4);
                    System.out.println("Se borro la cancion de la biblioteca.");
                }
                break;
            case 6:
                System.out.println("Que desea hacer con la cancion?:\n 1-Reproducir\n 2-Eliminar");
                res=z.nextInt();
                if (res==1) {
                    System.out.println("Se esta respoduciendo: Under Control");
                }else{
                    canciones.remove(5);
                    System.out.println("Se borro la cancion de la biblioteca.");
                }
                break;
            case 7:
                System.out.println("Que desea hacer con la cancion?:\n 1-Reproducir\n 2-Eliminar");
                res=z.nextInt();
                if (res==1) {
                    System.out.println("Se esta respoduciendo: Im born to run");
                }else{
                    canciones.remove(6);
                    System.out.println("Se borro la cancion de la biblioteca.");
                }
                break;
            case 8:
                System.out.println("Que desea hacer con la cancion?:\n 1-Reproducir\n 2-Eliminar");
                res=z.nextInt();
                if (res==1) {
                    System.out.println("Se esta respoduciendo: 20 de Enero");
                }else{
                    canciones.remove(7);
                    System.out.println("Se borro la cancion de la biblioteca.");
                }
                break;
                
            default:
                System.out.println("Cancion no encontrada.");
                break;
        }
        
    }
    
    
   
}
