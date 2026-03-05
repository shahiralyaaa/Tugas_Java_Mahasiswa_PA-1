import java.util.Scanner;
class Mahasiswa {
    String Nama;
    String NIM;
    String Jurusan;
    private double IPK;

    public Mahasiswa (String Nama, String NIM, String Jurusan) {
    this.Nama = Nama;
    this.NIM = NIM;
    this.Jurusan = Jurusan;

    }

    public String getNIM(){
        return NIM;
    }

    public double getIPK(){
        return IPK;
    }

    public void setIPK(double IPK){
        this.IPK = IPK;
    }

    public void updateIPK(double ipkBaru){
    this.IPK = ipkBaru;
    }

    public void cekKelulusan(){
        if(IPK >= 3.0){
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Belum Lulus");
        }
    }

    public void hitungPredikat(){
        if(IPK >= 3.75){
            System.out.println("Predikat: Dengan Pujian");
        } else if (IPK < 3.75 && IPK >= 3.50){
            System.out.println("Predikat: Sangat Memuaskan");
        } else if (IPK < 3.50 && IPK >= 3.00){
            System.out.println("Predikat: Memuaskan");
        } else {
            System.out.println("Predikat: Perlu Perbaikan");
        }
    }

    public void tampilkanInfo(){
        System.out.println("Nama: " + Nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Jurusan: " + Jurusan);
        System.out.println("IPK: " + IPK );
    }

}

public class Main {
    public static void main(String[] args) {
        
        Mahasiswa m1 = new Mahasiswa("Shahira", "2902721945", "Computer Science");
        m1.setIPK(3.8);

        Mahasiswa m2 = new Mahasiswa("Adam", "2902721946", "Computer Science");
        m2.setIPK(4.0);

        Mahasiswa m3 = new Mahasiswa("Budi", "2902721947", "Computer Science");
        m3.setIPK(3.6);

        Mahasiswa m4 = new Mahasiswa("Ana", "2902721948", "computer Science");
        m4.setIPK(3.3);

        Mahasiswa m5 = new Mahasiswa("Siti", "2902721949","Computer Science");
        m5.setIPK(2.9);

        Mahasiswa daftar[] = {m1, m2, m3, m4, m5};

        System.out.println("=== Data Mahasiswa ===");
        for(Mahasiswa m : daftar){
            m.tampilkanInfo();
            m.cekKelulusan();
            m.hitungPredikat();
            System.out.println();
        }

        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String cariNIM = input.nextLine();

        System.out.print("Masukkan IPK baru: ");
        double IPKBaru = input.nextDouble();

        for(Mahasiswa m : daftar){
            if(m.getNIM().equals(cariNIM)){
                m.updateIPK(IPKBaru);
                System.out.println("Data berhasil diperbarui!");
                m.tampilkanInfo();
            }
        }

        for(Mahasiswa m : daftar){
            m.tampilkanInfo();
            m.cekKelulusan();
            m.hitungPredikat();
            System.out.println();
        }

        input.close();
    }
}

    