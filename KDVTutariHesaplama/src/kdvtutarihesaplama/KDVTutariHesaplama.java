/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kdvtutarihesaplama;

import java.util.Scanner;

/**
 *
 * @author yasin
 */
public class KDVTutariHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double kdvOrani;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ücret Tutarını Giriniz: ");
        double tutar = scanner.nextDouble();
        
        double kdvTutar = 0;
        
        double kdvliTutar = 0;
        
        if(0<tutar && tutar<1000){
            kdvOrani = 0.18;
            kdvTutar = tutar * kdvOrani;
            kdvliTutar = tutar + kdvTutar;
        }
        else if(tutar>1000){
            kdvOrani = 0.08;
            kdvTutar = tutar * kdvOrani;
            kdvliTutar = tutar + kdvTutar;
        }
        System.out.println("KDV'li Fiyat: " + kdvliTutar);
        System.out.println("KDV Tutarı: " + kdvTutar);
    }
    
}
