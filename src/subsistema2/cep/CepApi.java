package subsistema2.cep;

import one.digitalinnovation.gof.Singleton.SingletonEager;

public class CepApi {
	private CepApi() {
		super();
		
	}
	
	public static CepApi getInstancia() {
		
		return getInstancia();
		
	}
	
	public String recuperarCidade(String cep) {
		return "Arraraquara";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
	}
}


