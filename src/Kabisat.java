/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;
public class Kabisat {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("____________________");
        System.out.println("Tahun Kabisat");
        System.out.println("____________________");
        System.out.println("Silahkan Masukkan Tahun");
       int Tahun = input.nextInt();
       if ((Tahun %4 == 0 && Tahun %100 !=0)|| Tahun %400 == 0){
           System.out.println(Tahun + "Adalah Tahun KABISAT");
       }
       else 
           System.out.println(Tahun + "Adalah Bukan Tahun KABISAT");
    }
}
