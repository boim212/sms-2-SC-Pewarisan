package pewarisan;
public class Segitiga extends BangunDatar{
    private double alas, tinggi;

    public Segitiga() {
    }

    public Segitiga(String warna, String nama) {
        super(warna, nama);
    }

    public Segitiga(double alas, double tinggi, String warna, String nama) {
        super(warna, nama);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        if(alas < 0)
        {
            System.out.println("Alas Tidak Boleh Bernilai Negatif");
            System.out.println("Alas Tidak Berubah");
            System.out.println("");
        }
        else{
            this.alas = alas;
        }
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        if(tinggi < 0)
        {
            System.out.println("Alas Tidak Boleh Bernilai Negatif");
            System.out.println("Alas Tidak Berubah");
            System.out.println("");
        }
        else{
            this.tinggi = tinggi;
        }
    }

    @Override
    public double getKeliling() {
        double miring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        return (alas + tinggi + miring);
    }

    @Override
    public double getLuas() {
        return ((alas * tinggi) / 2);
    }
    
    
    
}
