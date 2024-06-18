import java.util.Scanner;

public class Caixa implements Operacoes{
    private String cltNum;
    private String nome ;
    private String endereco;
    private int cpf ;
    Scanner scr = new Scanner(System.in);

    public Caixa(String nome, String endereco, int cpf, String cltNum){
        this.nome = nome;
        this.cltNum = cltNum;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Scanner getScr() {
        return scr;
    }

    public void setScr(Scanner scr) {
        this.scr = scr;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getCltNum() {
        return cltNum;
    }

    public void setCltNum(String cltNum) {
        this.cltNum = cltNum;
    }


    @Override
    public void vender(Remedio remedio){

        double valorFinal = remedio.getValor() * 0.70;
        int qtdRemedio;
        boolean quantidadeValida;
        String nome;

        System.out.println("Qual seu nome senhor(a)?");
        nome = scr.nextLine();

        do {
            System.out.println("Quantas caixas deseja?");
            qtdRemedio = scr.nextInt();

            if (qtdRemedio > remedio.getQntd()) {
                System.out.println("A venda não pode ser realizada, pois temos apenas " + remedio.getQntd() + " caixa(s) do medicamento");
                quantidadeValida = false;
            } else {
                System.out.println("Todas as " + qtdRemedio + " caixas do medicamento " + remedio.getNome() + " que o cliente " + nome +  ", custaram "
                        + valorFinal * qtdRemedio + "R$");
                int qtdFinal = remedio.getQntd() - qtdRemedio;
                quantidadeValida = true;
                remedio.setQntd(qtdFinal);
            }

        } while (!quantidadeValida);

    }

    @Override
    public void consultar(Remedio remedio){

        if (remedio.getQntd() <= 0){
            System.out.println("Desculpe, não temos mais estoque desse medicamento");
        } else {
            System.out.println("Temos " + remedio.getQntd() + " " +remedio.getNome() + " em estoque, " +
                    "seu valor sem o desconto de 30% é de " + remedio.getValor() + "R$");
            System.out.println("Mas estamos em promoção, então o seu valor agora sera de " + remedio.getValor() * 0.70 + "R$");
        }

    }

}
