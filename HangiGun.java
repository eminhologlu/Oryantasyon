package javaapplication1;

// Soru: Kullanıcının klavyeden 1 ile 365 arasında bir değer girmesi istenir.
// Eğer hatalı giriş yapılmış ise "Lütfen belirtilen koşullara uygun giriş yapınız"
// uyarısı kullanıcıya gösterilecektir. Eğer kullanıcı uygun giriş yapmış ise
// ekrana "Bugün cumartesi x gün sonra haftanın y günüdür" şeklinde bir çıktı
// üretecek programı kodlayınız.


import java.util.Scanner;

public class HangiGun {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1 ile 365 arasında bir değer giriniz:");
        int sayi = input.nextInt();
        
        while(sayi<1 && sayi>365){
            
            System.out.println("Lütfen belirtilen koşullara uygun giriş yapınız");
            System.out.println("Lütfen 1 ile 365 arasında bir değer giriniz:");
            sayi = input.nextInt();
        }
        
        String yaz = "";
        int gun = sayi%7;
        if(gun==0)         //o günün cumartesi olduğunu kabul ettik.
            yaz="Cumartesi";
        else if(gun==1)
            yaz="Pazar";
        else if(gun==2)
            yaz="Pazartesi";
        else if(gun==3)
            yaz="Salı";
        else if(gun==4)
            yaz="Çarşamba";
        else if(gun==5)
            yaz="Perşembe";
        else
            yaz="Cuma";
        System.out.print("Bugun Cumartesi "+sayi+" gün sonra haftanın "+yaz+" günü.");
           
        
        
        
        
        
    }
    
}
