package TP4;

import java.util.*;

public class ListeTrieeA {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("N = ");
        int n = scanner.nextInt() ;


        List<Integer> list  = new LinkedList<>() ;
        Random random = new Random() ;

        for (int i = 0 ; i< n ; i++) {
            list.add(random.nextInt(1001)) ;
        }

        System.out.println("Avant Tri " + list);

        Collections.sort(list);

        System.out.println("Apres Tri" + list);

        scanner.close();




    }


}
