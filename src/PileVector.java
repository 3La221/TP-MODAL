import java.util.Vector;

public class PileVector implements Pile {
    private Vector<Object> pile ;

    public PileVector() {
        pile = new Vector<>() ;
    }

    @Override
    public void empiler(Object element) throws PilePleineErreur {

    }

    @Override
    public void depiler() throws PileVideErreur {

    }

    @Override
    public boolean isPileVide() {
        return false;
    }

    @Override
    public Object sommet() throws PileVideErreur {
        return null;
    }
}
