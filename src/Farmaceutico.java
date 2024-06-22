import java.util.Scanner;

public class Farmaceutico implements Operacoes{

    private String nome;
    Scanner scr = new Scanner(System.in);

    public Farmaceutico(String nome){

        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Sobrescrita do Método vender
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
                System.out.println("As " + qtdRemedio + " caixas do medicamento " + remedio.getNome() + " que o(a) cliente " + nome +  " comprou, custaram "
                        + valorFinal * qtdRemedio + "R$");
                int qtdFinal = remedio.getQntd() - qtdRemedio;
                quantidadeValida = true;
                remedio.setQntd(qtdFinal);
            }

        } while (!quantidadeValida);

    }

    //Sobrescrita do Método consultar
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

    //Sobrecarga do Método consultar
    public void consultar(Remedio remedio, Farmaceutico farmaceutico){

        System.out.println("Depois da venda realizada temos " + remedio.getQntd() + " " + remedio.getNome() + " em estoque, consulta " +
                "realizada pelo Farmacêutico " + farmaceutico.getNome());
    }

}
