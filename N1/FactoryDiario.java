package N1;

public class FactoryDiario implements Factory{
    @Override
    public Relatory criar() {
        System.out.println("Criando o relatorio diario");
        return new RelatoryDiaria("ALERTA", "arial", "26px", "info", "20:40", "20 reais");
    }
}
