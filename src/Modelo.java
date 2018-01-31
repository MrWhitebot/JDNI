
public class Modelo {

	private Vista vista;
	private Controlador controlador;

	public void setVista(Vista vista) {
		// TODO Auto-generated method stub
		this.vista = (Vista) vista;
	}

	public void setControlador(Controlador controlador) {

		this.controlador = (Controlador) controlador;
	}

	public void setLabelRespuesta(int num, boolean resp) {
		String encontrado = "Encontrado";
		String noEncontrado = "No Encontrado";

		if (num == 1) {
			if (resp == true) {
				vista.setLbl1(encontrado);
				;
			} else {
				vista.setLbl1(noEncontrado);
			}
		} else if (num == 2) {
			if (resp == true) {
				vista.setLbl2(encontrado);
			} else {
				vista.setLbl2(noEncontrado);
			}
		} else if (num == 3) {
			if (resp == true) {
				vista.setLbl3(encontrado);
			} else {
				vista.setLbl3(noEncontrado);
			}

		}

	}

}
