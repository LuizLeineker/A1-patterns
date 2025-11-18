package N1;

public class RelatoryEmergencial extends Relatory{
    String aviso;
    public RelatoryEmergencial(String titulo, String fonte, String fonteSize, String dados , String aviso) {
        super(titulo, fonte, fonteSize, dados);
        this.aviso = aviso;
    }
}
