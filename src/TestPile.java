import java.util.Scanner;

public class TestPile {
    public static void main(String[] args) {



        Scanner entree = new Scanner(System.in) ;
//        System.out.print("Entrez la taille maximale de la pile : ");
//        int taille = entree.nextInt();
//        Pile pile = new PileTableau(taille);
        Pile pile = new PileVector() ;


        while(true){
            System.out.println("\n1. Empiler\n2. Dépiler\n3. Sommet\n4. Vérifier si pile vide\n5. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = entree.nextInt();
            switch (choix) {
                case 1 :
                    System.out.print("Entrez l'élément à empiler : ");
                    String elt = entree.next() ;

                    try {
                        pile.empiler(elt);
                        System.out.println("Élément empilé.");

                    } catch (PilePleineErreur e) {
                        System.out.println("Erreur : " + e.getMessage());
                    }
                    break;

                case 2 :
                    try{
                        pile.depiler();
                        System.out.println("Élément dépilé.");
                    }catch (PileVideErreur e) {
                        System.out.println("Erreur" + e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Sommet de la pile : " + pile.sommet());
                    } catch (PileVideErreur e) {
                        System.out.println("Erreur : " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Pile vide ? " + pile.isPileVide());
                    break;

                case 5:
                    System.out.println("Fin du programme.");
                    entree.close();
                    return;

                default:
                    System.out.println("Option invalide !");



            }
        }






    }
}
