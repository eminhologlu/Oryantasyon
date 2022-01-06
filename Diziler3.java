package javaapplication1;

//Soru: Kullanıcı tarafından tam sayı değerleri girilen 10
//elemanlı bir dizideki en küçük elemanı ve o elemana
//ait indisi bulup konsolda gösteren Java programını
//yazınız.

import java.util.Scanner;

public class Diziler3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int enkucuk = 0;
        int indeks = 0;
        int [] dizi = new int[10];
        
        for(int i = 0; i < 10; i++)
        {
            System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
            dizi[i] = input.nextInt();
            if(i == 0) {
                enkucuk = dizi[i];
            }
            if(dizi[i] < enkucuk) {
                enkucuk = dizi[i];
                indeks = i;
            }
        }
        System.out.println("Dizinin en kucuk elemanı = " + enkucuk);
        System.out.println("Dizinin en kucuk elemanının indeksi = " + indeks);
    }
}
