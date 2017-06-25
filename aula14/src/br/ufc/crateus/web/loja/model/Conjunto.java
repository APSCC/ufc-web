package br.ufc.crateus.web.loja.model;

import java.util.List;

public abstract class Conjunto {

	private List<Integer> elementos;

	public List<Integer> getElementos() {
		return elementos;
	}

	protected abstract void executaOperacao(List<Integer> conjunto);
}
