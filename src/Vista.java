import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.naming.NamingException;
import javax.swing.DefaultComboBoxModel;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JComboBox cBRutas;
	private JLabel lbl3;
	private JLabel lbl2;
	private JLabel lbl1;
	private Controlador controlador;
	private Modelo modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 286);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		cBRutas = new JComboBox();
		cBRutas.setModel(new DefaultComboBoxModel(new String[] { "file:C:\\Users\\manuel.blanco\\Desktop",
				"file:D:\\Programas", "file:C:\\Users\\manuel.blanco\\Documents" }));

		JButton btnMostrar = new JButton("Buscar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					controlador.buscarFichero();
				} catch (NamingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		txt1 = new JTextField();
		txt1.setColumns(10);
		txt1.setText(null);

		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setText(null);

		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setText(null);
		lbl1 = new JLabel("");

		lbl2 = new JLabel("");

		lbl3 = new JLabel("");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(cBRutas, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txt3, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
								.addComponent(txt2)
								.addComponent(txt1))
							.addGap(22)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addComponent(lbl3, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addGap(14))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(lbl2, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
									.addComponent(lbl1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnMostrar, Alignment.LEADING))))
					.addGap(11))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(42)
					.addComponent(cBRutas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lbl1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(txt1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txt2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lbl3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(txt3))
					.addGap(18)
					.addComponent(btnMostrar)
					.addContainerGap(57, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

	public JTextField getTxt1() {
		return txt1;
	}

	public void setTxt1(JTextField txt1) {
		this.txt1 = txt1;
	}

	public JTextField getTxt2() {
		return txt2;
	}

	public void setTxt2(JTextField txt2) {
		this.txt2 = txt2;
	}

	public JTextField getTxt3() {
		return txt3;
	}

	public void setTxt3(JTextField txt3) {
		this.txt3 = txt3;
	}

	public JComboBox getcBRutas() {
		return cBRutas;
	}

	public void setcBRutas(JComboBox cBRutas) {
		this.cBRutas = cBRutas;
	}

	public JLabel getLbl3() {
		return lbl3;
	}

	public void setLbl3(String text3) {
		this.lbl3.setText(text3);
	}

	public JLabel getLbl2() {
		return lbl2;
	}

	public void setLbl2(String text2) {
		this.lbl2.setText(text2);
	}

	public JLabel getLbl1() {
		return lbl1;
	}

	public void setLbl1(String text) {
		this.lbl1.setText(text);
	}

	public void textoLabel1(String txtlbl) {
		this.lbl1.setText(txtlbl);
	}

	public void textoLabel2(String txtlb2) {
		this.lbl2.setText(txtlb2);
	}

	public void textoLabel3(String txtlb3) {
		this.lbl3.setText(txtlb3);
	}

	public void setModelo(Modelo modelo) {
		// TODO Auto-generated method stub
		this.modelo = (Modelo) modelo;
	}

	public void setControlador(Controlador controlador) {
		// TODO Auto-generated method stub
		this.controlador = (Controlador) controlador;
	}

}
