package N3;

public class Logs {
    private static Logs instancia = new Logs();
    private String erros;

    private String eventos;

    private String auditoria;


    private Logs() {
        System.out.println("Logs Criadas");
    }

    public static Logs getInstance(){
        return instancia;
    }

    public void setErros(String erros){
        if(this.erros == null){
            this.erros = erros;
        }
        else {
            this.erros = this.erros + erros;
        }
    }

    public String getErros(){
        if(this.erros == null){
            System.out.println("Logs sem erros");
            return this.erros;
        }
        else {
            return this.erros;
        }
    }

    // set/get eventos, set/get auditoria
}
