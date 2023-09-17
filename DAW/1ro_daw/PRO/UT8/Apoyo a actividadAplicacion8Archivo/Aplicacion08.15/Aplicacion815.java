package aplicacion8.pkg15;

public class Aplicacion815 {

    public static void main(String[] args) {
        Lista l1 = new Lista();
        for (int i = 0; i < 3; i++) {
            l1.insertarFinal(i);
        }
         System.out.println("l1: "+l1);
        Lista l2 = new Lista();
        for (int i = 0; i < 3; i++) {
            l2.insertarFinal(i);
        }
        System.out.println("l2: "+l2);
        System.out.println(l1.equals(l2));

    }

}
