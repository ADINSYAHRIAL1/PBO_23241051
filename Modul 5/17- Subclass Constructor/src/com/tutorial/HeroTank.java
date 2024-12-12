package com.tutorial;

public class HeroTank extends Hero{
    // atribut
    String atribut = "Tank";

    // method
    HeroTank(String nama,double defence, double attack){
        super(nama, defence, attack);

    }

    // overriding cetak()
    void cetak(){
        System.out.println("Hero : " + this.atribut);
        super.cetak();
    }
    
}
