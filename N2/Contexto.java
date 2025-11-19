package N2;

public class Contexto {

    private Strategy strategy;

    public Contexto(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executarCalculo() {
        if (strategy != null) {
            strategy.calcular();
        } else {
            System.out.println("Sem calculo!");
        }
    }





}
