package N1;

public abstract class Relatory {
    String titulo;
    String fonte;

    String fonteSize;
    String dados;

    public Relatory(String titulo, String fonte, String fonteSize, String dados){
        this.titulo = titulo;
        this.fonte = fonte;
        this.fonteSize = fonteSize;
        this.dados = dados;
    }
}
