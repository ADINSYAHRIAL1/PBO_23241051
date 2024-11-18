public class HitungGajiBersih {
    // Atribut privat
    private int gajiPokok;
    private int tunjangan;
    private double pajak; // dalam persen

    // Setter dan Getter untuk atribut
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    public double getPajak() {
        return (gajiPokok + tunjangan) * pajak / 100; // Menghitung pajak dalam rupiah
    }

    // Metode untuk mencetak gaji bersih
    public void cetakGajiBersih() {
        double gajiBersih = gajiPokok + tunjangan - getPajak();
        System.out.println("Gaji Bersih: Rp " + gajiBersih);
    }

    // Metode utama untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek dari kelas HitungGajiBersih
        HitungGajiBersih pegawai = new HitungGajiBersih();

        // Mengisi data
        pegawai.setGajiPokok(6000000);
        pegawai.setTunjangan(1000000);
        pegawai.setPajak(15); // pajak 15%

        // Mencetak hasil
        System.out.println("Gaji Pokok: Rp " + pegawai.getGajiPokok());
        System.out.println("Tunjangan: Rp " + pegawai.getTunjangan());
        System.out.println("Pajak: Rp " + pegawai.getPajak());
        pegawai.cetakGajiBersih();
    }
}
