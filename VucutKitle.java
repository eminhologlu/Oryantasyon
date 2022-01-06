package javaapplication1;


// Soru: Kullanıcının klavyeden önce "boyunuzu cm olarak giriniz"
// sonra "kilonuzu kg olarak" giriniz şeklinde değerler girmesi
// istenmektedir. Eğer boy/kilo değeri 2'den küçük ise ekrana "şişman";
// hesaplanan değer 2 ile 2.5 arasında ise "normal"; 2.5'den büyükse
// "zayıf" yazan programı kodlayınız.

import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu cm cinsinden giriniz: ");
        int boy = input.nextInt();
        System.out.println("Kilonuzu kg cinsinden giriniz: ");
        int kg = input.nextInt();
        double oran = boy/kg;

        if(oran<2){
            System.out.print("Şişman");
        }
        else if(oran>2.0 && oran<=2.5){
            System.out.print("Normal");
        }
        else{
            System.out.print("Zayıf");
        }

    }
}
