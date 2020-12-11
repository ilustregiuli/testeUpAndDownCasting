package testeUpAndDownCasting;

public class Ave {
	
	protected String name;
	protected int anos;
	protected boolean voa;
	
	public Ave() {
		
	}

	public Ave(String name, int anos, boolean voa) {
		this.name = name;
		this.anos = anos;
		this.voa = voa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAnos() {
		return anos;
	}

	public void setAnos(int anos) {
		this.anos = anos;
	}

	public boolean isVoa() {
		return voa;
	}

	public void setVoa(boolean voa) {
		this.voa = voa;
	}
	
	public void voar() {
		System.out.println("Flap, flap, flap...");
	}
	
	public String bicar() {
		return "Pic, pic, pic!";
	}

}
