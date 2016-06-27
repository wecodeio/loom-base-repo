package edu.tallerweb.conjuntos;

public class Par<T1, T2> {

	private final T1 elementoUno;
	private final T2 elementoDos;

	public Par(final T1 elementoUno, final T2 elementoDos) {
		throw new RuntimeException("No implementado aún");
	}

	public T1 getElementoUno() {
		return this.elementoUno;
	}

	public T2 getElementoDos() {
		return this.elementoDos;
	}

	@Override
	public boolean equals(final Object obj) {
		throw new RuntimeException("No implementado aún");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("No implementado aún");
	}

}
