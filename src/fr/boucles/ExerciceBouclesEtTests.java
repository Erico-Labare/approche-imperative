package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {

        //Afficher l’ensemble des éléments du tableau grâce à une boucle
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");


        //Afficher l’ensemble des éléments dans l’ordre inverse du tableau
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");

        //Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 3) {
                System.out.print(array[i] + " ");
            } else {
            }
        }
        System.out.print("\n");


        //Combiner une boucle et un test de manière à n’afficher que les entiers pairs
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            } else {
            }
        }
        System.out.print("\n");


        //Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            } else {
            }
        }
        System.out.print("\n");


        //Combiner une boucle et un test de manière à n’afficher que les entiers impairs
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            } else {
            }
        }
        System.out.print("\n");

    }
}
