package N3;



public interface Sensor {
    void registrarObservador(Observer observer);
    void removerObservador(Observer observer);
    void notificarObservadores();
}
