package com.github.mmdemirbas.whiteboard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        double normalTutar, yasİndirimi, indirimliTutar, gidisDonüsİndirimi, sonİndirimliTutar;
        int    yolculukTipi, mesafe, yas;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Gideceğiniz Mesafeyi Km cinsinden giriniz: ");
        mesafe = scanner.nextInt();

        if (mesafe < 300) {
            System.err.println("Hatalı Giriş Yaptınız. Dikkat 300 km Altında Uçak seyatlerimiz bulunmamaktadır.");
            return;
        }

        System.out.print("Lütfen yaşınızı giriniz: ");
        yas = scanner.nextInt();

        if (yas <= 0) {
            System.err.println("Hatalı Giriş Yaptınız. Yaş pozitif bir sayı olmak zorundadır.");
            return;
        }

        System.out.print("Lütfen Yolculuk Tipini (gidiş veya dönüş=1, gidiş-dönüş =2) giriniz : ");
        yolculukTipi = scanner.nextInt();

        if (yolculukTipi != 1 && yolculukTipi != 2) {
            System.err.println("Hatalı Giriş Yaptınız. Yolculuk tipi 1 veya 2 olmak zorundadır.");
            return;
        }

        //  ..0   OK
        // 0..12  OK
        // 13..24 OK
        // 25..64 OK
        // 65..   OK

        if (yolculukTipi == 2) {
            if (yas <= 12) {
                normalTutar = mesafe * 0.10;
                yasİndirimi = normalTutar * 0.50;
                indirimliTutar = normalTutar - yasİndirimi;
                gidisDonüsİndirimi = indirimliTutar * 0.20;
                sonİndirimliTutar = indirimliTutar - gidisDonüsİndirimi;


                System.out.println("Bilet Fiyatı = " + normalTutar);
                System.out.println("Güncel İndirimliBilet Fiyatınız : " + sonİndirimliTutar);
            } else if (yas <= 24) {
                normalTutar = mesafe * 0.10;
                yasİndirimi = normalTutar * 0.10;
                indirimliTutar = normalTutar - yasİndirimi;
                gidisDonüsİndirimi = indirimliTutar * 0.20;
                sonİndirimliTutar = indirimliTutar - gidisDonüsİndirimi;


                System.out.println("Bilet Fiyatı = " + normalTutar);
                System.out.println("Güncel İndirimliBilet Fiyatınız : " + sonİndirimliTutar);
            } else if (yas <= 64) {

                normalTutar = mesafe * 0.10;
                yasİndirimi = normalTutar * 0.20;
                indirimliTutar = normalTutar - yasİndirimi;

                System.out.println("Bilet Fiyatı = " + normalTutar);
                System.out.println("Yaş İndirimli Tutar  = " + indirimliTutar);

            } else { // > 65
                normalTutar = mesafe * 0.10;
                yasİndirimi = normalTutar * 0.50;
                indirimliTutar = normalTutar - yasİndirimi;
                gidisDonüsİndirimi = indirimliTutar * 0.30;
                sonİndirimliTutar = indirimliTutar - gidisDonüsİndirimi;


                System.out.println("Bilet Fiyatı = " + normalTutar);
                System.out.println("Güncel İndirimliBilet Fiyatınız : " + sonİndirimliTutar);
            }

        } else {


            if (yas <= 12) {

                normalTutar = mesafe * 0.10;
                yasİndirimi = normalTutar * 0.50;
                indirimliTutar = normalTutar - yasİndirimi;
                gidisDonüsİndirimi = indirimliTutar * 1.0;
                sonİndirimliTutar = indirimliTutar - gidisDonüsİndirimi;


                System.out.println("Bilet Fiyatı = " + normalTutar);
                System.out.println("Güncel İndirimliBilet Fiyatınız : " + sonİndirimliTutar);

            } else if (yas <= 24) {
                normalTutar = mesafe * 0.10;
                yasİndirimi = normalTutar * 0.10;
                indirimliTutar = normalTutar - yasİndirimi;
                gidisDonüsİndirimi = indirimliTutar * 1.0;
                sonİndirimliTutar = indirimliTutar - gidisDonüsİndirimi;


                System.out.println("Bilet Fiyatı = " + normalTutar);
                System.out.println("Güncel İndirimliBilet Fiyatınız : " + sonİndirimliTutar);
            } else if (yas <= 64) {


                normalTutar = mesafe * 0.10;


                System.out.println("Bilet Fiyatı = " + normalTutar);


            } else { // > 65

                normalTutar = mesafe * 0.10;
                yasİndirimi = normalTutar * 0.50;
                indirimliTutar = normalTutar - yasİndirimi;
                gidisDonüsİndirimi = indirimliTutar * 1.0;
                sonİndirimliTutar = indirimliTutar - gidisDonüsİndirimi;


                System.out.println("Bilet Fiyatı = " + normalTutar);
                System.out.println("Güncel İndirimliBilet Fiyatınız : " + sonİndirimliTutar);

            }

        }
    }
}