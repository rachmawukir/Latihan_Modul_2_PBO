package com.Rachma.LatihanModul2.Method;

public class Ikan extends Binatang {
    public String nama;
    public String berenang;

    public void getNama() {
        System.out.println("Nama Binatang\t: " + nama);
    }

    public void berenang() {
        System.out.println("Aktivitas\t\t: " + berenang);
    }
}
