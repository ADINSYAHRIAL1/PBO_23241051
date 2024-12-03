package com.tutorial;

class Player {
    //variabel
    private String nama;


    //construktor
    Player(String nama){
        this.nama = nama;
    }

    // method
    void cetak(){
        System.out.println("Nama : " + this.nama);
    } 
}
