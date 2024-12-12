package com.tutorial;

class Player {
   // atribut
   private String name;
   private static int jumlahPlayer;

   // construktor
   // opsi pertama membuat objek
   Player(String name){
        Player.jumlahPlayer++;
        this.name = name;

   }

   // overloading constructor
   // opsi kedua membuat objek default tanpa nama
   Player(){
        Player.jumlahPlayer++;
        this.name = "player" + Player.jumlahPlayer;
   }

   // method
   void cetak(){ 
        System.out.println("Name : " + this.name);
   }
}
