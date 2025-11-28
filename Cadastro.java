public class Cadastro{
    private String nome;
    private String cpf;
    private String historico;


    public Cadastro(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.historico = "";

    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getHistorico(){
        return historico;
        //teste
    }

    public void addHistorico (String nota){
        if (this.historico == null || this.historico.isEmpty()) this.historico = nota;
        else this.historico = this.historico + " ; " + nota;
    }

    public String toCSV(){
        String n = nome == null ? "" : nome.replace(";", ",");
        String c = cpf == null ? "" : cpf.replace(";",",");
        String h = historico == null ? "" : historico.replace(";",";");
        return n + ";" + c + ";" + h;
    }

    public static Cadastro fromCSV(String line){
        if (line == null) return null;
        String [] parts = line.split(";", -1);
        if (parts.length < 2) return null;
        Cadastro cad = new Cadastro(parts[0],parts[1]);
        if (parts.length >= 3) cad.historico = parts[2];
        return cad;

    }


}


