import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String aux;
        int idade;

        aux = JOptionPane.showInputDialog("Qual é a idade do seu filho?");
        idade = Integer.parseInt(aux);

        if (idade <= 5 || idade > 20) {
            JOptionPane.showMessageDialog(null, "Infelizmente seu filho não pode se matricular na nossa escola.");
        } else {
            switch (idade){
                case 6: case 7:
                    JOptionPane.showMessageDialog(null, "Parabéns!! Seu filho está na categoria sub-7.");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Parabéns!! Seu filho está na categoria sub-8.");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Parabéns!! Seu filho está na categoria sub-9.");
                    break;
                case 10: case 11:
                    JOptionPane.showMessageDialog(null, "Parabéns!! Seu filho está na categoria sub-11.");
                    break;
                case 12: case 13:
                    JOptionPane.showMessageDialog(null, "Parabéns!! Seu filho está na categoria sub-13.");
                    break;
                case 14: case 15:
                    JOptionPane.showMessageDialog(null, "Parabéns!! Seu filho está na categoria sub-15.");
                    break;
                case 16: case 17:
                    JOptionPane.showMessageDialog(null, "Parabéns!! Seu filho está na categoria sub-17.");
                    break;
                case 18: case 19: case 20:
                    JOptionPane.showMessageDialog(null, "Parabéns!! Seu filho está na categoria sub-20.");
                    break;
            }
        }
    }
}