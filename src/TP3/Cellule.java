package TP3;

public class Cellule {
    Object contenu ;
    Cellule prec ;
    Cellule suiv ;


    public Cellule(Object contenu) {
        this.contenu = contenu;
        this.prec = null;
        this.suiv = null;
    }

    public  void chaineSuivante(Object obj) {
        Cellule nouv = new Cellule(obj) ;
        nouv.suiv = this.suiv ;
        nouv.prec = this ;

        if(this.suiv != null) {
            this.suiv.prec = nouv ;

        }
        this.suiv = nouv ;
    }

    public  void chainePrecedente(Object obj) {
        Cellule nouv = new Cellule(obj) ;
        nouv.suiv = this ;
        nouv.prec = this.prec ;

        if(this.prec != null) {
            this.prec.suiv = nouv ;
        }

        this.prec = nouv ;
    }


    public Object supprime() {
        Object res = this.contenu ;
        if(this.prec != null) {
            this.prec.suiv = this.suiv ;
        }

        if(this.suiv != null) {
            this.suiv.prec = this.prec ;
        }

        this.prec = null ;
        this.suiv = null ;

        return res ;

    }


}
