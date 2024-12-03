package com.tutorial;

// keywoard untuk import package eksternal
import com.terminal.Console;

class Main {
    public static void main(String[] args) {
        // membuat objek
        Player player1 = new Player("istigfar");
        Player player2 = new Player("Alhamdulillah");
        Player player3 = new Player("Bsimillah");
        player1.cetak();
        player2.cetak();
        player3.cetak();
        
        Console.log("yes");
    }
}
