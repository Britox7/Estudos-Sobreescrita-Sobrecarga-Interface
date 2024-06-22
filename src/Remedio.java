public class Remedio {
    private String nome;
    private Double valor;
    private int qntd;

    public Remedio(String nome, Double valor, int qntd){
        this.nome = nome;
        this.valor = valor;
        this.qntd = qntd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
