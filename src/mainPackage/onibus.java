package mainPackage;

public abstract class onibus extends veiculo{
	
	private int assentos;
	
	public int getAssentos(){
		return assentos;
	}

	public void setAssentos(int assentos){
		this.assentos = assentos;
	}

	public onibus(String Placa, int Ano, int Assentos){
	}
	
	public void exibirDados(){
	}
	
}
