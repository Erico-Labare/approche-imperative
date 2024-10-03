package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {
        //Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais dans l’ordre inverse.
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] arrayCopy = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            arrayCopy[array.length-i-1] = array[i];
        }
        System.out.print("\n");

        //Afficher l’ensemble des éléments des 2 tableaux
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");

        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.print(arrayCopy[i] + " ");
        }
        System.out.print("\n");
    }
}
