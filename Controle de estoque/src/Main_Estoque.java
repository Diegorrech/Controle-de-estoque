import java.util.Scanner;
import java.util.Locale;

public class Main_Estoque {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Produto produto = new Produto();
		
		
		System.out.print("digite o nome do produto :");
		produto.nome = entrada.next();
		
		System.out.print("digite o preco do produto :");
		produto.preco = entrada.nextDouble();
		
		System.out.print("digite a quantidade:");
		produto.quantidade = entrada.nextInt();
		
		System.out.println();
		System.out.println(produto.toString());
		
		System.out.println();
		
		System.out.println("digite o valor adicionado para o estoque ");
		int quantidade = entrada.nextInt();
		produto.addproduto(quantidade);
		
		System.out.println("quantidade add foi " + produto);
		
		System.out.println("");
		
		System.out.println("adicione quantos produtor quer remove do estoque ");
		quantidade = entrada.nextInt();
		
		produto.removerEstoque(quantidade);
		
		System.out.println("total de produtos removidos "+ produto);
		
		entrada.close();
	
	}

}
