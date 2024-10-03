package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {
        //les consignes en commentaire

        //Affichez tous les nombres de 1 à 10
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        //Affichez 20 fois votre nom et votre prénom
        for (int i = 0; i < 20; i++) {
            System.out.println("Abel Correia");
        }

        //Affichez les éléments pairs de 2 à 100
        for (int i = 2; i < 101; i=i+2) {
            System.out.println(i);
        }

        //Affichez les éléments impairs de 1 à 99
        for (int i = 1; i < 100; i=i+2) {
            System.out.println(i);
        }

    }
}
