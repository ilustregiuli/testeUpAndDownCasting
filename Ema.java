package testeUpAndDownCasting;

public class Ema extends Ave{
	
	private int tamanhoPernas;
	
	public Ema() {
		super();
	}

	public Ema(String name, int anos, boolean voa, int tamanhoPernas) {
		super(name, anos, voa);
		this.tamanhoPernas = tamanhoPernas;
	}

	public int getTamanhoPernas() {
		return tamanhoPernas;
	}

	public void setTamanhoPernas(int tamanhoPernas) {
		this.tamanhoPernas = tamanhoPernas;
	}
	
	@Override
	public void voar() {
		System.out.println("...............");
	}
	
	@Override
	public String bicar() {
		return "Bicão! Bicão!";
	}

}
