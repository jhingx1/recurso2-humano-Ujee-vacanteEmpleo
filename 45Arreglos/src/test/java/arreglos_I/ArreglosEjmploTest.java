package arreglos_I;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.junit.Test;

public class ArreglosEjmploTest {

	private ArreglosEjmplo objeto;

	@Test
	public void testSolicitaCalificaciones() {

	}


	@SuppressWarnings("deprecation")
	@Test
	public void testCalculaPromedio() {

		objeto = new ArreglosEjmplo(70);

		double e;
		e = (100 + 90 + 70 + 80 + 40 + 50)/6.0;
		
		objeto.solicitaCalificaciones();
		double r = objeto.calculaPromedio();
		
		Assert.assertEquals(e, r,5);
	}

	
}
