package N3;

public interface Observer {
    void atualizar(String sensorId, double temperatura, double umidade, double poluicao);
}
