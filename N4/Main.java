package N4;

public class Main {
    public static void main(String[] args) {
        Transaction transaction = new Transaction(3000, "Brasil", "user", "656");

        // validar
        Handler v1 = new SuspeitoHistorico();
        Handler v2 = new SuspeitoIp();
        Handler v3 = new SuspeitoLocal();
        Handler v4 = new SuspeitoValor();


        v1.setNext(v2);
        v2.setNext(v3);
        v3.setNext(v4);



        try {
            v1.validate(transaction);
            System.out.println("Transação aprovada!");
        } catch (RuntimeException e) {
            System.out.println("Transação negada: " + e.getMessage());
        }
    }

}