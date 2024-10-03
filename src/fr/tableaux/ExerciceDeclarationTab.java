package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] tableau1 = {8, -7, 12, 1, -2, 14, 17, 9};
        System.out.println(tableau1[0]);
        System.out.println(tableau1.length);
        System.out.println(tableau1[7]);
        System.out.println(tableau1[10]); // L'affichage de l'index 10 du tableau donne un erreur car il n'y a pas d'index 10
    }
}
