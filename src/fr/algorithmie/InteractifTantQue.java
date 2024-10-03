package fr.algorithmie;

import java.util.Scanner;


public class InteractifTantQue {
    public static void main(String[] args) {
        System.out.print("Donnez un nombre entre 1 et 10\n");
        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();

        while (nb > 10 || nb < 1){
            System.out.print("Le nombre choisi n'est pas entre 1 et 10\n");
            nb = scanner.nextInt();

        }
        System.out.print("Le nombre choisi est : " + nb);
    }
}
