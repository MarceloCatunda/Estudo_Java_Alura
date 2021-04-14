package br.com.bytebank.modelo;

//br.com.bytebank.modelo.SeguroVida ==> FQN
public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 42;
	}

}
