
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
                
                if(tebakan > angka){
                    System.out.print("Tebakan Anda terlalu besar ! anda mempunyai kesempatan " + bb);
                    System.out.println(" kali lagi");
                } else if(tebakan < angka){
                    System.out.print("Tebakan Anda terlalu kecil ! anda mempunyai kesempatan " + bb);
                    System.out.println(" kali lagi");
                } else if(tebakan == angka){
                    betul = betul + 1;
                }
                
                if(betul == 5){
                    skor = 100 * 1;
                } else if(betul == 4){
                    skor = 70 * 1;
                } else if(betul == 3){
                    skor = 50 * 1;
                } else if(betul == 2){
                    skor = 30 * 1;
                }
            }
        }
        
        System.out.print("Selamat anda berhasil menebak angka sebanyak  " + betul);
        System.out.println(" kali tebakan. skor anda adalah " + skor);
        
        if(betul >= 1){
            String lanjut = kbd.nextLine();
            System.out.print("\nKetik \"next\" dan tekan enter untuk lanjut ke level berikutnya atau \"exit\" untuk keluar : ");
            String nek = kbd.nextLine();
            
            if(nek.equalsIgnoreCase("exit") || nek.isEmpty()){
                System.exit(0);
            } if(nek.equalsIgnoreCase("next")){
                skor = 0;
                total = 0;
                betul = 0;
                
                System.out.println("\n# Level 2");
                System.out.println("Silahkan tebak angka antara 1 s/d 20");
                System.out.println("Anda mempunyai kesempatan menebak 5 kali");
                
                for(int i=5; i>=1; i--){
                    int bb = i - 1;
                    Random tian = new Random();
                    int angka = tian.nextInt(200);
                    
                    System.out.println("Anda RANDOM : " + angka );
                    System.out.print("Tebakan Anda ? ");
                    int tebakan = kbd.nextInt();
                    
                    if(tebakan > angka){
                        System.out.print("Tebakan Anda terlalu besar ! anda mempunyai kesempatan " + bb);
                        System.out.println(" kali lagi");
                    } else if(tebakan < angka){
                        System.out.print("Tebakan Anda terlalu kecil ! anda mempunyai kesempatan " + bb);
                        System.out.println(" kali lagi");
                    } else if(tebakan == angka){
                        betul = betul + 1;
                    }
                }
            }
        }
    }
    
}
