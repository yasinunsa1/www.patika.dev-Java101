/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinifgecmedurumu;

import java.util.Scanner;

/**
 *
 * @author yasin
 */
public class SinifGecmeDurumu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;
        int sayac = 0;
        int toplam = 0;
        double ortalama;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Matematik Notunuz: ");
        matematik = scanner.nextInt();
        if(matematik<0 || matematik>100){
            System.out.println("Matematik Notunuz Ortalamaya Dahil Edilmemiştir!");
        }
        else{
            sayac++;
            toplam+=matematik;
        }
        
        System.out.println("Fizik Notunuz: ");
        fizik = scanner.nextInt();
        if(fizik<0 || fizik>100){
            System.out.println("Fizik Notunuz Ortalamaya Dahil Edilmemiştir!");
        }
        else{
            sayac++;
            toplam+=fizik;
        }
        
        System.out.println("Türkçe Notunuz: ");
        turkce = scanner.nextInt();
        if(turkce<0 || turkce>100){
            System.out.println("Türkçe Notunuz Ortalamaya Dahil Edilmemiştir!");
        }
        else{
            sayac++;
            toplam+=turkce;
        }
        
        System.out.println("Kimya Notunuz: ");
        kimya = scanner.nextInt();
        if(kimya<0 || kimya>100){
            System.out.println("Kimya Notunuz Ortalamaya Dahil Edilmemiştir!");
        }
        else{
            sayac++;
            toplam+=kimya;
        }
        
        System.out.println("Müzik Notunuz: ");
        muzik = scanner.nextInt();
        if(muzik<0 || muzik>100){
            System.out.println("Müzik Notunuz Ortalamaya Dahil Edilmemiştir!");
        }
        else{
            sayac++;
            toplam+=muzik;
        }
        
        ortalama = toplam/sayac;
        
        String durum = ortalama<=55 ? "Kaldı" : "Geçti";
        
        System.out.println("Ortalamanız: " + ortalama);
        System.out.println("Durumunuz: " + durum);
        
    }
    
}
