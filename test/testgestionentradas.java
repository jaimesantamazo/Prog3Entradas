import static org.junit.Assert.*;

import org.junit.Test;

public class testgestionentradas {

	@Test
	public void test() {
		Entradas entradas = new Entradas();
		Gestionentradas gestionentradas = new Gestionentradas();
		Entradas entradas1 = gestionentradas.obtenerentradas(entradas);
	}

}
