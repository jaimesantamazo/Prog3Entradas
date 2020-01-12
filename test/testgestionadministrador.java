import static org.junit.Assert.*;

import org.junit.Test;

public class testgestionadministrador {
	
	@Test
	public void testobteneradministrador() {
		Administrador admin1 = new Administrador();
		Gestionadministrador gestionadministracion = new Gestionadministrador();
		Administrador admin = gestionadministracion.obteneradministrador(admin1);
	}

}
