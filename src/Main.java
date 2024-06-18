public class Main {
    public static void main(String[] args) {

    Remedio remedio = new Remedio("Loratamed","12/12",10.00,6);
    Farmaceutico farmaceutico = new Farmaceutico("Loratamed","12/12",1099,"r");
    Cliente cliente = new Cliente("Loratamed",1212,"dd","fdf");
    Caixa caixa = new Caixa("Loratamed","121dsd",12,"fdf");


    System.out.println("---Primeira consulta ao estoque---");
    caixa.consultar(remedio);

    System.out.println("---Venda do caixa apos consulta---");
    caixa.vender(remedio);


    System.out.println("---Segunda consulta ao estoque---");
    farmaceutico.consultar(remedio);

    System.out.println("---Venda do farmacêutico apos segunda consulta---");
    farmaceutico.vender(remedio);



    }
}