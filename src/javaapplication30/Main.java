/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author Usuario
 */
public class Main {
    
    private final Tshirt tshirt;
    private final Pencil pencil;
    
    public Main(){
        tshirt = new Tshirt("L", 15);
        pencil = new Pencil ("azul", 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt("L", 15);
        Pencil pencil = new Pencil ("azul", 1);
        
        System.out.println("Su compra ha sido: " 
                + tshirt
                + pencil
                + ", el total es de "
                + (tshirt.getPrice()+pencil.getPrice()));
    }
    
}



















