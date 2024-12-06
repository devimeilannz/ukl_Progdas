/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujian1;

/**
 *
 * @author IP3
 */
public class Ujian1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

for (int i = 50; i >= 1; i--) {
    // Menentukan pesan berdasarkan nilai i
    String ucapan;

    if (i == 1) {
        ucapan = "saya senang";
    } else if (i % 3 == 0) {
        ucapan = "saya angkatan 33";
    } else if (i % 2 == 0) {
        ucapan = "saya anak moklet";
    } else {
        ucapan = "saya anak wikusama";
    }

    // Mencetak nomor dan pesan dalam satu baris
    System.out.println(i + ". " + ucapan);
}
}
    }
        
       
     
    
    

