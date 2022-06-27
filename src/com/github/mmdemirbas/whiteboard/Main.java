package com.github.mmdemirbas.whiteboard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double gidisDonüsYasİndirimi;
        double gidisDonüsİndirimi;
        double indirimliTutar;
        double normalTutar;
        double sonİndirimliTutar;
        double yasIndirimOrani;
        double yasİndirimi;
        int    mesafe;
        int    yas;
        int    yolculukTipi;

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

        yasIndirimOrani = decideYasIndirimOrani(yolculukTipi, yas);
        gidisDonüsYasİndirimi = decideGidisDonüsYasİndirimi(yolculukTipi, yas);

        normalTutar = mesafe * 0.10;
        yasİndirimi = normalTutar * yasIndirimOrani;
        indirimliTutar = normalTutar - yasİndirimi;
        gidisDonüsİndirimi = indirimliTutar * gidisDonüsYasİndirimi;
        sonİndirimliTutar = indirimliTutar - gidisDonüsİndirimi;

        System.out.println("Bilet Fiyatı = " + normalTutar);
        System.out.println("Güncel İndirimliBilet Fiyatınız : " + sonİndirimliTutar);
    }

    private static double decideGidisDonüsYasİndirimi(int yolculukTipi, int yas) {
        if (yolculukTipi == 1) {
            return 1.0;
        }
        if (yas <= 12) {
            return 0.20;
        }
        if (yas <= 24) {
            return 0.20;
        }
        if (yas <= 64) {
            return 0.00;
        } // > 65
        return 0.30;
    }

    private static double decideYasIndirimOrani(int yolculukTipi, int yas) {
        if (yas <= 12) {
            return 0.50;
        }
        if (yas <= 24) {
            return 0.10;
        }
        if (yas <= 64) {
            if (yolculukTipi == 2) {
                return 0.20;
            } else {
                return 0.00;
            }
        } else {
            return 0.50;
        }
    }
}