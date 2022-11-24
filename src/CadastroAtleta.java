import javax.swing.*;
import java.util.ArrayList;

public class CadastroAtleta {
    private ArrayList<Atleta> atletas;

    public CadastroAtleta(){
        this.atletas = new ArrayList<Atleta>();
    }

    public String[] leValores (String dadosIn){
        String[] dadosOut = new String [3];

        dadosOut[0] = JOptionPane.showInputDialog("Entre com o nome:");
        dadosOut[1] = JOptionPane.showInputDialog("Entre com o número:");
        dadosOut[2] = JOptionPane.showInputDialog("Entre com " + dadosIn +" :");

        return dadosOut;
    }

    public Saltador leSaltador(){
        String[] valores = new String[3];
        String altura = "a altura do Atleta em cm";
        valores = leValores(altura);

        Integer alturaPassada = this.retornaInteiro(valores[2]);
        Integer numeroAtleta = this.retornaInteiro(valores[1]);
        return new Saltador(valores[0], numeroAtleta, alturaPassada);
    }

    public Corredor leCorredor(){
        String[] valores = new String[3];
        String velocidade = "a velocidade alcançada";
        valores = leValores(velocidade);

        Integer numeroAtleta = this.retornaInteiro(valores[1]);
        return new Corredor(valores[0], numeroAtleta, valores[2]);
    }

    public Nadador leNadador(){
        String[] valores = new String[3];
        String estilo = "o estilo de preferencia do nadador";
        valores = leValores(estilo);

        Integer numeroAtleta = this.retornaInteiro(valores[1]);
        return new Nadador(valores[0], numeroAtleta, valores[2]);
    }

    private boolean intValido(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int retornaInteiro(String entrada){
        while (!this.intValido(entrada)) {
            entrada = JOptionPane.showInputDialog(null, "Valor incorreto! \n\nDigite um número inteiro.");
        }
        return Integer.parseInt(entrada);
    }

    private String menuInit(){
        return "Cadastro de novos Atletas\n" +
                "Opções:\n" +
                "1. Cadastrar novo Atleta;\n" +
                "2. Exibir todos Atletas já\n cadastrados;\n" +
                "3. Limpar atletas;\n"+
                "4. Sair.";
    }

    private int getOption(String menu){
        return this.retornaInteiro(JOptionPane.showInputDialog((menu + "\n\n" + "Digite a opção desejada:\n")));
    }

    public void menuCadastro(){
        String menu = menuInit();
        int opc1, opc2;
        do{
            opc1 = getOption(menu);
            if(opc1 > 4){
                System.out.println("Opção inválida, tente novamente!");
                menuInit();
                opc1 = getOption(menu);
            }
            switch (opc1) {
                case 1: menu = "Cadastro de Novos Atletas:\n" +
                        "Opções: \n" +
                        "1. Saltador;\n" +
                        "2. Corredor;\n" +
                        "3. Nadador.\n";
                opc2 = this.retornaInteiro(JOptionPane.showInputDialog(menu + "\n\n" + "Digite a opção desejada:\n"));
                    switch (opc2){
                        case 1: atletas.add(leSaltador());
                            break;
                        case 2: atletas.add(leCorredor());
                            break;
                        case 3: atletas.add(leNadador());
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Entrada NÃO válida!");
                    }
                    menu = menuInit();
                    break;
                case 2:
                    if (atletas.size() == 0) {
                    JOptionPane.showMessageDialog(null, "Entre com atletas ...");
                    break;
                }
                    String dados = "";
                    for (int i=0; i < atletas.size(); i++)    {
                        dados +=   atletas.get(i).toString() + "---------------\n";
                    }
                    JOptionPane.showMessageDialog(null,dados);
                    break;
                case 3:
                    if ( atletas.size() == 0) {
                        JOptionPane.showMessageDialog(null, "Entre com atletas ...");
                        break;
                    }
                    atletas.clear();
                    JOptionPane.showMessageDialog(null, "Dados LIMPOS com sucesso!");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Fim do aplicativo de Cadastro de Atletas");
                    break;
            }
        } while (opc1 != 4);
    }
    public static void main (String [] args){
        CadastroAtleta pet = new CadastroAtleta();
        pet.menuCadastro();
    }
}
