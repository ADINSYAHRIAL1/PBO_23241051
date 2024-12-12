package com.tutorial;

// ini Sub Class
public class HeroTank extends Hero {
    // overriding 
    double defencePower;

    // overridng method
    void cetak(){
        System.out.println("Hero dari SubClass");
        System.out.println("Hero Tank");
        System.out.println("Hero Name " + this.nama);
        System.out.println(" Defence Power" + this.defencePower);
    }
    
}
