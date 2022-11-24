public class Saltador extends Atleta{
    private Integer altura;

    public Saltador(String nome, Integer numero, Integer altura) {
        super(nome, numero);
        this.altura = altura;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEsporte: Salto" +
                "\nAltura: " + altura + "\n";
    }

    @Override
    public String treina() {
        return "Treina salto 3x por semana";
    }
}
