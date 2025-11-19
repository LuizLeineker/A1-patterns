package N4;

public class Transaction {
    public double valor;
    public String local;
    public String historico;
    public String ip;

    public Transaction(double valor, String local, String historico, String ip) {
        this.valor = valor;
        this.local = local;
        this.historico = historico;
        this.ip = ip;
    }
}