package N4;

public class SuspeitoValor extends Chain {

    @Override
    protected boolean process(Transaction sus) {
        return sus.valor <= 5000;
    }
}
