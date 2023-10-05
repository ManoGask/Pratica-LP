package MountyHall;

import java.util.Random;
import java.util.Scanner;

public class MountyHall {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int portaPremiada = 0;
        int portaVazia = 0;
        int portaEscolhida = 0;


        portaPremiada = new Random().nextInt(3) + 1;


        do {
            System.out.println("Bem-vindo ao jogo Monty Hall!");
            System.out.println("Escolha uma porta (1, 2 ou 3): ");
            portaEscolhida = scanner.nextInt();
        } while (portaEscolhida < 1 || portaEscolhida > 3);


        do {
            portaVazia = new Random().nextInt(3) + 1;
        } while (portaVazia == portaPremiada || portaVazia == portaEscolhida);


        System.out.println("O apresentador abriu a porta " + portaVazia + " que está vazia.");


        System.out.println("Você deseja trocar para a outra porta? (s/n): ");
        String resposta = scanner.next();


        if (resposta.equals("S")) {
            portaEscolhida = 3 - portaEscolhida - portaVazia;
        }


        if (portaEscolhida == portaPremiada) {
            System.out.println("Você ganhou! Parabéns!");
        } else {
            System.out.println("Você perdeu. A porta premiada era a " + portaPremiada);
        }
    }
}




