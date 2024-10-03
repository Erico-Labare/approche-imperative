package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5};

        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }

        System.out.print("\n");


        int tableau0 = tableau[0];
        for (int i = 0; i < tableau.length; i++) {
            if (i<tableau.length-1) {
                tableau[i] = tableau[i + 1];
                System.out.print(tableau[i] + " ");
            }
            else {
                tableau[i] = tableau0;
                System.out.print(tableau[i] + " ");
            }

        }
    }
}
