package Produtos;

public class Produto {
	
	public String nome;
	public int quantidade;
	public double preco;
	
	public double totalEstoque(){
		return preco * quantidade;
	}
		
	public void addProduto(int  quantidade) {
		this.quantidade += quantidade;
		
	}
	public void remove(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
		return nome
	    + ", $"
	    + preco
	    + ", "
	    + quantidade
	    +" unidade(s), Total: $"
	    +totalEstoque();
		
	}
}


