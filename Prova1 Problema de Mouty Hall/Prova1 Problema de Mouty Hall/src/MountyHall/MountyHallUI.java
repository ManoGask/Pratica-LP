package MountyHall;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class MountyHallUI extends JFrame {

    private JPanel painel;
    private JButton botaoEscolher;
    private JLabel labelPorta1;
    private JLabel labelPorta2;
    private JLabel labelPorta3;

    public MountyHallUI() {
        super("Jogo do Monty Hall");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        painel = new JPanel();
        add(painel);

        labelPorta1 = new JLabel("Porta 1");
        painel.add(labelPorta1);

        labelPorta2 = new JLabel("Porta 2");
        painel.add(labelPorta2);

        labelPorta3 = new JLabel("Porta 3");
        painel.add(labelPorta3);

        botaoEscolher = new JButton("Escolher");
        botaoEscolher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                escolherPorta();
            }


        });
        painel.add(botaoEscolher);

        setVisible(true);
    }

    private void escolherPorta() {

        Scanner scanner = new Scanner(System.in);


        int portaPremiada = new Random().nextInt(3) + 1;


        int portaEscolhida = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma porta (1, 2 ou 3): "));

        int portaVazia = 0;
        do {
            portaVazia = new Random().nextInt(3) + 1;
        } while (portaVazia == portaPremiada || portaVazia == portaEscolhida);


        JOptionPane.showMessageDialog(null, "O apresentador abriu a porta " + portaVazia + " que está vazia.");


        int opcao = JOptionPane.showConfirmDialog(null, "Você deseja trocar para a outra porta?");


        if (opcao == JOptionPane.YES_OPTION) {
            portaEscolhida = 3 - portaEscolhida - portaVazia;
        }


        if (portaEscolhida == portaPremiada) {
            JOptionPane.showMessageDialog(null, "Você ganhou! Parabéns!");
        } else {
            JOptionPane.showMessageDialog(null, "Você perdeu. A porta premiada era a " + portaPremiada);
        }
    }

    public static void main(String[] args) {
        new MountyHallUI();
    }
}
