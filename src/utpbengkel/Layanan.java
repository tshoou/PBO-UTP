/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utpbengkel;

/**
 *
 * @author tuffa
 */
public class Layanan {
    private String name;
    private int price;
    private String description;

    // Constructor

    // Constructor
    public Layanan(String name, int price){
        setName(name);
        setPrice(price);
    }

    public Layanan(String name, int price, String description){
        setName(name);
        setPrice(price);
        setDescription(description);
    }

    // Basic Setter

    public void setName(String name){
        this.name =  name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setDescription(String description){
        this.description =  description;
    }

    // Basic Getters

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

     // Public helper getFormatted Price
    // Mengembalikan string dengan format misalkan Rp. 1,000
    // Lihat Fungsi getFormattedPrice pada Helper.java
    public String getFormattedPrice(){
        // Rubah kode di sini
        return Helper.getFormattedPrice(price);
    }

    // To String return a formattet string of layanan
    // Mengembalikan string format yang bersesuaian dengan gambar pada lampiran
    public String toString(){
        return "Name: " + name + "\nPrice: " + getFormattedPrice();

    }
}
