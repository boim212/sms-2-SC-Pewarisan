package pewarisan;
public class SegitigaSamaSisi extends Segitiga{
    private double sisiAB, sisiBC, sisiCA;
    

    public SegitigaSamaSisi(double sisiAB, double sisiBC, double sisiCA) {
        this.sisiAB = sisiAB = 1.0;
        this.sisiBC = sisiBC = 1.0;
        this.sisiCA = sisiCA = 1.0;
    }

    public SegitigaSamaSisi(double sisiAB, double sisiBC, double sisiCA, String warna, String nama) {
        super(warna, nama);
        this.sisiAB = sisiAB;
        this.sisiBC = sisiBC;
        this.sisiCA = sisiCA;
    }

    public SegitigaSamaSisi() {
    }

    public double getSisiAB() {
        if (sisiAB < 0 )
            sisiAB = 0;
        else if(sisiAB == 0 || sisiAB == 3)
            sisiAB = 1.0;
        
        return sisiAB;
    }

    public void setSisiAB(double sisiAB) {
        if(sisiAB < 0)
            this.sisiAB = 1.0;
        else
            this.sisiAB = sisiAB;
    }

    public double getSisiBC() {
        if (sisiBC < 0)
            sisiBC = 0;
        else if(sisiBC == 0 || sisiBC == 3)
            sisiBC = 1.0;
        return sisiBC;
    }

    public void setSisiBC(double SisiBC) {
        if(SisiBC < 0)
            this.sisiBC = 1.0;
        else
            this.sisiBC = SisiBC;
    }

    public double getSisiCA() {
        if (sisiCA < 0)
            sisiCA = 0;
        else if(sisiCA == 0 || sisiCA == 3)
            sisiCA = 1.0;
        return sisiCA;
    }

    public void setSisiC(double sisiCA) {
        if(sisiCA < 0)
            this.sisiCA = 1.0;
        else
            this.sisiCA = sisiCA;
    }
    @Override
    public double getKeliling() {
        return (getSisiAB() + getSisiBC() + getSisiCA());
    }

    @Override
    public double getLuas() {
        
        double tinggi = Math.sqrt(Math.pow(sisiAB, 2)-Math.pow((0.5 * sisiAB), 2));
        return (0.5 * sisiAB * tinggi);
    }
    
}
