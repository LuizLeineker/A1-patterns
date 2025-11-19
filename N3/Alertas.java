package N3;


public class Alertas implements Observer {
    @Override
    public void atualizar(String sensorId, double temperatura, double umidade, double poluicao) {
        if (poluicao > 150) {
            System.out.println("ALERTA: POLUIÇÃO ALTA no sensor:  " + sensorId);
        }
    }
}

