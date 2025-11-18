package N1;

public class RelatorySemanal extends Relatory{
    String funcionariaSemanal;
    public RelatorySemanal(String titulo, String fonte, String fonteSize, String dados, String funcionariaSemanal) {
        super(titulo, fonte, fonteSize, dados);
        this.funcionariaSemanal = funcionariaSemanal;
    }
}
