package application;

import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();
		
		try {
			if (parametroUm >= parametroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }
			
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm < parametroDois) {
			int contagem = parametroDois - parametroUm;
			for (int i = 1; i <= contagem; i++)
			System.out.println("Imprimindo o número" + i);

		}
		
	}

}
