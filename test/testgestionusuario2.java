import static org.junit.Assert.*;

import org.junit.Test;

public class testgestionusuario2 {

	@Test
	public void test() {
		Usuario usuario = new Usuario();
		Gestionusuario2 gestionusuario = new Gestionusuario2();
		Usuario usuario1 = gestionusuario.obtenerusuario2(usuario);
	}

}
