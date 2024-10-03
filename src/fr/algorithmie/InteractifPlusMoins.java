package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        int aleatoire = 10;
        System.out.print("Au-dessus ou en-dessous ?\n");
        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();

        while (aleatoire != nb) {
            if (aleatoire > nb) {
                System.out.print("Au-dessus\n");
                nb = scanner.nextInt();

            } else if (aleatoire < nb) {
                System.out.print("En-dessous\n");
                nb = scanner.nextInt();

            }
        }
        System.out.print("Bravo ! Le nombre était bien " + nb + "\n");
    }
}
