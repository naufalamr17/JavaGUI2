/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NilaiMahasiswa;

import java.util.ArrayList;

/**
 *
 * @author Ammar
 */
public class InputData {

    ArrayList<Mahasiswa> listMahasiswa;

    InputData() {
        listMahasiswa = new ArrayList();
    }

    public void insertData(String NIM, String Nama, String Alamat, String Matkul, String NilaiAkhir) {
        Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat, Matkul, NilaiAkhir);
        listMahasiswa.add(mhs);
    }

    public ArrayList<Mahasiswa> getAll() {
        return listMahasiswa;
    }

    public void deleteData(int index) {
        listMahasiswa.remove(index);
    }
}
