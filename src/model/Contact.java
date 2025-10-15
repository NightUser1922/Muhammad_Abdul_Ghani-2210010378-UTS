package model;

public class Contact {
    private String nama;
    private String telepon;
    private String email;

    public Contact(String nama, String telepon, String email) {
        this.nama = nama;
        this.telepon = telepon;
        this.email = email;
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getTelepon() { return telepon; }
    public void setTelepon(String telepon) { this.telepon = telepon; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
