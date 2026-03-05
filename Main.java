import java.util.Scanner;

//class mahasiswa untuk menyimpan data mahasiswa (Jawaban no 1)
class Mahasiswa {
    String Nama;
    String NIM;
    String Jurusan;
    private double IPK;//IPK dibuat private hanya bisa diakses oleh getter/setter (Jawaban no 2)

    //constructor untuk menginisialisasi data mahasiswa (Jawaban no 1)
    public Mahasiswa (String Nama, String NIM, String Jurusan) {
    this.Nama = Nama;
    this.NIM = NIM;
    this.Jurusan = Jurusan;

    }

    //getter untuk mengambil NIM (Jawaban no 2)
    public String getNIM(){
        return NIM;
    }

    //getter untuk mengambil nilai IPK (Jawaban no 2)
    public double getIPK(){
        return IPK;
    }

    //setter untuk mengubah nilai IPK (Jawaban no 2)
    public void setIPK(double IPK){
        this.IPK = IPK;
    }

    //method untuk memperbarui nilai IPK (Jawaban no 2)
    public void updateIPK(double ipkBaru){
    this.IPK = ipkBaru;
    }

    //method untuk mengecek status kelulusan berdasarkan IPK (Jawaban no 2)
    public void cekKelulusan(){
        if(IPK >= 3.0){
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Belum Lulus");
        }
    }

    //method untuk menghitung predikat kelulusan berdasarkan rentang IPK (Jawaban no 3)
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

    //method tampilkaninfo utk menampilkan data mahasiswa (Jawaban no 1)
    public void tampilkanInfo(){
        System.out.println("Nama: " + Nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Jurusan: " + Jurusan);
        System.out.println("IPK: " + IPK );
    }

}

public class Main {
    public static void main(String[] args) {
        
        //membuat 5 objek mahasiswa dengan data yang berbeda (Jawaban no 1)
        Mahasiswa m1 = new Mahasiswa("Shahira", "2902721945", "Computer Science");
        m1.setIPK(3.8);

        Mahasiswa m2 = new Mahasiswa("Adam", "2902721946", "Psikologi");
        m2.setIPK(4.0);

        Mahasiswa m3 = new Mahasiswa("Budi", "2902721947", "Teknik Industri");
        m3.setIPK(3.6);

        Mahasiswa m4 = new Mahasiswa("Ana", "2902721948", "Hukum");
        m4.setIPK(3.3);

        Mahasiswa m5 = new Mahasiswa("Siti", "2902721949","Pendidikan Biologi");
        m5.setIPK(2.9);

        //menyimpan objek mahasiswa ke dalam array
        Mahasiswa daftar[] = {m1, m2, m3, m4, m5};

        //menampilkan seluruh data mahasiswa
        System.out.println("=== Data Mahasiswa ===");
        for(Mahasiswa m : daftar){
            m.tampilkanInfo();
            m.cekKelulusan();
            m.hitungPredikat();
            System.out.println();
        }

        Scanner input = new Scanner(System.in);
        
        //pengguna memasukkan NIM mahasiswa yang ingin diupdate
        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String cariNIM = input.nextLine();

        //pengguna memasukkan IPK yang ingin diupdate
        System.out.print("Masukkan IPK baru: ");
        double IPKBaru = input.nextDouble();

        //mencari mahasiswa berdasarkan NIM
        for(Mahasiswa m : daftar){
            if(m.getNIM().equals(cariNIM)){
                m.updateIPK(IPKBaru);
                System.out.println("Data berhasil diperbarui!");
                m.tampilkanInfo();
            }
        }

        //menampilkan seluruh data setelah diupdate
        for(Mahasiswa m : daftar){
            m.tampilkanInfo();
            m.cekKelulusan();
            m.hitungPredikat();
            System.out.println();
        }

        input.close();
    }
}