# Lotofacil 

Este código Java implementa um programa chamado "Lotofácil" que simula um jogo de apostas simples com três opções diferentes:

Apostar de 0 a 100: O usuário pode fazer uma aposta em um número de 0 a 100. Se a aposta for igual ao número sorteado, o usuário ganha R$ 1.000,00 reais.

Apostar de A à Z: O usuário pode fazer uma aposta em uma letra de A a Z. Se a letra apostada for igual à letra premiada, o usuário ganha R$ 500,00 reais.

Apostar em número par ou ímpar: O usuário pode fazer uma aposta em um número inteiro. Se o número for par, o usuário ganha R$ 100,00 reais.

O programa começa com um menu que permite ao usuário escolher entre essas três opções ou sair do jogo. O código faz uso de um loop do-while para continuar executando até que o usuário escolha a opção de sair (opção 0).

Além disso, o código usa entrada e saída de dados (Scanner e System.in) para interagir com o usuário, e gera números aleatórios usando a classe Random.

Há tratamentos de erro para situações em que o usuário faz apostas inválidas, como inserir um número fora do intervalo especificado ou fornecer uma entrada inválida ao apostar em uma letra.

Por fim, o código fecha o Scanner quando o jogo termina para liberar os recursos.


A versão do java utilizada foi a 20.0.2


 Bibliotecas Utilizadas: O projeto utiliza as seguintes bibliotecas do Java:
        java.util.Scanner: Para ler entradas do teclado.
        java.util.Random: Para gerar números aleatórios.
        java.io.IOException: Para lidar com exceções de entrada/saída.

