/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vucutkitleindeks;

import java.util.Scanner;

/**
 *
 * @author yasin
 */
public class VucutKitleIndeks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kilo;
        double boy;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = scanner.nextDouble();
        
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = scanner.nextInt();
        
        double vucutKitleIndeks = (kilo/(boy*boy));
        
        System.out.println("Vücut Kitle İndeksiniz: " + vucutKitleIndeks);
    }
    
}
