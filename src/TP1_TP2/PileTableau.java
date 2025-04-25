package TP1_TP2;

public class PileTableau implements  Pile {

    private int tailleMax ;
    private int sommet ;
    private Object[] tableau ;

    public PileTableau(int tailleMax) {
        this.tailleMax = tailleMax;
        this.sommet = sommet;
        this.tableau = new Object[tailleMax] ;
    }




    @Override
    public void empiler(Object element) throws PilePleineErreur {
        if( sommet>= tailleMax - 1) {
            throw new PilePleineErreur("TP1_TP2.Pile Pleine !") ;
        }
        tableau[++sommet] = element ;
    }

    @Override
    public void depiler() throws PileVideErreur {
        if(isPileVide()) {
            throw new PileVideErreur("TP1_TP2.Pile Vide !") ;
        }

        sommet -- ;


    }

    @Override
    public boolean isPileVide() {
        return sommet == -1 ;
    }

    @Override
    public Object sommet() throws PileVideErreur {
        if(isPileVide()) {
           throw new PileVideErreur("TP1_TP2.Pile Vide !") ;
        }
        return tableau[sommet] ;
    }
}
