package N3;

public class Main {
    public static void main(String[] args) {

        Sensor sensorA = new Sensores("A1");

        Observer painel = new Controle();
        Observer alertas = new Alertas();
        Observer historico = new Historico();

        sensorA.registrarObservador(painel);
        sensorA.registrarObservador(alertas);
        sensorA.registrarObservador(historico);
        
    }
}