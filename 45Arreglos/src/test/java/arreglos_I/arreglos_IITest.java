package arreglos_I;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class arreglos_IITest {
	
	private arreglos_II arreglos;

	@Test
	public void testDameNumero(){
		
		arreglos = new arreglos_II();
		
		Integer[] e = {1,2,3,4,5};
		
		Integer[] r = arreglos.dameNumero();
		
		assertArrayEquals(e, r);
		
	}

}
