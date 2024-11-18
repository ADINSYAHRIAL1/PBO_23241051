class Data {
    // Data member atau variabel instance
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    // Konstruktor dengan modifier public
    public Data() {
        this.intPublic = 0;
        this.intPrivate = 100;
        this.doublePrivate = 0.0;
    }

    // Getter untuk intPrivate
    public int getIntPrivate() {
        return this.intPrivate;
    }

    // Setter untuk doublePrivate
    public void setDoublePrivate(double value) {
        this.doublePrivate = value;
    }

    // Method untuk mencetak data
    void cetak() {
        System.out.println("intPublic: " + this.intPublic);
        System.out.println("intPrivate: " + this.intPrivate);
        System.out.println("doublePrivate: " + this.doublePrivate);
    }
}

public class App {
    public static void main(String[] args) {
        // Instansiasi objek
        Data objek = new Data();

        // Membaca dan menulis menggunakan public
        // Tulis
        objek.intPublic = 5;
        // Baca
        System.out.println("Public : " + objek.intPublic);

        // Membaca menggunakan getter
        int angka = objek.getIntPrivate();
        System.out.println("Getter : " + angka);

        // Menulis menggunakan setter
        objek.setDoublePrivate(12.34);

        // Mencetak semua data menggunakan method cetak()
        objek.cetak();
    }
}
