package edu.tallerweb.conjuntos;

public class Conjunto<T> {

	public void agregar(final T elemento) {
		throw new RuntimeException("No implementado aún");
	}

	public void remover(final T elemento) {
		throw new RuntimeException("No implementado aún");
	}

	public boolean pertenece(final T elemento) {
		throw new RuntimeException("No implementado aún");
	}

	public Integer getCardinalidad() {
		throw new RuntimeException("No implementado aún");
	}

	@Override
	public boolean equals(final Object obj) {
		throw new RuntimeException("No implementado aún");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("No implementado aún");
	}

	public boolean incluye(final Conjunto<T> otro) {
		throw new RuntimeException("No implementado aún");
	}

	public Conjunto<T> union(final Conjunto<T> otro) {
		throw new RuntimeException("No implementado aún");
	}

	public Conjunto<T> interseccion(final Conjunto<T> otro) {
		throw new RuntimeException("No implementado aún");
	}

	public Conjunto<T> diferencia(final Conjunto<T> otro) {
		throw new RuntimeException("No implementado aún");
	}

	public Conjunto<T> complemento(final Conjunto<T> otro) {
		throw new RuntimeException("No implementado aún");
	}

	public Conjunto<T> diferenciaSimetrica(final Conjunto<T> otro) {
		throw new RuntimeException("No implementado aún");
	}

	public <S> Conjunto<Par<T, S>> productoCartesiano(final Conjunto<S> otro) {
		throw new RuntimeException("No implementado aún");
	}

	public Conjunto<Conjunto<T>> conjuntoPotencia() {
		throw new RuntimeException("No implementado aún");
	}

}
