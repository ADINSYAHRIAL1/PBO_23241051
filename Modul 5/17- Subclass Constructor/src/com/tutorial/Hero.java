package com.tutorial;

public class Hero {
    String nama;
    double defencePower;
    double  attackPower;

    //Constructor
    Hero(String nama, double defencePower, double attackPower){
        this.nama = nama;
        this.defencePower = defencePower;
        this.attackPower = attackPower;

    }

    // method
    void cetak(){
        System.out.println(" nama : " +  this.nama);
        System.out.println(" Defence Power" + this.defencePower);
        System.out.println("attack Power" + this.attackPower);
    }
    
}
