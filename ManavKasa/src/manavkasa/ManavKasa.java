/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manavkasa;

import java.util.Scanner;

/**
 *
 * @author yasin
 */
public class ManavKasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double armut = 2.14 , elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo?: ");
        armutKilo = scanner.nextInt();
        System.out.println("Elma Kaç Kilo?: ");
        elmaKilo = scanner.nextInt();
        System.out.println("Domates Kaç Kilo?: ");
        domatesKilo = scanner.nextInt();
        System.out.println("Muz Kaç Kilo?: ");
        muzKilo = scanner.nextInt();
        System.out.println("Patlıcan Kaç Kilo?: ");
        patlicanKilo = scanner.nextInt();
        
        double toplamTutar = (armut*armutKilo)+(elma*elmaKilo)+(domates*domatesKilo)+(muz*muzKilo)+(patlican*patlicanKilo);
        
        System.out.println("Toplam Tutar: " + toplamTutar);
    }
    
}
