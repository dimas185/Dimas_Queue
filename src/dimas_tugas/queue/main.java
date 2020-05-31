/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dimas_tugas.queue;
import java.util.Scanner;
/**
 *
 * @author PN BONDOWOSO
 */
public class main  {

    int angka; //Deklarasi variabel angka bertipe data integer
    main next; //Deklarasi varriabel next sebagai bagian dari class main
    static Scanner input = new Scanner(System.in); 
    /*Deklarasi variabel in sebagai bagian dari Scanner serta penambahan keyword 
    static agar kelas lain dapat mengakses tanpa melakukan inisiasi
    */

    public void input() {
        System.out.print("Masukkan angka        : "); //Perintah untuk menampilkan tulisan pada saat di run
        angka = input.nextInt(); //Deklarasi nilai angka sebagi inputan nilai integer
        next = null; //Pengindikasian dimana next bernilai null
    }

    public void baca() {
        System.out.println(angka); //Perintah untuk menampilkan angka pada saat di run
    }

    public static void main(String[] args) {
        int pilihan = 0; // Deklarasi variabel piliihan bernilai 0 dan bertipe integer
        Queue que = new Queue(); //Deklarasi variabel que pada queue
        while (pilihan != 4) { //Perulangan whille do dengan terdapat 4 kondisi
            System.out.println("1.Enqueue"); //Perintah menampilkan pilihan no 1 enqueue saat di run
            System.out.println("2.Dequeue"); //Perintah menampilkan pilihan no 2 dequeu saat di run
            System.out.println("3.View"); //Perintah menampilkan pilihan no 3 lihat saat di run
            System.out.println("4.Keluar"); //Perintah menampilkan pilihan no 4 keluar saat di run
            System.out.println("Masukkan pilihan : "); //Perintah menampilkan tulisan saat di run 
            pilihan = input.nextInt(); //Mengambil data pada input untuk digunakan pada variabel pilihan
            if (pilihan == 1) { // Kondisi dimana jika memilih pilihan 1
                que.enqueue(); //Mengambil fungsi pada void enqueque
            } else if (pilihan == 2) { //Kondisi dimana jika memilih pilihan 2
                que.dequeue(); //Mengambil fungsi pada void dequeue
            } else if (pilihan == 3) { // Kondisi dimana jika memilih pilihan 3
                que.lihat();// Mengambil fungsi void lihat
            } else if (pilihan == 4) { // Kondisi dimana jika memilih pilihan 4
                System.out.println("keluar"); //Perintah dimana muncul tulisan keluar saat memilih pilihan nomeor 4
            } else {
                System.out.println("Salah"); //Perintah dimana muncul tulisan salah ketika terjadi kondisi inputan nomor selain nomor 1-4
            }
            System.out.print(""); //Perintah untuk memunculkan jarak saat program berjalan
        }
    }
}
class Queue {

    main batasAtas;
    main batasBawah; //Deklarasi variabel dari class Main

    public Queue() {
        batasAtas = null; //Deklarasi nilai batasAtas yaitu null
        batasBawah = null; //Deklarasi nilai batasBawah yaitu null
    }

    public void enqueue() {
        main baru = new main(); //Deklarasi variabel baru pada main
        baru.input(); //Penginputan angka 
        if (batasAtas == null) { //Kondisi dimana jika batas atas bernilai null
            batasAtas = baru; //Nilai dari batas atas akan sama dengan baru yaitu inputan yang palling atas
        } else {
            batasBawah.next = baru; //Kondisi dimana jika batas atas tidak bernilai null maka batas baeah sebagai batas atas
        }
        batasBawah = baru;
    }
    /*
    void enqueue merupakan sebuah fungsi menambah data angka dimana data yg dimasukkan
    akan berada diurutan paling awal.Kemudian perintah main baru = new main() berguna
    membuat suatu angka baru berdasarkan input.Jika batas atas sma dengan null maka batas
    atas menjadi data awal dan akhir akan sama dengan baru.Lalu jika data awal tidak sama null
    maka akan menjalankan perintah batas bawah.next() = baru yg digunakan untuk menghubungkan
    data baru ke bagian bawah atau awal.
    */

    public void dequeue() {
        if (batasAtas == null) { //Kondisi dinaba jika nilai batas atas sama dengan null
            System.out.println("Kosong"); //Peerintah menampilkan tulisan kosong saat kondisi if terpenuhi
        } else {
            System.out.println("Keluar Data Dengan Angka : " + batasAtas.angka); //Perintah menampilkan tulisan jika kondisi if tidak terpenuhi
            batasAtas = batasAtas.next; //Kondisi dimana jika batas atas tidak bernilai null maka batas atas tetap menjadi batas atas
        }
    }
    /*
    void dequque yaitu fungsi menghapus data terbaru yg ditambahkan .Jika batas atas bernilai null maka program
    akan menampilkan kosong.Lalu jika batas atas tidak bernilai null maka program akan menampilkan tulisan keluar 
    data dengan angka diikuti angkanya serta menjalankan batasAtas = batasAtas diunakan untuk
    memindahkan batas atas ke bagian sebelum data terbaru.
    */

    public void lihat() { 
        if (batasAtas == null) { //Kondisi dinaba jika nilai batas atas sama dengan null
            System.out.println("Kosong"); //Peerintah menampilkan tulisan kosong saat kondisi if terpenuhi
        } else {
            System.out.println("Angka yang ada adalah :"); //Perintah menampilkan tulisan "Angka yang ada..."jika kondisi if tidak terpenuhi
            for (main a = batasAtas; a != null; a = a.next) { // Peulangan dimana a adalah batas atas dan a dalah negasi dari null 
                a.baca(); //a akan melakukan fungsi void baca yaitu menampilkan data yang tersimpanj
            }
        }
    }
}

