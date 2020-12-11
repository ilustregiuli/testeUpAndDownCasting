package testeUpAndDownCasting;

public class Main {

	public static void main(String[] args) {
		
		/* Up casting - quando uma classe Especializada � apontada por uma vari�vel
		 * do tipo da Gen�rica (a "herdeira" � apontada pela "genitora"
		 */
		Ave giselda = new Galinha("Giselda",2,true,"Vermelho");  // Galinha herda de Ave, "giselda" � do tipo Ave mas aponta para um
																// objeto do tipo Galinha
		
		Ave harpia = new Ema("Harpia", 5, false,150);	// Ema herda de Ave, "harpia" � do tipo Ave mas aponta para um 
														// objeto do tipo Ema
		
		Ave desconhecida = new Ave(); 	// Um objeto do tipo Ave apontado por uma vari�vel do tipo Ave
		
		/* Down casting - quando uma classe Gen�rica � apontada por uma vari�vel
		 * do tipo da classe que se especializou dela - Herdeira (a "genitora" � apontada pela "herdeira"
		 * Naturalmente n�o pode ser feito. Para for�ar, � preciso fazer a convers�o - casting, colocando
		 * a classe do mesmo tipo entre parenteses antes do "new"
		 */
		Galinha gdesconhecida;	// Vari�vel do tipo Galinha vai apontar para um objeto Ave. A convers�o � feita 
		gdesconhecida = (Galinha) desconhecida;												// artificialmente.
		
		Ema edesconhecida = (Ema) new Ave();	// Vari�vel do tipo Ema vai apontar para um objeto Ave. A convers�o � feita 
												// artificialmente.
		
//		gdesconhecida.getPapo();  //"gdesconhecida" � do tipo Galinha, mas mesmo apontando para um objeto teoricamente Ave,
								  // tem os comportamentos de Galinha.
		
		giselda.bicar();	// Giselda � do tipo Ave, mas mesmo apontando para um objeto � uma Galinha, s� tem os comportamentos
							// de Ave.
		
		
		System.out.println("Se for uma Galinha, vai fazer co c�, se for Ave, vai fazer pic pic: " + giselda.bicar());
		
		
	}

}
