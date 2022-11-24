public class Corredor extends Atleta{
    private String velocidade;

    public Corredor(String nome, Integer numero, String velocidade) {
        super(nome, numero);
        this.velocidade = velocidade;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEsporte: corrida" +
                "\nVelocidade: " + velocidade + "\n";
    }

    @Override
    public String treina() {
        return "Corre todos os dias da semana;";
    }
}
