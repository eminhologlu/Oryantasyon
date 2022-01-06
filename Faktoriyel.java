package javaapplication1;

// Soru: Girilen sayının faktöriyelini hesaplayan programı kodlayınız.

import java.util.Scanner;

public class Faktoriyel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen tamsayı giriniz.");
        int sayi = input.nextInt();
        int sonuc = 1;
        
        if(sayi<0){
            System.out.print("Girilen değer pozitif olmalı.");
            System.out.println("Lütfen tamsayı giriniz.");
            sayi = input.nextInt();
        }
        else{
            for(int i=1; i<=sayi; i++){
                sonuc=sonuc*i; 
            }
        }
        System.out.println("Girilen değerin faktöriyeli: "+sonuc);
    }
    
}
