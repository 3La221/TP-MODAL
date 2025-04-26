package TP4;


import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class TestSelection {

    static Collection selection(Collection source , CritereSelection critere) {
        Collection resultat = new Vector() ;
        Iterator it = source.iterator() ;

        while (it.hasNext()){
            Object element  = it.next() ;
            if (critere.ok(element)){
                resultat.add(element) ;
            }
        }

        return resultat;

    }

    public  static void main(String[] args) {
        Vector<Integer> liste = new Vector<>() ;

        for(int i = 0 ; i < 100 ; i++) {
            liste.add(i) ;
        }

        CritereSelection critereMultiplesDeTrois  = new CritereSelection() {
            @Override
            public boolean ok(Object x) {
                if (x instanceof Integer) {
                    return ((Integer) x) % 3 == 0;
                }
                return false;
            }
        };

        Collection resultat = selection(liste , critereMultiplesDeTrois) ;

        System.out.println("Multiples de 3 de 0 à 100 : " + resultat);


    }
}
