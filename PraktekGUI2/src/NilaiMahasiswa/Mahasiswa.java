/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NilaiMahasiswa;

/**
 *
 * @author Ammar
 */
public class Mahasiswa {

    private String NIM, Nama, Alamat, Matkul, NilaiAkhir;

    public Mahasiswa(String NIM, String Nama, String Alamat, String Matkul, String NilaiAkhir) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Matkul = Matkul;
        this.NilaiAkhir = NilaiAkhir;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getMatkul() {
        return Matkul;
    }

    public String getNilaiAkhir() {
        return NilaiAkhir;
    }
}
