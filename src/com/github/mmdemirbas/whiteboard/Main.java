package com.github.mmdemirbas.whiteboard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        double normalTutar, yasİndirimi, indirimliTutar, gidisDonüsİndirimi, sonİndirimliTutar;
        int    yolculukTipi, mesafe, yas;
        double yasIndirimOrani;


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

        // Yaş indirimine karar ver
        if (yolculukTipi == 2) {
            if (yas <= 12) {
                yasIndirimOrani = 0.50;
            } else if (yas <= 24) {
                yasIndirimOrani = 0.10;
            } else if (yas <= 64) {
                yasIndirimOrani = 0.20;
            } else { // > 65
                yasIndirimOrani = 0.50;
            }
        } else {
            if (yas <= 12) {
                yasIndirimOrani = 0.50;
            } else if (yas <= 24) {
                yasIndirimOrani = 0.10;
            } else if (yas <= 64) {
                yasIndirimOrani = 0.00;
            } else { // > 65
                yasIndirimOrani = 0.50;
            }
        }

        normalTutar = mesafe * 0.10;

        if (yolculukTipi == 2) {
            if (yas <= 12) {
                yasİndirimi = normalTutar * yasIndirimOrani;
                indirimliTutar = normalTutar - yasİndirimi;
                gidisDonüsİndirimi = indirimliTutar * 0.20;
                sonİndirimliTutar = indirimliTutar - gidisDonüsİndirimi;

                System.out.println("Bilet Fiyatı = " + normalTutar);
                System.out.println("Güncel İndirimliBilet Fiyatınız : " + sonİndirimliTutar);
            } else if (yas <= 24) {
                yasİndirimi = normalTutar * yasIndirimOrani;
                indirimliTutar = normalTutar - yasİndirimi;
                gidisDonüsİndirimi = indirimliTutar * 0.20;
                sonİndirimliTutar = indirimliTutar - gidisDonüsİndirimi;


                System.out.println("Bilet Fiyatı = " + normalTutar);
                System.out.println("Güncel İndirimliBilet Fiyatınız : " + sonİndirimliTutar);
            } else if (yas <= 64) {
                yasİndirimi = normalTutar * yasIndirimOrani;
                indirimliTutar = normalTutar - yasİndirimi;

                System.out.println("Bilet Fiyatı = " + normalTutar);
                System.out.println("Yaş İndirimli Tutar  = " + indirimliTutar);

            } else { // > 65
                yasİndirimi = normalTutar * yasIndirimOrani;
                indirimliTutar = normalTutar - yasİndirimi;
                gidisDonüsİndirimi = indirimliTutar * 0.30;
                sonİndirimliTutar = indirimliTutar - gidisDonüsİndirimi;


                System.out.println("Bilet Fiyatı = " + normalTutar);
                System.out.println("Güncel İndirimliBilet Fiyatınız : " + sonİndirimliTutar);
            }

        } else {
            if (yas <= 12) {
                yasİndirimi = normalTutar * yasIndirimOrani;
                indirimliTutar = normalTutar - yasİndirimi;
                gidisDonüsİndirimi = indirimliTutar * 1.0;
                sonİndirimliTutar = indirimliTutar - gidisDonüsİndirimi;


                System.out.println("Bilet Fiyatı = " + normalTutar);
                System.out.println("Güncel İndirimliBilet Fiyatınız : " + sonİndirimliTutar);
            } else if (yas <= 24) {
                yasİndirimi = normalTutar * yasIndirimOrani;
                indirimliTutar = normalTutar - yasİndirimi;
                gidisDonüsİndirimi = indirimliTutar * 1.0;
                sonİndirimliTutar = indirimliTutar - gidisDonüsİndirimi;

                System.out.println("Bilet Fiyatı = " + normalTutar);
                System.out.println("Güncel İndirimliBilet Fiyatınız : " + sonİndirimliTutar);
            } else if (yas <= 64) {
                System.out.println("Bilet Fiyatı = " + normalTutar);
            } else { // > 65
                yasİndirimi = normalTutar * yasIndirimOrani;
                indirimliTutar = normalTutar - yasİndirimi;
                gidisDonüsİndirimi = indirimliTutar * 1.0;
                sonİndirimliTutar = indirimliTutar - gidisDonüsİndirimi;

                System.out.println("Bilet Fiyatı = " + normalTutar);
                System.out.println("Güncel İndirimliBilet Fiyatınız : " + sonİndirimliTutar);
            }
        }
    }
}