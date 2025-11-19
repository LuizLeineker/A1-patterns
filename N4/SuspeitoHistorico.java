package N4;

public class SuspeitoHistorico extends Chain {

    @Override
    protected boolean process(Transaction sus) {
        // exemplo fictício
        return !sus.historico.equals("suspeito");
    }
}
