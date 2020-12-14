package testeUpAndDownCasting;

public class Main {

	public static void main(String[] args) {
		
	// Alguns testes com upcasting e downcasting
		
	// Duas variáveis "Super" referenciando objetos "Sub"	
	Ave giselda = new Galinha();
	Ave harpia = new Ema();
	
	// Duas variáveis "Sub" referenciando objetos "Super"
/*	
 * Galinha desconhecidaG = (Galinha) new Ave();
 * Ema desconhecidaE = (Ema) new Ave();
 * 
 * ESSE CÓDIGO APRESENTOU ERRO - MESMO UTTILIZANDO CASTING, NÃO FOI POSSÍVEL FAZER A CONVERSÃO
 * 
 * REGRA 1 = UM OBJETO SUPER NÃO PODE SER REFERENCIADO POR UMA VARIÁVEL SUB, NEM COM CASTING
 * 
 */
	
	// Duas variáveis "Sub" referenciando objetos do mesmo tipo (Normal)
	Galinha g = new Galinha();
	Ema e = new Ema();
	
	/* "Giselda e Harpia" que são do tipo "Ave", aceitam referenciar objetos Galinha
	 * 
		giselda = g;
		harpia = e; 
	*/
	
	// Criando um objeto do tipo "Ave", com variável do mesmo tipo
	Ave desconhecida = new Ave();
	
	/*
		g = (Galinha) desconhecida;
		
		APRESENTOU ERRO - UMA VARIÁVEL DO TIPO GALINHA NÃO CONSEGUE REFERENCIAR UM OBJETO DO TIPO AVE
	*/
	
	/* Testando o comportamento de "giselda" e "harpia", as duas se comportam como "Aves" mas quando chamado o método
	 comum entre elas e "Ave" (bicar), cada uma se comporta de uma forma diferente, conforme a sua sobrescrita */
	
	System.out.println(giselda.bicar());
	System.out.println(harpia.bicar());
	
	/* Testando métodos que só existem nas classes Galinha e Ema
	 * 
	 * 	giselda.setPapo("Amarelo");
	 * 	harpia.setTamanhoPernas(75);
	 * 
	 * 	APESAR DE REFERENCIAREM OBJETOS DO TIPO "GALINHA" E "EMA", AS VARIÁVEIS "giselda" e "harpia" não conseguem 
	 * 	EXECUTAR UM MÉTODO DO OBJETO "SUB". SOMENTE DO TIPO "SUPER". CÓDIGO NÃO EXECUTA
	 * 
	 * REGRA 2 = SE UMA VARIAVEL SUPER REFERENCIAR OBJETOS SUB, ELA SÓ VAI CONSEGUIR ACESSAR DADOS E MÉTODOS DA SUPER,
	 * 			 PORÉM, SE ESSES MÉTODOS FORAM SOBREESCRITOS NA SUB, ELE VAI SE COMPORTAR COMO NA SUB (POLIMORFISMO).
	 * 		
	 * NESSE CASO, É POSSÍVEL FAZER CASTING QUANDO A VARIÁVEL É "SUPER" MAS APONTA PARA UM OBJETO "SUB"
	 */
	((Galinha) giselda).setPapo("Amarelo");
	((Ema) harpia).setTamanhoPernas(75);
	
	// Aqui a variável (g) é "SUB" e recebe uma referencia de um objeto "SUB", porém, referenciado por uma variável "SUPER"
	g = (Galinha) giselda;
	e = (Ema) harpia;
	
	System.out.println(g.getPapo()); // "g" foi convertido em "Galinha" e consegue chamar o método .getPapo (só de "Galinha")
	giselda.setName("Giselda, a galinha");
	System.out.println(giselda.getName()); // "giselda" aponta para um objeto galinha, mas como é referenciado por uma "Ave", não
										   // consegue chamar
	
	System.out.println(e.getTamanhoPernas());
	harpia.setName("Harpia, a ema");
	System.out.println(harpia.getName());
	
	/*
	 * CONCLUSÃO: NÃO IMPORTA O TIPO DE REFERENCIA DA VARIÁVEL, ELA SÓ VAI CONSEGUIR REFERENCIAR UM OBJETO MAIS ESPECIALIZADO 
	 *  - UMA "SUB" NÃO VAI CONSEGUIR REFERENCIAR UM OBJETO "SUPER"
	 *  
	 *  O CASTING SE FAZ NECESSÁRIO QUANDO:
	 *  - UM OBJETO "SUB" ESTÁ SENDO REFERENCIADO POR UMA VARIÁVEL "SUPER" (OK) E VOCÊ DESEJA QUE UMA VARIÁVEL "SUB"
	 *   PASSE A REFERENCIAR ESSE MESMO OBJETO (SUB).
	 *   
	 *   POLIMORFISMO:
	 *   QUANDO UMA VARIÁVEL DE SUPER REFERENCIAR UM OBJETO SUB, AO CHAMAR ALGUM MÉTODO QUE FOI SOBREESCRITO NA SUB,
	 *   ESSE MÉTODO VAI SE COMPORTAR COMO NA SUB, E NÃO NA SUPER.
	 *   ESSE É UM DOS CONCEITOS DE POLIMORFISMO.
	 *   
	 */
	
	
	// instanceof - compara uma variável com uma classe e devolve "true" or "false" se a variavel for instancia da classe
	System.out.println("******************************************************************************");
	System.out.println("g é uma instancia de Galinha?");
	System.out.println(g instanceof Galinha);
	System.out.println("giselda é uma instancia de Galinha?");
	System.out.println(giselda instanceof Galinha);
	System.out.println("giselda é uma instancia de Ave?");
	System.out.println(giselda instanceof Ave);

	}

}
