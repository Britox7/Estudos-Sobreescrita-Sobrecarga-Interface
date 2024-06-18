import java.util.Scanner;

public class Farmaceutico implements Operacoes{

    private String rgConselhoFar;
    private String nome;
    private String endereco;
    private int cpf;
    Scanner scr = new Scanner(System.in);

    public Farmaceutico(String nome, String endereco, int cpf, String rgConselhoFar){

        this.rgConselhoFar = rgConselhoFar;
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;

    }

    public String getRgConselhoFar() {
        return rgConselhoFar;
    }

    public void setRgConselhoFar(String rgConselhoFar) {
        this.rgConselhoFar = rgConselhoFar;
    }

    @Override
    public void vender(Remedio remedio){

        double valorFinal = remedio.getValor() * 0.70;
        int qtdRemedio;
        boolean quantidadeValida;
        String nome;

        System.out.println("Qual o seu nome senhor(a)?");
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
