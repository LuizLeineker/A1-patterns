package N3;

public class Main {
    public static void main(String[] args) {
        // Criando apenas uma instancia
        Logs singleton = Logs.getInstance();

        // operações da log
        singleton.setErros("erro 5 ");
        singleton.setErros("erro 6 ");
        System.out.println(singleton.getErros());

    }
}