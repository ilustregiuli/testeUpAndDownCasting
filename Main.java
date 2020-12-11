package testeUpAndDownCasting;

public class Main {

	public static void main(String[] args) {
		
		/* Up casting - quando uma classe Especializada é apontada por uma variável
		 * do tipo da Genérica (a "herdeira" é apontada pela "genitora"
		 */
		Ave giselda = new Galinha("Giselda",2,true,"Vermelho");  // Galinha herda de Ave, "giselda" é do tipo Ave mas aponta para um
																// objeto do tipo Galinha
		
		Ave harpia = new Ema("Harpia", 5, false,150);	// Ema herda de Ave, "harpia" é do tipo Ave mas aponta para um 
														// objeto do tipo Ema
		
		Ave desconhecida = new Ave(); 	// Um objeto do tipo Ave apontado por uma variável do tipo Ave
		
		/* Down casting - quando uma classe Genérica é apontada por uma variável
		 * do tipo da classe que se especializou dela - Herdeira (a "genitora" é apontada pela "herdeira"
		 * Naturalmente não pode ser feito. Para forçar, é preciso fazer a conversão - casting, colocando
		 * a classe do mesmo tipo entre parenteses antes do "new"
		 */
		Galinha gdesconhecida;	// Variável do tipo Galinha vai apontar para um objeto Ave. A conversão é feita 
		gdesconhecida = (Galinha) desconhecida;												// artificialmente.
		
		Ema edesconhecida = (Ema) new Ave();	// Variável do tipo Ema vai apontar para um objeto Ave. A conversão é feita 
												// artificialmente.
		
//		gdesconhecida.getPapo();  //"gdesconhecida" é do tipo Galinha, mas mesmo apontando para um objeto teoricamente Ave,
								  // tem os comportamentos de Galinha.
		
		giselda.bicar();	// Giselda é do tipo Ave, mas mesmo apontando para um objeto é uma Galinha, só tem os comportamentos
							// de Ave.
		
		
		System.out.println("Se for uma Galinha, vai fazer co có, se for Ave, vai fazer pic pic: " + giselda.bicar());
		
		
	}

}
