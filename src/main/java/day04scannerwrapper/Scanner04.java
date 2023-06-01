package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lufen kisa kenar uzunlugu giriniz.");
        double shortSide = input.nextDouble();

        System.out.println("Dikdortgenin uzun kenar uzunlugu giriniz.");
        double longSide = input.nextDouble();
        System.out.println(shortSide*longSide);
        System.out.println(shortSide*2+longSide*2);





    }
}
