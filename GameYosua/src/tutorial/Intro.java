package tutorial;

import java.io.Console;

/**
 * Mahasiswa
 */
class Mahasiswa {
    String nama     = "ian"     ;
    String alamat   = "bogor"   ;
    String nim      = "41210021";
    double ipk      = 3.1       ;
    int umur        = 30        ;

    // konstruktor adalah sebuah method yang akan di eksekusi ketika pembuatan objek
    // syarat nya adalah, nama method tersebut harus sama dengan nama class
    Mahasiswa(String nama, String alamat, String nim, double ipk, int umur) {

        this.nama = nama;
        this.alamat = alamat;
        this.nim = nim;
        this.ipk = ipk;
        this.umur = umur;

        // System.out.println("\n mengambil nilai dari class (this.nama) \n");

        // System.out.println("nama mahasiswa      : " + this.nama     );
        // System.out.println("alamat mahasiswa    : " + this.alamat   );
        // System.out.println("nim mahasiswa       : " + this.nim      );
        // System.out.println("ipk mahasiswa       : " + this.ipk      );
        // System.out.println("umur mahasiswa      : " + this.umur     );
        
        // System.out.println("\n mengambil nilai dari parameter construktor (nama) \n");

        // System.out.println("nama mahasiswa      : " + nama     );
        // System.out.println("alamat mahasiswa    : " + alamat   );
        // System.out.println("nim mahasiswa       : " + nim      );
        // System.out.println("ipk mahasiswa       : " + ipk      );
        // System.out.println("umur mahasiswa      : " + umur     );

    }

    //fungsi tanpa return
    void show(){
        System.out.println("nama mahasiswa      : " + this.nama     );
        System.out.println("alamat mahasiswa    : " + this.alamat   );
        System.out.println("nim mahasiswa       : " + this.nim      );
        System.out.println("ipk mahasiswa       : " + this.ipk      );
        System.out.println("umur mahasiswa      : " + this.umur     );
    }

    void update(String nama, String alamat, String nim, double ipk, int umur){
        this.nama = nama;
        this.alamat = alamat;
        this.nim = nim;
        this.ipk = ipk;
        this.umur = umur;
        System.out.println("\n update berhasil... \n ");
        }

    // method dengan return
    // nilai yang di return harus sesuai dengan tipe method
    String getName(){
        return this.nama;
    }
    
    String setName(String nama){
        this.nama=nama;
        return this.nama;
    }

}

public class Intro {
    public static void main(String[] args) {
        // System.out.println("ian");

        Mahasiswa Yosua = new Mahasiswa("Yosua Jelianvero Solissa","Cinere limo","4521210053",2.4,20);        
        
        // System.out.println(" \n \n konstruktor \n \n");
        
        // matikan semua comment yang ada pada construktor, dan beri comment pada baris 19 hingga 23

        System.out.println(" \n \n Materi Function/method \n \n");
        
        Yosua.show();
        Yosua.update("josua","sawangan","4521210051",3.4,10);
        Yosua.show();
        
        System.out.println("\n mengambil nama \n"      );
        System.out.println("\nOld Name :\n"            );
        System.out.println(Yosua.getName()               );
        System.out.println("\nNew Name :\n"            );
        System.out.println(Yosua.setName("ian")     );
        Yosua.show();
    }
}
