package one.digitalinnovation.gof;

import one.digitalinnovation.gof.Singleton.SingletonLazy;
import one.digitalinnovation.gof.Srategy.Comportamento;
import one.digitalinnovation.gof.Srategy.Robo;

public class Teste {
//singleton
	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.print(lazy);
		lazy= SingletonLazy.getInstancia();
		System.out.print(lazy);
		
// strategy
		
		Comportamento defensivo= new ComportamentoDefensivo();
		Comportamento normal= new ComportamentoNormal();
		Comportamento agressivo= new ComportamentoAgressivo();
		
		Robo robo= new Robo();
		robo.setComportamento(normal);
		
		robo.mover();
		robo.mover();
		
	}

}
