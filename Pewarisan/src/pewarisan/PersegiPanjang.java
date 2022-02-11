package pewarisan;
public class PersegiPanjang extends SegiEmpat{

    public PersegiPanjang() {
    }

    public PersegiPanjang(double panjang, double lebar, String warna, String nama) {
        super(panjang, lebar, warna, nama);
    }
    
    
    @Override
    public double getKeliling(){
        return (2 * (super.getPanjang() + super.getLebar()) );
    }
}
