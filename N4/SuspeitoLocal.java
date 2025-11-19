package N4;


public class SuspeitoLocal extends Chain {

    @Override
    protected boolean process(Transaction sus) {
        return !sus.local.equals("Local Incomun");
    }
}