package TP3;

public class ListeChainee {
    private Cellule debut ;
    private Cellule fin ;
    private int taille ;

    public ListeChainee() {
        this.debut = new Cellule(null) ;
        this.fin = new Cellule(null) ;

        debut.chaineSuivante(fin);

        taille = 0 ;


    }

    public int size() {
        return taille ;
    }

    public boolean isEmpty() {
        return taille == 0 ;
    }


    public void addFirst(Object obj) {
        debut.chaineSuivante(obj);
        taille++;
    }


    public void addLast(Object obj) {
        fin.chainePrecedente(obj);
        taille++;
    }

    public Object getFirst() {
        return  isEmpty() ? null : debut.suiv.contenu ;
    }

    public Object getLast() {
        return isEmpty() ? null : fin.prec.contenu;
    }

    public Object removeFirst() {
        if (isEmpty()) return null;
        Object obj = debut.suiv.supprime();
        taille--;
        return obj;
    }

    public Object removeLast() {
        if (isEmpty()) return null;
        Object obj = fin.prec.supprime();
        taille--;
        return obj;
    }

    public void add(int position , Object object) {
        if(position < 0 || position > taille) {
            return;
        }
        Cellule tmp = debut ;
        for(int i = 0 ; i<position ; i++) {
            tmp = tmp.suiv ;
        }
        tmp.chaineSuivante(object);
        taille++ ;
    }


    public Object get(int i) {
        if (i < 0 || i >= taille) return null;
        Cellule temp = debut.suiv;
        for (int j = 0; j < i; j++) {
            temp = temp.suiv;
        }
        return temp.contenu;
    }

    public void set(int i, Object obj) {
        if (i < 0 || i >= taille) return;
        Cellule temp = debut.suiv;
        for (int j = 0; j < i; j++) {
            temp = temp.suiv;
        }
        temp.contenu = obj;
    }

    public Object remove(int i) {
        if (i < 0 || i >= taille) return null;
        Cellule temp = debut.suiv;
        for (int j = 0; j < i; j++) {
            temp = temp.suiv;
        }
        Object obj = temp.supprime();
        taille--;
        return obj;
    }

    public int indexOf(Object obj) {
        int position = -1;
        Cellule temp = debut;
        while (temp.suiv != fin) {
            position++;
            temp = temp.suiv;
            if (obj.equals(temp.contenu)) return position;
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        int position = taille;
        Cellule temp = fin;
        while (temp.prec != debut) {
            position--;
            temp = temp.prec;
            if (obj.equals(temp.contenu)) return position;
        }
        return -1;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }


}
