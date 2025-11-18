package N1;

public class FactoryEmergencial implements Factory {
    @Override
    public Relatory criar() {
        System.out.println("Criando o relatorio emergencial");
        return new RelatoryEmergencial("ALERTA", "arial", "26px", "info", "cuidado");
    }
}
