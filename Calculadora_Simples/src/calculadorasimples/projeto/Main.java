package calculadorasimples.projeto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a operação que deseja realizar ou digite sair para finalizar: \n+ (Adição)\n- (Subtração)\n/ "
				+ "(Divisão)\n* (Multiplicação)");
		String Operação = input.nextLine();
		
		System.out.println("Digite os dois números para a operação: ");
		Double A = input.nextDouble();
		Double B = input.nextDouble();
		
		if(Operação.equals("+")){
			Double Soma = A+B;
			System.out.println("O resultado é: "+Soma);
		} else if(Operação.equals("-")) {
			Double Subtração = A-B;
			System.out.println("O resultado é: "+Subtração);
		} else if(Operação.equals("/")) {
			if(B != 0) {
				Double Divisão = A/B;
				System.out.println("O resultado é: "+Divisão);
			} else {
				System.out.println("Erro: Não é possível realizar divisão por zero");
			}
		} else if(Operação.equals("*")) {
			Double Multiplicação = A*B;
			System.out.println("O resultado é: "+Multiplicação);
		}
		}
	}
