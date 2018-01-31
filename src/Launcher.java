
public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador();
		Vista vista = new Vista();

		modelo.setVista(vista);
		vista.setControlador(controlador);
		vista.setModelo(modelo);
		controlador.setModelo(modelo);
		controlador.setVista(vista);

		vista.setVisible(true);
	}

}
