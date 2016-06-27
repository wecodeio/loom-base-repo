package edu.tallerweb.conjuntos;

import org.junit.Assert;
import org.junit.Test;

public class ConjuntoTests {

	@Test
	public void unoQueDaBien() {
		Assert.assertTrue(true);
	}

	@Test
	public void unoQueDaFailure() {
		Assert.assertTrue("opa, un failure! atento!", false);
	}

	@Test
	public void unoQueDaError() {
		throw new RuntimeException("Pucha che!");
	}
	
}
