package org.formation.model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NameTest {

	@Test
	public void verifie_prenom_egal_nom() {
		
		Name n = new Name();
		assertTrue(n.retrouverNom("Nabila", "Nabila"));
		
		
	}

}
