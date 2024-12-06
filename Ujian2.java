/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujian2;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author IP3
 */
public class Ujian2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean lanjut = true;

        while (lanjut) {

            int bilanganPertama = random.nextInt(10);
            int bilanganKedua = random.nextInt(10);

            String[] operators = {"*", "/", "%"};
            String operator = operators[random.nextInt(operators.length)];

            double hasil = 0;
            switch (operator) {
                case "*":
                    hasil = bilanganPertama * bilanganKedua;
                    break;
                case "/":

                    if (bilanganKedua == 0) {
                        bilanganKedua = 1;
                    }
                    hasil = (double) bilanganPertama / bilanganKedua;
                    break;
                case "%":
                    hasil = bilanganPertama % bilanganKedua;
                    break;
            }

            System.out.printf("%d %s %d = ?\n", bilanganPertama, operator, bilanganKedua);
            System.out.print("Jawab (atau ketik 'stop' untuk berhenti): ");

            String jawaban = scanner.nextLine();

            if (jawaban.equalsIgnoreCase("stop")) {
                lanjut = false;
                System.out.println("Terima kasih telah bermain!");
                continue;
            }

            try {
                double jawabanPengguna = Double.parseDouble(jawaban);
                if (jawabanPengguna == hasil) {
                    System.out.println("Jawaban Anda benar!");
                } else {
                    System.out.printf("Jawaban Anda salah. Hasil yang benar adalah: %.2f\n", hasil);
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka atau 'stop' untuk berhenti.");
            }
        }

        scanner.close();
    }
}
    
    

