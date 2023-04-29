import java.util.Scanner;

public class Produto
{
	// atributos da classe
	private String	nome;
	private String	descricao;
	private double	preco;
	private int		unidades;
	private boolean	lancamento;

	//construtor da classe produto
	public	Produto(String nome, String decricao, double preco, int unidades, boolean lancamento)
	{
		this.nome = nome;
		this.descricao = decricao;
		this.preco = preco;
		this.unidades = unidades;
		this.lancamento = lancamento;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	

	public String getDescricao(){
		return descricao;
	}

	public void setDescricao(String descricao){
		this.descricao = descricao;
	}


	public double getPreco(){
		return preco;
	}

	public void setPreco(double preco){
		this.preco = preco;
	}


	public int getUnidades(){
		return unidades;
	}

	public void setUnidades(int unidades){
		this.unidades = unidades;
	}


	public boolean getlancamento(){
		return lancamento;
	}

	public void setlancamento(Boolean lancamento){
		this.lancamento = lancamento;
	}

	public void visualizar()
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("Descricao: " + this.descricao);
		System.out.println("Preco: $" + this.preco);
		System.out.println("Estoque: " + this.unidades + " unidades");
		System.out.println("lancamento: " + this.lancamento);
	}
}
