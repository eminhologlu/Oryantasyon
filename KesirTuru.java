package javaapplication1;


// Soru: Kullanıcının klavyeden önce "pay değerini"
// sonra "payda değerini" giriniz şeklinde bir değer girmesi
// istenmektedir. Eğer payda değeri pay değerinden daha büyük ise
// ekrana "basit kesir girdiniz."; eğer pay değeri payda değerine
// eşit ise "girdiğiniz değer bir tamsayıdır"; aki taktirde
// "bileşik bir kesir girdiniz kesir değeri X tam Y/Z" mesajını
// ekrana yazan programı kodlayınız.

import java.util.Scanner;

public class KesirTuru {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Pay değerini giriniz: ");
        int pay = input.nextInt();
        System.out.println("Payda değerini giriniz: ");
        int payda = input.nextInt();
        double oran = pay/payda;

        if(pay<payda){
            System.out.print("Basit kesir girdiniz.");
        }
        else if(pay==payda){
            System.out.print("Bir tamsayı girdiniz.");
        }
        else{
            int x = pay/payda; //tam kısmını verir
            int y = pay%payda; //yeni pay değeri
            System.out.print("Bileşik bir kesir girdiniz.");
            System.out.print("Kesir değeri= "+x+" tam "+y+"/"+payda);
        }

    }
}