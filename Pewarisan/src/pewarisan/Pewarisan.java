package pewarisan;

import java.util.Scanner;

public class Pewarisan {
    public static void main(String[] args) 
    {
        double jejari, sisiPersegi, panjang, lebar,alas, tinggi;
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("=           Program Pewarisan         =");
        System.out.println("=======================================");
        System.out.println("= PERINGATAN!! Untuk Pengimputan Nama =");
        System.out.println("= Harus Menggunakan Tanda Pengghubung =");
        System.out.println("= Atau Anda Bisa Menggunakan Penulisan=");
        System.out.println("= Punggung Onta misal (lingkaranSatu) =");
        System.out.println("=======================================");
        System.out.println("Perhitungan Lingkaran");
        
        do{
            System.out.print  ("Input Jejari = ");
            jejari = sc.nextDouble();
            
        }while(jejari < 1);
        
        System.out.print  ("Input Nama Bangun Datar = ");
        String namaLingkaran = sc.next();
        
        System.out.print  ("Input Warna Bangun Datar = ");
        String warnaLingkaran = sc.next();
        System.out.println("");
        //lingkaran
        Lingkaran lingkaran1 = new Lingkaran(jejari,warnaLingkaran,namaLingkaran);
        
        System.out.println("Perhitungan Persegi");
        do{
            System.out.print  ("Input Sisi = ");
            sisiPersegi = sc.nextDouble();
        }while(sisiPersegi < 1);
        
        System.out.print  ("Input Nama Bangun Datar = ");
        String namaPersegi = sc.next();
        
        System.out.print  ("Input Warna Bangun Datar = ");
        String warnaPersegi = sc.next();
        System.out.println("");
        //persegi
        Persegi persegi1 = new Persegi(sisiPersegi, warnaPersegi, namaPersegi);
        
        System.out.println("Perhitungan Persegi Panjang");
        do{
            System.out.print  ("Input Panjang = ");
            panjang = sc.nextDouble();
        }while(panjang < 1);
        
        do{
            System.out.print  ("Input Lebar = ");
            lebar = sc.nextDouble();
        }while (lebar < 1);
        
        System.out.print  ("Input Nama Bangun Datar = ");
        String namaPersegiPanjang = sc.next();
        
        System.out.print  ("Input Warna Bangun Datar = ");
        String warnaPersegiPanjang = sc.next();
        System.out.println("");
        //persegi panjang
        PersegiPanjang persegiPanjang1 = new PersegiPanjang(panjang, lebar,warnaPersegiPanjang,namaPersegiPanjang);
        
        double sisiA,sisiB,sisiC;
        System.out.println("Perhitungan Segitiga Sama Sisi");
        System.out.println("Sisi Tidak Boleh Bernilai Berbeda Dan Tidak Boleh Kurang dari 1");
        do{
            System.out.print  ("Input Sisi A = ");
             sisiA = sc.nextDouble();

            System.out.print  ("Input Sisi B = ");
             sisiB = sc.nextDouble();

            System.out.print("Input Sisi C = ");
             sisiC = sc.nextDouble();
        }while(sisiA != sisiB || sisiC != sisiA || sisiB != sisiC || sisiA < 1 || sisiB < 1 || sisiC < 1);
        
        System.out.print  ("Input Nama Bangun Datar = ");
        String namaSegitigaSamaSisi = sc.next();
        
        System.out.print  ("Input Warna Bangun Datar = ");
        String warnaSegitigaSamaSisi = sc.next();
        System.out.println("");
        //segitiga sama sisi
        SegitigaSamaSisi segitigaSamaSisi1 = new SegitigaSamaSisi(sisiA,sisiB,sisiC,warnaSegitigaSamaSisi,namaSegitigaSamaSisi);
        
        System.out.println("Perhitungan Segitiga Siku Siku");
        do{
            System.out.print  ("Input alas = ");
            alas = sc.nextDouble();
        }while(alas < 1);
        
        do{
            System.out.print  ("Input tinggi = ");
            tinggi = sc.nextDouble();
        }while(tinggi < 1);
        
        System.out.print  ("Input Nama Bangun Datar = ");
        String namaSegitigaSikuSiku = sc.next();
        
        System.out.print  ("Input Warna Bangun Datar = ");
        String warnaSegitigaSikuSiku = sc.next();
        System.out.println("");
        
        //segitiga siku siku
        SegitigaSikuSiku segitigaSikuSiku1 = new SegitigaSikuSiku(alas,tinggi,warnaSegitigaSikuSiku,namaSegitigaSikuSiku);
        
        
        //print out hasil
        System.out.println("==================================================");
        System.out.println("        Hasil Perhitungan Bangun Lingkaran        ");
        System.out.println("==================================================");
        System.out.println("Nama Bangun Datar = " + namaLingkaran);
        System.out.println("Warna = " + warnaLingkaran);
        System.out.println("Jejari = " + jejari);
        System.out.printf ("Luas = %.1f \n", lingkaran1.getLuas());
        System.out.printf ("Keliling = %.1f \n", lingkaran1.getKeliling());
        
        System.out.println("==================================================");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        System.out.println("         Hasil Perhitungan Bangun Persegi         ");
        System.out.println("==================================================");
        System.out.println("Nama Bangun Datar = " + namaPersegi);
        System.out.println("Warna = " + warnaPersegi);
        System.out.println("Sisi = " + sisiPersegi);
        System.out.printf ("Luas = %.1f \n", persegi1.getLuas());
        System.out.printf ("Keliling = %.1f \n", persegi1.getKeliling());
        
        System.out.println("==================================================");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        System.out.println("     Hasil Perhitungan Bangun Persegi Panjang     ");
        System.out.println("==================================================");
        System.out.println("Nama Bangun Datar = " + namaPersegiPanjang);
        System.out.println("Warna = " + warnaPersegiPanjang);
        System.out.println("Panjang = " + panjang);
        System.out.println("Lebar = " + panjang);
        System.out.printf ("Luas = %.1f \n", persegiPanjang1.getLuas());
        System.out.printf ("Keliling = %.1f \n", persegiPanjang1.getKeliling());
        System.out.println("==================================================");
        
        System.out.println("==================================================");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        System.out.println("    Hasil Perhitungan Bangun Segitiga Sama Sisi   ");
        System.out.println("==================================================");
        System.out.println("Nama Bangun Datar = " + namaSegitigaSamaSisi);
        System.out.println("Warna = " + warnaSegitigaSamaSisi);
        System.out.println("Sisi A = " + sisiA);
        System.out.println("Sisi B = " + sisiB);
        System.out.println("Sisi C = " + sisiC);
        System.out.printf ("Luas = %.1f \n", segitigaSamaSisi1.getLuas());
        System.out.printf ("Keliling = %.1f \n", segitigaSamaSisi1.getKeliling());
        System.out.println("==================================================");
        
        System.out.println("==================================================");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        System.out.println("      Hasil Perhitungan Bangun Persegi Panjang    ");
        System.out.println("==================================================");
        System.out.println("Nama Bangun Datar = " + namaSegitigaSikuSiku);
        System.out.println("Warna = " + warnaSegitigaSikuSiku);
        System.out.println("Alas = " + alas);
        System.out.println("Tinggi = " + tinggi);
        System.out.printf ("Luas = %.1f \n", segitigaSikuSiku1.getLuas());
        System.out.printf ("Keliling  = %.1f \n",segitigaSikuSiku1.getKeliling());
        System.out.println("==================================================");
    }
    
    
}
