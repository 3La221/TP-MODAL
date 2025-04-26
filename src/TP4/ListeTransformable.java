package TP4;

import java.util.Iterator;
import java.util.LinkedList;

public class ListeTransformable {

     LinkedList<Object> liste ;

    public ListeTransformable() {
        liste = new LinkedList<>() ;
    }

    public ListeTransformable transforme(Transformation f ) {
        ListeTransformable nouv = new ListeTransformable() ;
        Iterator<Object> it = liste.iterator() ;

        while(it.hasNext()) {
            Object element = it.next() ;
            nouv.liste.addLast(f.transfo(element));
        }

        return nouv ;


    }
    public String toString() {
        return liste.toString();
    }

}
