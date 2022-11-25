public class Nadador extends Atleta {
    private String estilo;

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public Nadador(String nome, Integer numero, String estilo) {
        super(nome, numero);
        this.estilo = estilo;
    }

    @Override
    public String treina() {
        return "Nada todos os dias da semana.";
    }

    @Override
    public String toString() {
        return super.toString()+
        "\nEsporte: Natação"+
        "\nEstilo: " + estilo + "\n";
    }
    
    
}
