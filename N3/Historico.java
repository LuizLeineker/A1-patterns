package N3;


public class Historico implements Observer {
    @Override
    public void atualizar(String sensorId, double temperatura, double umidade, double poluicao) {
        System.out.println("Registrando histórico do sensor " + sensorId + "...");
    }
}
