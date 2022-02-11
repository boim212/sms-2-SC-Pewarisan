package pewarisan;
public class Persegi extends SegiEmpat{

    private double sisi;

    public Persegi() {
    }

    public Persegi(double sisi, String warna, String nama) {
        super(warna, nama);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        if(sisi > 0){
            this.sisi = sisi;
        }else{
            this.sisi = 1.0;
            System.out.println("Sisi Tidak boleh negatif dan sisi tidak berubah");
        }
    }
    
    @Override
    public double getLuas() {
        return (sisi * sisi);
    }

    @Override
    public double getKeliling() {
        return (4 * sisi);
    }
    
}
