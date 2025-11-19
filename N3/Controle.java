package N3;


public class Controle implements Observer {
    @Override
    public void atualizar(String sensorId, double temperatura, double umidade, double poluicao) {
        System.out.println("Painel - Sensor " + sensorId + ": Temp=" + temperatura + ", Umid=" + umidade + ", Poluição=" + poluicao);
    }
}

