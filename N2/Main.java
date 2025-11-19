package N2;

public class Main {
    public static void main(String[] args) {

        Strategy agressivo = new Agressivo();
        Strategy moderado = new Moderado();
        Strategy conversavador = new Conservador();

        Contexto contexto = new Contexto(agressivo);
        System.out.println("Agressiva");
        contexto.executarCalculo();

        System.out.println("-------------------------------------------");

        contexto.setStrategy(moderado);
        System.out.println("Moderada");
        contexto.executarCalculo();



    }
}