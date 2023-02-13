package Dongu;
import java.util.Scanner;
public class Kuvvet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nbr;

        System.out.print("Bir değer giriniz : ");
        nbr = sc.nextInt();

        System.out.println("4'ün katları ;");

        for (int i = 1; i <= nbr; ) {

            System.out.println(i);

            i *= 4;
        }

        System.out.println("5'in katları ;");

        for (int x = 1; x <= nbr; ) {

            System.out.println(x);

            x *= 5;

        }

    }
}
