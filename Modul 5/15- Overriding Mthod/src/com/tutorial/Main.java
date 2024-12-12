package com.tutorial;

public class Main {

    public static void main(String[] args) {
        // objek dari supperclass
        Hero hero1 = new Hero();
        hero1.nama = "saitama";
        System.out.println("Hero dari SupperClass");
        hero1.cetak();


        // membuat objek dariSubClass
        HeroTank hero2 = new HeroTank();
        hero2.nama = "naruto";
        hero2.defencePower = 100;
        hero2.cetak();
    }
}