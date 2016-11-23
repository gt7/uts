
package com.mispan.app12141417;
import java.util.Random;
import java.util.Scanner;

public class App12141417 {
    public static void main(String[] args) {
        int betul = 0;
        int skor = 0;
        int total = 0 ;
        
        Scanner kbd = new Scanner(System.in);
        System.out.print("Masukan nama Anda untuk memulai atau tekan y untuk keluar : ");
        String nama = kbd.nextLine();
        
        if(nama.equalsIgnoreCase("y") || nama.isEmpty()){
            System.exit(0);
        }else{
            System.out.println("# Level 1");
            System.out.println("Selamat Datang " + nama);
            System.out.println("Silahkan tebak angka antara 1 s/d 10");
            System.out.println("Anda mempunyai kesempatan menebak 5 kali \n");
            
            for(int i=5; i>=1; i--){
                int bb = i - 1;
                Random tian = new Random();
                int angka = tian.nextInt(100);
                
                System.out.println("Anda RANDOM : " + angka );
                System.out.print("Tebakan Anda ? ");
                int tebakan = kbd.nextInt();
                
            }
        }
    }
    
}
