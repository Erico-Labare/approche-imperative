package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        int[] tableauEntier = new int[10];
        for (int i = 0; i < 10; i++) {
            tableauEntier[i] = i + 1;
        }

        System.out.println(tableauEntier[0]);

        System.out.println(tableauEntier.length);

        System.out.println(tableauEntier[tableauEntier.length-1]);

        tableauEntier[4] = 8;
    }
}
