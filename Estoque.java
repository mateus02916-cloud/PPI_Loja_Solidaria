public class Estoque {

    private String tipo;
    private String faixa;
    private String genero;
    private String tamanhoLetra;
    private String tamanhoNumero;
    private int quantidade;


    public Estoque(String tipo, String faixa, String genero, String tamanhoLetra, String tramanhoNumero, int quantidade){
        this.tipo = tipo; this.faixa = faixa; this.genero = genero;
        this.tamanhoLetra = tamanhoLetra; this.tamanhoNumero = tamanhoNumero;
        this.quantidade = quantidade;
    }



    public String getTipo() {
        return tipo;
    }
    public String geFaixa() {
        return faixa;
    }
    public String getGenero() {
        return genero;
    }
    public String getTamanhoLetra() {
        return tamanhoLetra;
    }
    public String getTamanhoNumero() {
        return tamanhoNumero;
    }
    public int getQuantidade() {
        return quantidade;
    }
    
    
    

}