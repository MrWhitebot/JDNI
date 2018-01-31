import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Controlador {

	private Modelo modelo;
	private Vista vista;

	public void setModelo(Modelo modelo) {
		// TODO Auto-generated method stub
		this.modelo = (Modelo) modelo;
	}

	public void setVista(Vista vista) {
		// TODO Auto-generated method stub
		this.vista = (Vista) vista;
	}

	public void buscarFichero() throws NamingException {
		List<String> seleccion = new ArrayList<String>();

		seleccion.add(vista.getcBRutas().getSelectedItem().toString());
		if (vista.getTxt1().getText() != null && vista.getTxt1().getText().length()>1) {
			seleccion.add(vista.getTxt1().getText().toString());
		}
		if (vista.getTxt2().getText() != null && vista.getTxt2().getText().length()>1) {
			seleccion.add(vista.getTxt2().getText().toString());
		}
		if (vista.getTxt2().getText() != null && vista.getTxt3().getText().length()>1) {
			seleccion.add(vista.getTxt2().getText().toString());
		}

		Properties propiedades = new Properties();

		propiedades.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");

		propiedades.put(Context.PROVIDER_URL, seleccion.get(0));
		Context ctx = new InitialContext(propiedades);

		for (int i = 1; i < seleccion.size(); i++) {
			try {
				ctx.lookup(seleccion.get(i).toString());
				modelo.setLabelRespuesta(i, true);
				System.out.println(seleccion.get(i).toString() + "  HA SIDO ENCONTRADO!!");
				System.out.println(i);
			} catch (NamingException ex) {

				modelo.setLabelRespuesta(i, false);
				System.out.println(seleccion.get(i).toString() + "  NO HA SIDO ENCONTRADO");
			}
		}
	}

}
