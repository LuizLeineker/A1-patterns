package N1;

public class Main {
    public static void main(String[] args) {

    Factory diarioFac = new FactoryDiario();
    Factory semanalFac = new FactorySemanal();
    Factory emergencialFac = new FactoryEmergencial();

    Relatory relatorio1 = diarioFac.criar();

    Relatory relatorio2 = semanalFac.criar();

    Relatory relatorio3 = emergencialFac.criar();
    }
}
