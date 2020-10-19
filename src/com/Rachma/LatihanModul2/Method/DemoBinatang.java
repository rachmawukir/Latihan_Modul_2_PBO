package com.Rachma.LatihanModul2.Method;

public class DemoBinatang {
    public static void main(String[] args) {
        Burung burung = new Burung();
        burung.nama = "Burung Hantu";
        burung.makan = "Burung Hantu memakan daging";
        burung.tidur = "Burung Hantu tidur pada siang hari";
        burung.terbang = "Burung Hantu terbang menggunakan sayap";

        System.out.println("\t\t\t\t\tBurung");
        burung.getNama();
        burung.binatang();
        burung.terbang();

        System.out.println();

        Ikan ikan = new Ikan();
        ikan.nama = "Ikan Cupang";
        ikan.makan = "Ikan Cupang memakan nyamuk mati";
        ikan.tidur = "Ikan Cupang tidur pada malam hari";
        ikan.berenang = "Ikan Cupang berenang menggunakan sirip";

        System.out.println();

        System.out.println("\t\t\t\t\tIkan");
        ikan.getNama();
        ikan.binatang();
        ikan.berenang();

        System.out.println();

        Kucing kucing = new Kucing();
        kucing.nama = "Kucing Kampung";
        kucing.makan = "Kucing Kampung memakan ikan asin";
        kucing.tidur = "Kucing Kampung tidur pada malam hari";
        kucing.meong = "Kucing Anggora mengeluarkan bunyi meong ketika lapar";

        System.out.println("\t\t\t\t\tKucing");
        kucing.getNama();
        kucing.binatang();
        kucing.meong();
    }
}
