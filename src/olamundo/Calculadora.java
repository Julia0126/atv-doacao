// Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma Calculadora simples. O programa deverá ler dois números float: numero1 e numero2, e na sequência ler o Código da operação matemática (número inteiro de 1 a 4). A seguir, mostre na tela o resultado da operação entre os 2 números. Caso a operação seja diferente do intervalo 1 a 4, mostre a mensagem Operação Inválida!//

package exercicios;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float numero1;
		float numero2;
		int operacao;
		
		System.out.printf("Digite o primeiro número: ");
		numero1 = leia.nextFloat();
		
		System.out.printf("Digite o segundo número: ");
		numero2 = leia.nextFloat();
		
		System.out.printf("\nInsira a operação desejada\n "
				+ "Operação 1 - Soma\n "
				+ "Operação 2 - Subtração\n "
				+ "Operação 3 - Multiplicação\n "
				+ "Operação 4 - Divisão\n");
		operacao = leia.nextInt();
		
		leia.close();
		
        switch (operacao) {
        case 1:
            System.out.println("Resultado: " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
            break;
        case 2:
            System.out.println("Resultado: " + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
            break;
        case 3:
            System.out.println("Resultado: " + numero1 + " * " + numero2 + " = " + (numero1 * numero2));
            break;
        case 4:
            if (numero2 != 0) {
                System.out.println("Resultado: " + numero1 + " / " + numero2 + " = " + (numero1 / numero2));
            } else {
                System.out.println("Não é possível dividir por zero.");
            }
            break;
        default:
            System.out.println("Operação Inválida!"); // Como voltar pro laço anterior para que seja possível escolher a opção correta?
    }
		
		
	
		
	}
}
