package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Produtos.Produto;

public class Estoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("-------------------------------");
		System.out.println("Entre com os dados do produto: ");
		System.out.println("-------------------------------");
		System.out.printf("Nome do produto: ");
		produto.nome = sc.next();
		System.out.printf("Preço do produto: ");
		produto.preco = sc.nextDouble();
		System.out.printf("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println("-----------------------------");
		System.out.println("Dados do produtos inseridos: ");
		System.out.println("-----------------------------");
		System.out.println("Nome: " + produto.nome);
		System.out.println("Pre�o: " + produto.preco);
		System.out.println("Quantidade em estoque: " + produto.quantidade);
		
		System.out.printf("Digite a quantidade que irá adicionar no estoque: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		System.out.println("-----------------------------");
		System.out.println("Dados atualizados: " + produto);
		System.out.println("-----------------------------");
		
		System.out.printf("Digite a quantidade que ir� ser retirada do estoque: ");
		quantidade = sc.nextInt();
		produto.remove(quantidade);
		System.out.printf("Dados atualizados: " + produto);
		
		sc.close();

	}

}
