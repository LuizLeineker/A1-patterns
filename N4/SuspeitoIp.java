package N4;


public class SuspeitoIp extends Chain {

    @Override
    protected boolean process(Transaction sus) {
        return !sus.ip.equals("IP - dispositivo suspeito");
    }
}