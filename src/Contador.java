import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite o primeiro parâmetro:");
			int firstParam = scanner.nextInt();
			System.out.println("Digite o segundo parâmetro:");
			int secondParam = scanner.nextInt();
			
			try {
				//chamando o método contendo a lógica de contagem
				count(firstParam, secondParam);
			
			}catch (ParametrosInvalidosException exception) {
				//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
				System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			}
		}catch (Exception e) {
			System.out.println("Erro ao ler os parâmetros");

		}
		
	}
	static void count(int firstParam, int secondParam ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int diff = secondParam - firstParam;

		if (diff < 0) {
			throw new ParametrosInvalidosException();
		}
		//realizar o for para imprimir os números com base na variável contagem
		for (int i = 0; i <= diff; i++) {
			System.out.println(firstParam + i);
		}
	}
}