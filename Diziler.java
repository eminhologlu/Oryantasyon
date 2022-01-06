package javaapplication1;

// Soru: "Goster" isimli bir fonksiyon "elemanSayisi" isimli bir değişkeni
// parametre olarak alsın. elemanSayisi kadar değeri 0-99 arasında değişen
// rastgele sayılar üretsin. Bu sayılardan 50'den küçük ve çift olan elemanları
// dizi1 içerisine; 50'den büyük ve tek olan elemanları dizi2 içerisine atsın.
// dizi1 ve dizi2 elemanlarını yazdırsın. Fonksiyon dizi1 ve dizi2'nin eleman
// sayıları toplamını sonuç olarak geri döndürsün

import java.util.Random;
import java.util.Scanner;

public class Diziler {

    public static int Goster(int elemanSayisi){
        Random rand = new Random();
        int[] dizi1 = new int[elemanSayisi];
        int[] dizi2 = new int[elemanSayisi];
        int dizi1ElemanSayisi = 0;
        int dizi2ElemanSayisi = 0;
        
        for(int i=0; i<=elemanSayisi; i++){
            
            int sayi = rand.nextInt(100); //0-99 arasında sayı ürettik.
            System.out.println("Üretilen sayı: "+sayi);
            if(sayi<50 && sayi%2==0){
                System.out.println(sayi+" Dizi1'e eklendi.");
                dizi1[dizi1ElemanSayisi] = sayi;
                dizi1ElemanSayisi = dizi1ElemanSayisi+1;
            }
            else if(sayi>50 && sayi%2!=0){
                System.out.println(sayi+" Dizi2'ye eklendi.");
                dizi2[dizi2ElemanSayisi] = sayi;
                dizi2ElemanSayisi = dizi2ElemanSayisi+1;
            }
        }
        
        System.out.print("Dizi1 Elemanları :");
        for(int a=0; a<dizi1ElemanSayisi; a++){
            System.out.print(dizi1[a]+",");
        }
        System.out.println("");
        
        System.out.print("Dizi2 Elemanları :");
        for(int b=0; b<dizi2ElemanSayisi; b++){
            System.out.print(dizi2[b]+",");
        }
        System.out.println("");
        
        return dizi1ElemanSayisi+dizi2ElemanSayisi;
    }    
    
    public static void main(String[] args){
        System.out.println("Eleman sayısını giriniz:");
        
        Scanner input = new Scanner(System.in);
        int deger = input.nextInt();
        System.out.println("Sonuç: "+Goster(deger));
    }
    }

