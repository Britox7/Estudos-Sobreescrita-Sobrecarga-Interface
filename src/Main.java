public class Main {
    public static void main(String[] args) {

    Remedio remedio = new Remedio("Loratamed",10.00, 6);
    Farmaceutico farmaceutico = new Farmaceutico("Kauê");
    Caixa caixa = new Caixa("Kauê Brito");

    //Uso dos métodos da classe Caixa
    System.out.println("---Primeira consulta ao estoque---");
    caixa.consultar(remedio);

    System.out.println("---Venda do caixa apos consulta---");
    caixa.vender(remedio);

    caixa.consultar(remedio, caixa);

    //Uso dos métodos da classe Farmaceutico
    System.out.println("---Segunda consulta ao estoque---");
    farmaceutico.consultar(remedio);

    System.out.println("---Venda do farmacêutico apos segunda consulta---");
    farmaceutico.vender(remedio);

    farmaceutico.consultar(remedio, farmaceutico);

    }
}