import java.io.Serializable;

public abstract class Atleta  implements Serializable{
    private String nome;
    private Integer numero;

    public Atleta(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Atleta:\n" +
                "Nome: " + nome +
                "\nNúmero: " + numero;
    }

    public abstract String treina();

}
