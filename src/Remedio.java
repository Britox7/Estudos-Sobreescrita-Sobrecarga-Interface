public class Remedio {
    private String nome;
    private String dataVal;
    private Double valor;
    private int qntd;

    public Remedio(String nome, String dataVal, Double valor, int qntd){
        this.nome = nome;
        this.dataVal = dataVal;
        this.valor = valor;
        this.qntd = qntd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataVal() {
        return dataVal;
    }

    public void setDataVal(String dataVal) {
        this.dataVal = dataVal;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }
}
