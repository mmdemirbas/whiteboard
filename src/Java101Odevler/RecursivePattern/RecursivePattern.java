package Java101Odevler.RecursivePattern;

import java.util.Scanner;

/*
Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın. 
 
Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. 
Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
Yine her ekleme işleminde sayının son değerini ekrana yazdırın. 
 
Senaryolar 
N Sayısı : 16 
Çıktısı : 16 11 6 1 | -4 1 6 11 16  
 
 
N Sayısı : 10 
Çıktısı : 10 5 0 5 10  
 
 
N Sayısı : 25 
Çıktısı : 25 20 15 10 5 0 5 10 15 20 25
 */

public class RecursivePattern {
    
    /*
    negative(16) => -4
    negative(11) => -4
    negative(6) => -4
    negative(1) => -4
    negative(-4) => -4
    
    positive(-4, 16) => 21
    positive(1, 16) => 21
    positive(6, 16) => 21
    positive(11, 16) => 21
    positive(16, 16) => 21
    positive(21, 16) => 21
    
     */
    static int negative(int x) {
        if (x <= 0) {
            return x;
        } else {
            System.out.print(x + " ");
            return negative(x - 5) + 1;
        }
    }

    static int positive(int x, int originalNumber) {
        if (x > originalNumber) {
            return x;
        } else {
            System.out.print(x + " ");
            return positive(x + 5, originalNumber);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print(" Please enter a number: ");
            int number = input.nextInt();

            positive(-4, 16);

            if (number == 0) {
                break;
            }

            System.out.print("\nEnter '0' for output.");
        }
    }
}