/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notortalamasihesaplama;

import java.util.Scanner;

/**
 *
 * @author yasin
 */
public class NotOrtalamasiHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Matematik Notunuz: ");
        mat = scanner.nextInt();
        
        System.out.println("Fizik Notunuz: ");
        fizik = scanner.nextInt();
        
        System.out.println("Kimya Notunuz: ");
        kimya = scanner.nextInt();
        
        System.out.println("Turkce Notunuz: ");
        turkce = scanner.nextInt();
        
        System.out.println("Tarih Notunuz: ");
        tarih = scanner.nextInt();
        
        System.out.println("Muzik Notunuz: ");
        muzik = scanner.nextInt();
        
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        
        double ortalama = toplam/6;
        
        String durum = ortalama > 60 ? "Geçtiniz" : "Kaldınız";
        
        System.out.println("Ortalamanız: " + ortalama);
        System.out.println("Durum: " + durum);
        
    }
    
}
