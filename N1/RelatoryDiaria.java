package N1;

public class RelatoryDiaria extends Relatory{
    String horario;
    String lucro;
    public RelatoryDiaria(String titulo, String fonte, String fonteSize, String dados, String horario,String lucro ) {
        super(titulo, fonte, fonteSize, dados);
        this.horario = horario;
        this.lucro = lucro;
    }
}
