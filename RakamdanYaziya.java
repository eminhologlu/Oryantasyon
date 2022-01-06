package javaapplication1;


// Soru: Klavyeden girilen herhangi bir 4 basamaklı bir sayıyı
// yazıya çevirip ekrana yazan bir java programı kodlayınız.

import java.util.Scanner;

public class RakamdanYaziya {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] dizi1 = {"","","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"};
        String[] dizi2 = {"","on","yirmi","otuz","kırk","elli","altmış","yetmiş","seksen","doksan"};

        System.out.println("Sayı giriniz: ");
        int sayi = input.nextInt();

        int binler,yuzler,onlar,birler;

        birler = sayi%10;
        sayi = sayi/10;
        onlar = sayi%10;
        sayi = sayi/10;
        yuzler = sayi%10;
        sayi = sayi/10;
        binler = sayi%10;

        String sonuc="";

        if (yuzler !=0){
           sonuc+= dizi1[binler] + "" + " bin " + dizi1[yuzler] + "" + " yüz " + dizi2[onlar] + " " + dizi1[birler];
           System.out.println(sonuc);
        }
        else{
            sonuc+= dizi1[binler] + "" + " bin" + dizi2[onlar] + "" + dizi1[birler];
            System.out.println(sonuc);
        }
        if(birler==1){
            sonuc+= "bir";
            System.out.println(sonuc);
        }
    }
}