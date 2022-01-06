package javaapplication1;

// Soru: Santigrat dereceyi fahrenheit dereceye çeviren programı kodlayınız.

import java.util.Scanner;

   public class SantigratToFahrenait {
      public static void main(String[] args) {

         double celcius,fahrenheit;
         Scanner input=new Scanner(System.in); 

         System.out.print("Derece cinsinden sıcaklık değerini giriniz: ");
         celcius = input.nextInt();
         fahrenheit = celcius * 1.8 + 32;
         System.out.println("Sıcaklık değeri " +fahrenheit + " fahrenheittir.");
      }
   }
