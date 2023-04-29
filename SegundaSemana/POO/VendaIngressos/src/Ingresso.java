public class Ingresso {
	private String	tipo;
	private String	local;
	private String	data;
	private double	valor;
	private int		quantidade;
	
	public Ingresso(String tipo, String local, String data, double valor, int quantidade)
	{
		this.tipo = tipo;
		this.local = local;
		this.data = data;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public String getTipo(){
		return tipo;
	}
	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public String getLocal(){
		return local;
	}
	public void setLocal(String local){
		this.local = local;
	}

	public String getData(){
		return data;
	}
	public void setData(String data){
		this.data = data;
	}

	public double getValor(){
		return valor;
	}
	public void setValor(double valor){
		this.valor = valor;
	}

	public int getQuantidade(){
		return quantidade;
	}
	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}

	public void visualizar()
	{
		System.out.println("Tipo: " + tipo);
		System.out.println("Local: " + local);
		System.out.println("Data: " + data);
		System.out.println("Valor: " + valor);
		System.out.println("Quantidade: " + quantidade);
	}
}
