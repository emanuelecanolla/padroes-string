package one.digitalinnovation.gof.Srategy;

public class Robo {

	public Comportamento comportamento;

	public void setComportamento (Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover () {
		comportamento.mover();
	}
	
}
