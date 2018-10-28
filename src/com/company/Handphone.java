package com.company;

/**
 * @author
 * NAMA                 : Joseph Armando Carvallo
 * KELAS                : PBO2
 * NIM                  : 10117077
 * Deskripsi Program    : Menampilkan Spesifikasi handphone menggunakan inheritance dengan
 *                        super class yang berparameter
 **/

public class Handphone {
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    public Handphone(String man, String os, String model, int harga) {
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }

    public void displayProduct() {
        System.out.println("\nManufaktur : " + manufacture);
        System.out.println("OS : " + operatingSystem);
        System.out.println("Model : " + model);
        System.out.println("Harga : " + harga);
    }
}
