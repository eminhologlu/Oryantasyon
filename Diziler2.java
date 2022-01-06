package javaapplication1;

//Soru: Kullanıcı tarafından tam sayı değerleri girilen 10
//elemanlı bir dizinin toplamını ve ortalamasını
//hesaplayıp konsolda gösteren Java programını yazınız.

import java.util.Scanner;

public class Diziler2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dizi= new int[10];
        int toplam=0;
        int ortalama;
        
        for(int i=1;i<=10;i++){
            System.out.print("Lütfen "+i+". elemanı girin: ");
            dizi[i-1]=input.nextInt();
            toplam=toplam+dizi[i-1];
        }
        
        ortalama=toplam/10;
        System.out.println("Girilen dizinin elemanlar toplamı: "+toplam);
        System.out.println("Girilen dizinin elemanları ortalaması: "+ortalama);
    }
    
}
