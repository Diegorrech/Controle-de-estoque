
public class Produto {
	
	public String nome ;
	public double preco ;
	public int quantidade;
	
	public  double TotalEstoque(){
		double TotalEstoque = quantidade * preco;
		 return TotalEstoque;
	}
	
	public void addproduto(int quantidade) {
		this.quantidade +=quantidade;
	}
	public void removerEstoque(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
		return nome + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " unidades, valor total do estoque: $" + String.format("%.2f", TotalEstoque());
		 
	}

}
