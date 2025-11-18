package N1;

public class FactorySemanal implements Factory {
    @Override
    public Relatory criar() {
        System.out.println("Criando o relatorio semanal");
        return new RelatorySemanal("Semana Cheia", "arial", "26px", "info", "carlos");
    }
}
