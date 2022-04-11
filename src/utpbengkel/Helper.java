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
public class Helper {
    // Helper to initialize
    static void initialize(){
        // Initilaize admin
        UTPBengkel.admins[0] = new Admin("Joko", "ini_password_joko");
        UTPBengkel.admins[1] = new Admin("Dengklek", "ini_password_dengklek");
        
        // Initialize Layanan
//        UTPBengkel == main
        UTPBengkel.layanans[0] = new Layanan("Ganti Oli", 500000);
        UTPBengkel.layanans[1] = new Layanan("Operasi Mobil", 2000000, "Mobil Anda mengalami mogok mendadak? Tidak bisa dinyalakan? Tenang, kami\n" +
                "memiliki tenaga ahli untuk mengoperasi mobil Anda. Cukup dengan Rp. 2.000.000,\n" +
                "mobil Anda akan sehat seperti sedia kala");
        UTPBengkel.layanans[2]= new Layanan("Ketok Magic", 3000000, "Ketok Magic adalah layanan sulap untuk menghilangkan penyok pada body mobil.\n" +
                "Apapun masalahnya, BIM SALABIM, bakal waras! Rogoh kantong Anda\n" +
                "sebanyak Rp. 3.000.000 dan dapatkan mobil baru seperti sedia kala.");
        UTPBengkel.layanans[3] = new Layanan("Mobil Racing", 5000000, "Bagi kalian jiwa muda yang ingin balapan, kami bisa modifikasi mobil kalian\n" +
                "dengan tambahan NOS, serta body standar untuk balapan seharga Rp. 5.000.000\n" +
                "saja dan mobil Anda siap untuk menembus angin.");
        UTPBengkel.layanans[4] = new Layanan("Modifikasi Mobil Elektrik", 5500000, "Modifikasi ini adalah modifikasi baru pada layanan bengkel kami, dimana Anda\n" +
                "dapat mengubah mesin yang bertenagakan fosil menjadi bertenaga listrik dengan\n" +
                "harga Rp. 5.500.000.");
        // Masukkan daftar-daftar layanan bersesuaian dengan dokumen
    }

    // Helper function to authentication
    // Fungsi yang digunakan untuk "melakukan loop" pada iterasi admins
    static boolean authentication(String username, String password) {
        // Rubah Kode di sini
    if(username.equals(UTPBengkel.admins[0].getName()) && password.equals(UTPBengkel.admins[0].getPassword())){
            System.out.println("Selamat Anda Login Berhasil");
            return true;
        }
        else if(username.equals(UTPBengkel.admins[1].getName()) && password.equals(UTPBengkel.admins[1].getPassword())){
            System.out.println("Selamat Anda Login Berhasil");
            return true;
        }
        else{
            System.out.println("Username atau Password salah!");
            return false;
        }
    }

    // Helper to format price to rupiah
    static String getFormattedPrice(int price){
        return String.format("Rp. %,d", price);
    }
}
