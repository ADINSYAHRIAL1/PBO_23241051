package com.tutorial;

class Main {

    public static void main(String[] args) {
        // membuat objek
        Player player1 = new Player("Yorr");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Anya Forger");

        player1.cetak();
        player2.cetak();
        player3.cetak();
        player4.cetak();
    }
    
}
