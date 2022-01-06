package javaapplication1;

// Soru: Parametre olarak aldığı iki sayının OKEK'ini bulan fonksiyonu kodlayınız.

import java.util.Scanner;

public class OKEK {
    
    public static int okek(int sayi1, int sayi2){
        int okek=0;
        for(int i=1; i<=sayi1*sayi2; i++){
            if(i%sayi1==0 && i%sayi2==0){
                okek=i;
                break;
            } 
        }
        return okek;   
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1.sayıyı giriniz:");
        int sayi1 = input.nextInt();
        System.out.println("Lütfen 2.sayıyı giriniz:");
        int sayi2 = input.nextInt();
        System.out.println("Okek: "+okek(sayi1,sayi2));
    }
}
