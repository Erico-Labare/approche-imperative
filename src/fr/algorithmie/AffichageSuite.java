package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        //Utiliser une boucle for pour afficher tous les nombres de 1 à 10 inclus
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");


        //Utiliser une boucle for pour afficher tous les nombres pairs entre 0 et 10 inclus
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
            }
        }
        System.out.print("\n");


        //Utiliser une boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus
        for (int i = 1; i < 11; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            } else {
            }
        }
        System.out.print("\n");


        int j = 1;

        //Utiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus
        while (j <= 10) {
            System.out.print(j + " ");
            j++;
        }
        System.out.print("\n");


        //Utiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus
        j = 1;
        while (j <= 10) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            } else {
            }
            j++;
        }
        System.out.print("\n");


        //Utiliser une boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus
        j = 1;
        while (j <= 10) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            } else {
            }
            j++;
        }
        System.out.print("\n");


    }
}
