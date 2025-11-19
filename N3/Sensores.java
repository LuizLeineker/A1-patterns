package N3;


import java.util.ArrayList;
import java.util.List;

public class Sensores implements Sensor {

    private final String id;
    private double temperatura;
    private double umidade;
    private double poluicao;

    private List<Observer> observers = new ArrayList<>();

    public Sensores(String id) {
        this.id = id;
    }

    @Override
    public void registrarObservador(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObservador(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservadores() {
        for (Observer obs : observers) {
            obs.atualizar(id, temperatura, umidade, poluicao);
        }
    }

    public void atualizarDados(double temperatura, double umidade, double poluicao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.poluicao = poluicao;
        notificarObservadores();
    }
}

