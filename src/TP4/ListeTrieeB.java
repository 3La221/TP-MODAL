package TP4;

import java.util.*;

public class ListeTrieeB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("N = ");

        int n = scanner.nextInt();

        Set<Integer> set = new TreeSet<>();
        Random random = new Random();

        while(set.size() < n) {
            set.add(random.nextInt(1001));
        }

        System.out.println("Collection triée automatiquement : " + set);

        scanner.close();


    }
}
