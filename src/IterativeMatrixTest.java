import static org.junit.Assert.*;

import org.junit.Test;

public class IterativeMatrixTest {

	@Test
	public void StrassenTest() {
	int [] [] A = {{1,1},{1,1}};
	int [] [] B = {{1,1},{1,1}};
	int [] [] R = {{2,2},{2,2}};
	Strassen ss = new Strassen();
	int [] [] O = ss.multiply(A,B);
	assertArrayEquals(R, O);
	
	}

}
