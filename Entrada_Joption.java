
// import Pacote.Biblioteca.Classe
import javax.swing.JOptionPane;

public class Entrada_Joption {

    public static void main(String[] args){

        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");

        String idade = JOptionPane.showInputDialog("Digite a sua idade: ");

        int idadeStr = Integer.parseInt(idade);

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));

        JOptionPane.showMessageDialog(null, "Meu nome é " + nome + ", tenho " + idadeStr + " anos, e " + altura + "m de altura.");

    }

}
