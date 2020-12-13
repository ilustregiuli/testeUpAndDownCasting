package testeUpAndDownCasting;

public class Galinha extends Ave {
	
	private String papo;
	
	public Galinha() {
		super();
	}
	
	public Galinha(String name, int anos, boolean voa, String papo) {
		super(name, anos, voa);
		this.papo = papo;
	}

	public String getPapo() {
		return papo;
	}

	public void setPapo(String papo) {
		this.papo = papo;
	}
	
	@Override
	public String voar() {
		return "Flap... tap tap... flap flap.... tap tap...";
	}
	
	@Override
	public String bicar() {
		return "Co cσσσσ...cσ cσ cσ...co cσσσσ΄!";
	}


}
