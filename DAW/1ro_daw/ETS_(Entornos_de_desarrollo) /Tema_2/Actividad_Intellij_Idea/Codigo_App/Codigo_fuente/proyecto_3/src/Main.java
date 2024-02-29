// coode by Juancfm
public class Main {
    public static void main(String[] args) {
        if (args.length == 1) {
            System.out.println(args[0]);
            switch(args[0]){
                case "español" -> {
                    System.out.println("\n");
                    System.out.println("Este ¡Hola Mundo!");
                    System.out.println("va en español");
                    System.out.println("\n");
                    break;
                }
                case "ingles","aleman" -> {
                    traducir(args[0]);
                    break;
                }
                default -> {
                    System.out.println("\n");
                    System.out.println("Lo siento, este idioma no está soportado");
                    System.out.println("Escribe los idiomas en minúsculas y sin acentos");
                    System.out.println("\n");
                }
            }
        }else{
            System.out.println("\n");
            System.out.println("Lo siento, debe pasar un argumento");
        }
        System.exit(0);
    }
    private static void traducir(String idioma){
        switch (idioma) {
            case "ingles" -> Ingles.imprimir();
            case "aleman" -> Aleman.imprimir();
        }
    }
}