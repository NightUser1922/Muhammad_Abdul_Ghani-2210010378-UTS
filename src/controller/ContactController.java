package controller;

import java.util.ArrayList;
import model.Contact;

public class ContactController {
    private ArrayList<Contact> daftarKontak = new ArrayList<>();

    public void tambah(Contact c) {
        daftarKontak.add(c);
    }

    public void ubah(int index, Contact c) {
        daftarKontak.set(index, c);
    }

    public void hapus(int index) {
        daftarKontak.remove(index);
    }

    public ArrayList<Contact> getAll() {
        return daftarKontak;
    }

    public Contact get(int index) {
        return daftarKontak.get(index);
    }

    public int getSize() {
        return daftarKontak.size();
    }
}
