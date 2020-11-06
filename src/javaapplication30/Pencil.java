/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author Niebla20
 */
public class Pencil extends Product {
    private String colour;

    public Pencil(double price) {
        super(price);
    }
    
    public void setColour(String colour){
        this.colour = colour;
    }
    
    public String getColour(){
        return colour;
    }
    
    public Pencil (String colour, double price){
        super(price);
        this.colour = colour;
    }
    
    @Override
    public String toString(){
        return " y un lapiz de color " + colour +
                " cuyo precio es " + getPrice();
    }
}




