/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujian3sulitt;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author IP3
 */
public class Ujian3sulitt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang diinginkan: ");
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        System.out.println("Masukkan angka nya:");
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        scanner.close();

        cariElemenPalingSering(arr);
    }

    public static void cariElemenPalingSering(ArrayList<Integer> arr) {
        int jumlahterbanyak = 0;
        int elemen = 0;
        int jumlah;

        for (int i = 0; i < arr.size(); i++) {
            jumlah = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j))) {
                    jumlah++;
                }
            }
            if (jumlah > jumlahterbanyak) {
                jumlahterbanyak = jumlah;
                elemen = arr.get(i);
            }
        }
        System.out.println("Elemen yang paling sering muncul adalah " + elemen + " sebanyak " + jumlahterbanyak + " kali.");
    }
}
