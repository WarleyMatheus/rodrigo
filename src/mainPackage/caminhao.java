package mainPackage;

public abstract class caminhao extends veiculo{
	private int eixos;
	
	public caminhao(){
	}

	public int getEixos(){
		return eixos;
	}
	public void setEixos(int eixos){
		this.eixos = eixos;
	}
	
	public int exibirDados(){
		return getEixos();
	}
	
	
	
}
