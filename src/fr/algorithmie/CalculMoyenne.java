package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        double arraySomme = 0;


        for (int i = 0; i < array.length; i++) {
            arraySomme += array[i];
            if (i == array.length - 1) ;

        }
        double arrayMoyenne = arraySomme / array.length;
        System.out.print(arrayMoyenne);
    }
}