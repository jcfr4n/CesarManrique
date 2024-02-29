package resuelta12.pkg13;

public class Resuelta1213 {

    public static void main(String[] args) {
        Sorteo<Integer> s = new Sorteo<>();
        for (int i = 0; i < 100; i++) {
            s.add(i);
        }
        System.out.println(s);
        System.out.println("Premiados: " + s.premiados(10));
    }

}
