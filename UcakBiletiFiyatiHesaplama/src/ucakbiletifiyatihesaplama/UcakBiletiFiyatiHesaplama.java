/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucakbiletifiyatihesaplama;

import java.util.Scanner;

/**
 *
 * @author yasin
 */
public class UcakBiletiFiyatiHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double perKM = 0.10;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Mesafeyi KM Türünden Giriniz: ");
        mesafe = scanner.nextInt();
        
        System.out.println("Yaşınızı Giriniz: ");
        yas = scanner.nextInt();
        
        System.out.println("Yolculuk Tipini Giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        yolculukTipi = scanner.nextInt();
        
        if(mesafe<0 || yas<0 || (yolculukTipi!=1 && yolculukTipi!=2)){
            System.out.println("Hatalı Veri Girdiniz!");
        }
        else{
            double normalTutar = mesafe*perKM;
            double indirimliTutar = normalTutar;
            if(yas<12){
                indirimliTutar = normalTutar*(0.5);
            }
            else if(yas>=12 && yas<=24){
                indirimliTutar = normalTutar*(0.9);
            }
            else if(yas>=65){
                indirimliTutar = normalTutar*(0.7);
            }
            if(yolculukTipi == 2){
                indirimliTutar*=1.6;  
            }
            System.out.println("Toplam Tutar: " + indirimliTutar );
        }

    }
    
}
