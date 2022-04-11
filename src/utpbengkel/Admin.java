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
class Admin {
    private static String name;
    private static String password;

    // Constructor
    public Admin(String name, String password){
        setName(name);
        setPassword(password);
    }

    // Basic Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Basic Getters

    public static String getName() {
        return name;
    }

    public static String getPassword() {
        return password;
    }

    // To String return a formattet string of admin
    // Mengembalikan formatted string sesuai dengan contoh g
    public String toString() {
        return String.format("Name\t\t: %s \n", getName());
    }

    // Is match with Name and Password
    // Mengembalikan nilai perbandingan dari nama dan password dari suatu admin
    // Berhubungan dengan fungsi authentication pada "Helper.java"
    public static boolean isMatch(String name, String password){
        // Rubah kode di sini
         if(name.equals(getName()) && password.equals(getPassword())){
            return true;
        }
        else{
            return false;
        }
    }
}
