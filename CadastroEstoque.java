// [RF 001] Este requitos faz com que o sistema guarde as informoçoes do estoque e retorna as informoções guardadas

public class CadastroEstoque{
    private String masculino;
    private String feminino;
    private String infantil;
    private String calcados;
    private String diversos;

    public CadastroEstoque(String masculino, String feminino, String infantil, String calcados, String diversos){
        this.masculino = masculino ;
        this.feminino = feminino;
        this.infantil = infantil;
        this.calcados = calcados;
        this.diversos = diversos;
    }

    public String getMasculino() {
        return masculino;
    }
    public String getFeminino() {
        return feminino;
    }
    public String getinfantil(){
        return infantil;
    }
    public String getCalcados(){
        return calcados;
    }
    
    public String getDiversos(){
        return diversos;

    }

    

}


