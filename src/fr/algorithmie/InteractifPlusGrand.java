package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        System.out.print("Donnez 10 nombres\n");
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[10];
        int listMax = 0;

        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] > listMax) {
                listMax = list[i];
            } else {
            }
        }
        System.out.print("Le plus grand nombre est : " + listMax + "\n");
    }
}
