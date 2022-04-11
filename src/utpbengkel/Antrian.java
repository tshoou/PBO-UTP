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
public class Antrian {
    private String name;
    private String phoneNumber;
    private String licenseNumber;
    private Layanan[] layanans;
    private int totalPrice;

    // Helper index in layanans
    private int indexLayanan;

    // Constructor
    public Antrian(String name, String phoneNumber, String licenseNumber){
        setName(name);
        setPhoneNumber(phoneNumber);
        setLicenseNumber(licenseNumber);
        this.indexLayanan = 0;
        setLayanans(new Layanan[3]);
        setTotalPrice(0);
    }

    // Basic Setter

    public void setName(String name){
        this.name =  name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber =  phoneNumber;
    }

    public void setLicenseNumber(String licenseNumber){
        this.licenseNumber =  licenseNumber;
    }

    public void setLayanans(Layanan[] layanans){
        this.layanans = layanans;
    }

    public void setTotalPrice(int totalPrice){
        this.totalPrice = totalPrice;
    }

    // Basic Getters

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public String getLicenseNumber(){
        return licenseNumber;
    }

    public Layanan[] getLayanan(){
        return layanans;
    }
    
    public int getTotalPrice(){
        
        return totalPrice;
    }

    // Public helper getFormatted Price
    // Ini nanti juga ditanyakan
    public String getFormattedPrice(){
        return Helper.getFormattedPrice(getTotalPrice());
    }

    // To String return a formattet string of layanan
    // Mengembalikan formatted string terhadap Antrian sesuai dengan gambar yang terlampir
    public String toString(){
        // Rubah Kode di sini
        return "Name: " + name + "\nPrice: " + getFormattedPrice();
    }

    // Helper untuk menambahkan layanan
    // Fungsi helper ketika akan menambahkan daftar layanan
    public void addLayanan(Layanan layanan){
        // Rubah kode di sini
        Layanan layanan1 = new Layanan("Ganti Oli", 500000);
        Layanan layanan2 = new Layanan("Operasi Mobil", 2000000, "Mobil Anda mengalami mogok mendadak? Tidak bisa dinyalakan? Tenang, kami\n" +
                "memiliki tenaga ahli untuk mengoperasi mobil Anda. Cukup dengan Rp. 2.000.000,\n" +
                "mobil Anda akan sehat seperti sedia kala");
        Layanan layanan3 = new Layanan("Ketok Magic", 3000000, "Ketok Magic adalah layanan sulap untuk menghilangkan penyok pada body mobil.\n" +
                "Apapun masalahnya, BIM SALABIM, bakal waras! Rogoh kantong Anda\n" +
                "sebanyak Rp. 3.000.000 dan dapatkan mobil baru seperti sedia kala.");
        Layanan layanan4 = new Layanan("Mobil Racing", 5000000, "Bagi kalian jiwa muda yang ingin balapan, kami bisa modifikasi mobil kalian\n" +
                "dengan tambahan NOS, serta body standar untuk balapan seharga Rp. 5.000.000\n" +
                "saja dan mobil Anda siap untuk menembus angin.");
        Layanan layanan5 = new Layanan("Modifikasi Mobil Elektrik", 5500000, "Modifikasi ini adalah modifikasi baru pada layanan bengkel kami, dimana Anda\n" +
                "dapat mengubah mesin yang bertenagakan fosil menjadi bertenaga listrik dengan\n" +
                "harga Rp. 5.500.000.");
        
    }

    // Helper untuk menambahkan totalPrice
    // Fungsi helper ketika akan menambahkan totalPrice
    public void addTotalPrice(int layananPrice){
        // Rubah kode di sini
    }
}
