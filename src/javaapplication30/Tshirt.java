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
public class Tshirt extends Product {

    //Atributos
    private String size;

 

    /**
     * Observador de precio
     *
     * @return el valor del precio
     */
    
    public String getSize() {
        return size;
    }

    /**
     * Modificador de size
     *
     * @param size modifica el valor de size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Constructor con parametros
     * @param size
     * @param price 
     */
    public Tshirt(String size, double price) {
        super(price);
        this.size = size;
    }

    @Override
    public String toString() {
        return "una camiseta de "
                + "talla " + size
                + " cuyo precio es " + getPrice();
                
    }

    
    
    

}













