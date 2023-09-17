public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\n");
        System.out.println("Este ¡Hola Mundo!");
        System.out.println("va en español");
        System.out.println("\n");

        traducir("ingles");
        traducir("aleman");
    }

    private static void traducir(String idioma){
        switch (idioma) {
            case "ingles" -> Ingles.imprimir();
            case "aleman" -> Aleman.imprimir();
            default -> System.out.println("No es una opción correcta");
        }
    }
}
