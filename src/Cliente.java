public class Cliente{
    private String tipo;

    public Cliente(String nome, int cpf, String endereco, String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
