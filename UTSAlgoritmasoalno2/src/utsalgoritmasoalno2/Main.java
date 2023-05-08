/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsalgoritmasoalno2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Member> daftarMember = new ArrayList<Member>();
    static ArrayList<Barang> daftarBarang = new ArrayList<Barang>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihanMenu = 0;
        do {
            System.out.println("Selamat datang di program supermarket!");
            System.out.println("Menu:");
            System.out.println("(1) Tambah Member");
            System.out.println("(2) Tambah Barang");
            System.out.println("(3) Lihat Daftar Member");
            System.out.println("(4) Lihat Daftar Barang");
            System.out.println("(5) Input Transaksi Pembelian");
            System.out.println("(6) Keluar");

            System.out.print("Pilihan Anda: ");
            pilihanMenu = scanner.nextInt();
            scanner.nextLine();

            switch (pilihanMenu) {
                case 1:
                    tambahMember();
                    break;
                case 2:
                    tambahBarang();
                    break;
                case 3:
                    lihatDaftarMember();
                    break;
                case 4:
                    lihatDaftarBarang();
                    break;
                case 5:
                    inputTransaksiPembelian();
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    break;
            }
        } while (pilihanMenu != 6);
    }

    static void tambahMember() {
        System.out.println("Membuat data member baru");
        System.out.print("Kode member: ");
        String kodeMember = scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Nomor telepon: ");
        String nomorTelepon = scanner.nextLine();

        Member newMember = new Member();
        newMember.setKodeMember(kodeMember);
        newMember.setNama(nama);
        newMember.setNomorTelepon(nomorTelepon);

        daftarMember.add(newMember);

        System.out.println("Data member berhasil ditambahkan!");
    }

    static void tambahBarang() {
        System.out.println("Membuat data barang baru");
        System.out.print("Kode barang: ");
        String kodeBarang = scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Harga: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();

        Barang newBarang = new Barang();
        newBarang.setKodeBarang(kodeBarang);
        newBarang.setNama(nama);
        newBarang.setHarga(harga);

        daftarBarang.add(newBarang);

        System.out.println("Data barang berhasil ditambahkan!");
    }

    static void lihatDaftarMember() {
        System.out.println("Daftar Member:");
        for (Member member : daftarMember) {
            System.out.println("Kode Member: " + member.getKodeMember());
            System.out.println("Nama: " + member.getNama());
            System.out.println("Nomor Telepon: " + member.getNomorTelepon());
            System.out.println();
        }
    }

    static void lihatDaftarBarang() {
    System.out.println("Daftar Barang:");
    for (Barang barang : daftarBarang) {
        System.out.println("Kode Barang: " + barang.getKodeBarang());
        System.out.println("Nama: " + barang.getNama());
        System.out.println("Harga: " + barang.getHarga());
        System.out.println();
    }
}

static void inputTransaksiPembelian() {
    System.out.println("Input transaksi pembelian");
    System.out.print("Kode member: ");
    String kodeMember = scanner.nextLine();
    Member member = findMemberByKode(kodeMember);
    if (member == null) {
        System.out.println("Kode member tidak ditemukan!");
        return;
    }
    System.out.print("Jumlah barang yang dibeli: ");
    int jumlahBarang = scanner.nextInt();
    scanner.nextLine();

    ArrayList<Barang> keranjangBelanja = new ArrayList<Barang>();
    for (int i = 0; i < jumlahBarang; i++) {
        System.out.print("Kode barang ke-" + (i+1) + ": ");
        String kodeBarang = scanner.nextLine();
        Barang barang = findBarangByKode(kodeBarang);
        if (barang == null) {
            System.out.println("Kode barang tidak ditemukan!");
            return;
        }
        keranjangBelanja.add(barang);
    }

    double totalHarga = 0;
    for (Barang barang : keranjangBelanja) {
        totalHarga += barang.getHarga();
    }

    System.out.println("Total harga: " + totalHarga);
    System.out.println("Terima kasih telah berbelanja di supermarket kami!");
}

static Member findMemberByKode(String kodeMember) {
    for (Member member : daftarMember) {
        if (member.getKodeMember().equals(kodeMember)) {
            return member;
        }
    }
    return null;
}

static Barang findBarangByKode(String kodeBarang) {
    for (Barang barang : daftarBarang) {
        if (barang.getKodeBarang().equals(kodeBarang)) {
            return barang;
        }
    }
    return null;
}
}