package exercicio;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class LotoFacil {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);  // Criação de um objeto Scanner para leitura da entrada do usuário.
		Random random = new Random(); // Criação de um objeto Random para geração de números aleatórios.
		int opcao;
		
		// Loop do menu que continua até que o usuário escolha sair (opção 0).
		do {
			System.out.println("-----------------------------");
			System.out.println("Menu Loto Fácil:");
			System.out.println("1) Apostar de 0 a 100");
			System.out.println("2) Apostar de A a Z");
			System.out.println("3) Apostar em par ou impar");
			System.out.println("0) Sair");
			System.out.println("-----------------------------");
			System.out.println("Escolha uma opção: ");
			opcao = scanner.nextInt();
			
			switch(opcao) {
			
			case 1:
				apostarNumero(scanner, random); // opção para apostar um numero.
				break;
				
			case 2:
				apostarLetra(); //opção para apostar uma letra.
				break;
				
			case 3:
				apostarParImpar(scanner); //opção para apostar par ou impar.
				break;
				
			case 0:
				System.out.println("Saindo do sistema...");
				break;
				
				default:
					System.out.println("Opção invalida.");
					
			}
		} while (opcao != 0);
		
		scanner.close();
	}         // Método para realizar uma aposta numérica.
		private static void apostarNumero(Scanner scanner, Random random) {
			System.out.print("Digite um número de 0 a 100: ");
			int aposta = scanner.nextInt();
			if (aposta < 0 || aposta > 100) {
				System.out.println("Aposta inválida.");
				return;
			}
		int numeroSorteado = random.nextInt(101); //Vai sortear um número aleátorio.
		if(aposta == numeroSorteado) {
			System.out.println("Você ganhou R$1.000,00 reais");
		} else {
			System.out.println("Não foi desta vez! o número sorteado foi: " + numeroSorteado + ".");
		}
	}          // Método para realizar uma aposta em letras.
		private static void apostarLetra() throws IOException {
			System.out.println("Digite uma letra de A a Z: ");
			char entrada = (char) System.in.read();
			if (!Character.isLetter(entrada)) {
				System.out.println("Aposta inválida.");
				return;
			}
			char aposta = Character.toUpperCase(entrada);
			char letraPremiada = 'V'; //Aqui pode colocar a letra que quiser.
			if (aposta == letraPremiada) {
				System.out.println("Você ganhou R$500,00 reais");
			} else {
				System.out.println("Não foi desta vez! A letra sorteada foi: " + letraPremiada + ".");
			}
				
			
			
			System.in.read(new byte[System.in.available()]);
		}
		// Método para apostar em números pares ou ímpares.
		private static void apostarParImpar(Scanner scanner) {
			System.out.print("Digite um número: ");
			int numero = scanner.nextInt();
			if (numero % 2 == 0) { // Verifica se o número digitado é par.
				System.out.println("Você ganhou R$100,00 reais.");
				} else {
					System.out.println("Não foi desta vez! O número digitado é impar e o premio foi para número pares.");
				}
		}
}
	
	

