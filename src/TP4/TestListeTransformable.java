package TP4;

public class TestListeTransformable {
    public static void main(String[] args) {
        ListeTransformable lt1 = new ListeTransformable() ;
        for (int i = 0; i < 10; i++) lt1.liste.add(i);
        System.out.println(lt1);
        ListeTransformable lt2 = lt1.transforme(new Transformation() {
            public Object transfo(Object o) {
                int x = (Integer) o;
                return  x * x;
            }
        });
        System.out.println(lt2);
    }
}