/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kullanicigirisi;

import java.util.Scanner;

/**
 *
 * @author yasin
 */
public class KullaniciGirisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String username, password;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kullanıcı Adınız: ");
        username = scanner.nextLine();
        
        System.out.println("Şifreniz: ");
        password = scanner.nextLine();
        
        if(username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız!");
        }
        else{
            System.out.println("Bilgileriniz Yanlış!");
            int status;
            System.out.println("Şifrenizi Sıfırlamak İstiyorsanız '1', İstemiyorsanız '0' Giriniz:");
            status = scanner.nextInt();
            if(status == 0){
                System.out.println("Tekrar Deneyin!");
            }
            else if(status==1){
                System.out.println("Yeni Şifrenizi Giriniz:");
                String newPassword;
                newPassword = scanner.next();
                if(newPassword.equals("java123")){
                    System.out.println("Şifre Oluşturulamadı, Lütfen Başka Şifre Giriniz.");   
                }
                else if(newPassword.equals("java123")==false){
                    System.out.println("Şifre oluşturuldu");
                }  
            }
        }
    }
    
}
