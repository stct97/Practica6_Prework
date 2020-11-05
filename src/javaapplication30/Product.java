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
public class Product {

    //Atributos
    private double price;

    /**
     * Modificador de precio del producto
     *
     * @param price modifica el precio
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Observador de el atributo price ya que es privado
     *
     * @return el valor del precio
     */
    public double getPrice() {
        return price;
    }

    /**
     * Constructor de precio
     *
     * @param price
     */
    public Product(double price) {
        this.price = price;
    }

}

