package TP1_TP2;

import java.util.Vector;

public class PileVector implements Pile {
    private Vector<Object> pile;

    public PileVector() {
        pile = new Vector<>();
    }

    @Override
    public void empiler(Object element) {
        pile.add(element);
    }

    @Override
    public void depiler() throws PileVideErreur {
        if (isPileVide()) {
            throw new PileVideErreur("TP1_TP2.Pile vide !");
        }
        pile.removeElementAt(pile.size() - 1);
    }

    @Override
    public boolean isPileVide() {
        return pile.isEmpty();
    }

    @Override
    public Object sommet() throws PileVideErreur {
        if (isPileVide()) {
            throw new PileVideErreur("TP1_TP2.Pile vide !");
        }
        return pile.lastElement();
    }
}
