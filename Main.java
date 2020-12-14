package testeUpAndDownCasting;

public class Main {

	public static void main(String[] args) {
		
	// Alguns testes com upcasting e downcasting
		
	// Duas vari�veis "Super" referenciando objetos "Sub"	
	Ave giselda = new Galinha();
	Ave harpia = new Ema();
	
	// Duas vari�veis "Sub" referenciando objetos "Super"
/*	
 * Galinha desconhecidaG = (Galinha) new Ave();
 * Ema desconhecidaE = (Ema) new Ave();
 * 
 * ESSE C�DIGO APRESENTOU ERRO - MESMO UTTILIZANDO CASTING, N�O FOI POSS�VEL FAZER A CONVERS�O
 * 
 * REGRA 1 = UM OBJETO SUPER N�O PODE SER REFERENCIADO POR UMA VARI�VEL SUB, NEM COM CASTING
 * 
 */
	
	// Duas vari�veis "Sub" referenciando objetos do mesmo tipo (Normal)
	Galinha g = new Galinha();
	Ema e = new Ema();
	
	/* "Giselda e Harpia" que s�o do tipo "Ave", aceitam referenciar objetos Galinha
	 * 
		giselda = g;
		harpia = e; 
	*/
	
	// Criando um objeto do tipo "Ave", com vari�vel do mesmo tipo
	Ave desconhecida = new Ave();
	
	/*
		g = (Galinha) desconhecida;
		
		APRESENTOU ERRO - UMA VARI�VEL DO TIPO GALINHA N�O CONSEGUE REFERENCIAR UM OBJETO DO TIPO AVE
	*/
	
	/* Testando o comportamento de "giselda" e "harpia", as duas se comportam como "Aves" mas quando chamado o m�todo
	 comum entre elas e "Ave" (bicar), cada uma se comporta de uma forma diferente, conforme a sua sobrescrita */
	
	System.out.println(giselda.bicar());
	System.out.println(harpia.bicar());
	
	/* Testando m�todos que s� existem nas classes Galinha e Ema
	 * 
	 * 	giselda.setPapo("Amarelo");
	 * 	harpia.setTamanhoPernas(75);
	 * 
	 * 	APESAR DE REFERENCIAREM OBJETOS DO TIPO "GALINHA" E "EMA", AS VARI�VEIS "giselda" e "harpia" n�o conseguem 
	 * 	EXECUTAR UM M�TODO DO OBJETO "SUB". SOMENTE DO TIPO "SUPER". C�DIGO N�O EXECUTA
	 * 
	 * REGRA 2 = SE UMA VARIAVEL SUPER REFERENCIAR OBJETOS SUB, ELA S� VAI CONSEGUIR ACESSAR DADOS E M�TODOS DA SUPER,
	 * 			 POR�M, SE ESSES M�TODOS FORAM SOBREESCRITOS NA SUB, ELE VAI SE COMPORTAR COMO NA SUB (POLIMORFISMO).
	 * 		
	 * NESSE CASO, � POSS�VEL FAZER CASTING QUANDO A VARI�VEL � "SUPER" MAS APONTA PARA UM OBJETO "SUB"
	 */
	((Galinha) giselda).setPapo("Amarelo");
	((Ema) harpia).setTamanhoPernas(75);
	
	// Aqui a vari�vel (g) � "SUB" e recebe uma referencia de um objeto "SUB", por�m, referenciado por uma vari�vel "SUPER"
	g = (Galinha) giselda;
	e = (Ema) harpia;
	
	System.out.println(g.getPapo()); // "g" foi convertido em "Galinha" e consegue chamar o m�todo .getPapo (s� de "Galinha")
	giselda.setName("Giselda, a galinha");
	System.out.println(giselda.getName()); // "giselda" aponta para um objeto galinha, mas como � referenciado por uma "Ave", n�o
										   // consegue chamar
	
	System.out.println(e.getTamanhoPernas());
	harpia.setName("Harpia, a ema");
	System.out.println(harpia.getName());
	
	/*
	 * CONCLUS�O: N�O IMPORTA O TIPO DE REFERENCIA DA VARI�VEL, ELA S� VAI CONSEGUIR REFERENCIAR UM OBJETO MAIS ESPECIALIZADO 
	 *  - UMA "SUB" N�O VAI CONSEGUIR REFERENCIAR UM OBJETO "SUPER"
	 *  
	 *  O CASTING SE FAZ NECESS�RIO QUANDO:
	 *  - UM OBJETO "SUB" EST� SENDO REFERENCIADO POR UMA VARI�VEL "SUPER" (OK) E VOC� DESEJA QUE UMA VARI�VEL "SUB"
	 *   PASSE A REFERENCIAR ESSE MESMO OBJETO (SUB).
	 *   
	 *   POLIMORFISMO:
	 *   QUANDO UMA VARI�VEL DE SUPER REFERENCIAR UM OBJETO SUB, AO CHAMAR ALGUM M�TODO QUE FOI SOBREESCRITO NA SUB,
	 *   ESSE M�TODO VAI SE COMPORTAR COMO NA SUB, E N�O NA SUPER.
	 *   ESSE � UM DOS CONCEITOS DE POLIMORFISMO.
	 *   
	 */
	
	
	// instanceof - compara uma vari�vel com uma classe e devolve "true" or "false" se a variavel for instancia da classe
	System.out.println("******************************************************************************");
	System.out.println("g � uma instancia de Galinha?");
	System.out.println(g instanceof Galinha);
	System.out.println("giselda � uma instancia de Galinha?");
	System.out.println(giselda instanceof Galinha);
	System.out.println("giselda � uma instancia de Ave?");
	System.out.println(giselda instanceof Ave);

	}

}
