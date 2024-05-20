package tareasFinales.formulario;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import unidad13.formulario.Pedido;

public class Formulario extends JFrame implements ActionListener{
    private JTextField campoNombre;
    private JTextField campoApellido;
    private JTextField campoDireccion;
    private JTextField campoNumero;
    private JCheckBox domicilioCheck;
    private JCheckBox recogerCheck;
    private JCheckBox localCheck;
    private JComboBox<String> pizzaSelect; 
    private JComboBox<String> tamañoSelect;

    private JButton botonAceptar;

    public Formulario() {
        super("PEDIDO TELEPIZZA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JPanel panelNombre = new JPanel();
        panelNombre.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelNombre.add(new JLabel("Nombre:"));
        campoNombre = new JTextField(10);
        panelNombre.add(campoNombre);
        add(panelNombre);
        
        JPanel panelApellido = new JPanel();
        panelApellido.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelApellido.add(new JLabel("Apellido:"));
        campoApellido = new JTextField(10);
        panelApellido.add(campoApellido);
        add(panelApellido);
        
        JPanel panelDireccion = new JPanel();
        panelDireccion.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelDireccion.add(new JLabel("Dirección:"));
        campoDireccion = new JTextField(10);
        panelDireccion.add(campoDireccion);
        add(panelDireccion);
        
        JPanel panelNumero = new JPanel();
        panelNumero.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelNumero.add(new JLabel("Numero:"));
        campoNumero = new JTextField(10);
        panelNumero.add(campoNumero);
        add(panelNumero);
        
       
        JPanel domicilioPanel = new JPanel();
        domicilioPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        domicilioCheck = new JCheckBox("Domicilio");
        domicilioPanel.add(domicilioCheck);
        //add(domicilioPanel);
        
        JPanel recogerPanel = new JPanel();
        recogerPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        recogerCheck = new JCheckBox("Recoger");
        recogerPanel.add(recogerCheck);
        //add(recogerPanel);
       
        
        JPanel localPanel = new JPanel();
        localPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        localCheck = new JCheckBox("Llevar");
        localPanel.add(localCheck);
        //add(localPanel);
        
        JPanel modalidadPedidoPanel = new JPanel();
        modalidadPedidoPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        modalidadPedidoPanel.add(domicilioPanel);
        modalidadPedidoPanel.add(recogerPanel);
        modalidadPedidoPanel.add(localPanel);
        add(modalidadPedidoPanel);

        
        JPanel pizzaPanel = new JPanel();
        pizzaPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        pizzaPanel.add(new JLabel("Selecciona la pizza"));
        pizzaSelect = new JComboBox<>(new String[]{"Carbonara", "Barbacoa", "Jamonaza", "Maestra", "Furiosa","4 quesos", "Formaggio"});
        pizzaPanel.add(pizzaSelect);
        add(pizzaPanel);
        
        JPanel tamañoPanel = new JPanel();
        tamañoPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        tamañoPanel.add(new JLabel("Selecciona tamaño"));
        tamañoSelect = new JComboBox<>(new String[]{"Familiar","Megamediana", "Mediana", "Individual"});
        tamañoPanel.add(tamañoSelect);
        add(tamañoPanel);
        
        botonAceptar = new JButton("Submit");
        botonAceptar.addActionListener(this);
        JPanel botonPanel = new JPanel();
        botonPanel.add(botonAceptar);
        add(botonPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        String direccion = campoDireccion.getText();        
        
        String tipoPedido = "No especificado";
        
        if (domicilioCheck.isSelected()) {
        	tipoPedido = "Domicilio";
        } else if (recogerCheck.isSelected()) {
        	tipoPedido = "Recoger";
        } else if (localCheck.isSelected()) {
        	tipoPedido = "Local";
        }
       

        
        String seleccionPizza = (String) pizzaSelect.getSelectedItem();
        String seleccionTamaño = (String) tamañoSelect.getSelectedItem();
        
        String precio = "No especificado";
        if (seleccionTamaño.equals("Familiar")) {
        	precio = "18,80";
        } else if (seleccionTamaño.equals("Megamediana")) {
        	precio = "15,50";
        } else if (seleccionTamaño.equals("Mediana")) {
        	precio = "11,00";
        	
        }else if (seleccionTamaño.equals("Individual")) {
        	precio = "6,00";
        }
        
        
       // String nombre, String apellido, String ciudad, String direccion, String tipoPedido, String pizza,
		//String tamaño, String precio)
        
        JOptionPane.showMessageDialog(this,
                "Nombre: " + nombre + "\nApellido: " + apellido + "\nCiudad: " + direccion +
                "\nTipo Pedido: " +tipoPedido +
                "\nSeleccion Pizza: " + seleccionPizza +
                "\nSeleccion Tamaño: " + seleccionTamaño+
                "\nPrecio: " + precio);
        //creamos el objeto pedido con los datos que hemos introducido atraves de la interfaz 
        Pedido pedido = new Pedido(nombre, apellido, direccion,tipoPedido , seleccionPizza,seleccionTamaño ,precio);
        
        //insertarFicheros();
        BaseDatos bd = new BaseDatos();
        bd.crearTabla();
        bd.insertarEnTabla(pedido);
               
    }

    

	

		

	private void insertarFicheros() {
		/**
		 * 
		 *te lo crea si no existe el fichero 
		if(!fichero.exists()) {
			try {
				
				fichero.createNewFile();
				
			} catch (IOException e) {
				e.printStackTrace();
				e.getMessage();

			}
			
		}
		*/		
	}

	public static void main(String[] args) {
        new Formulario();
    }
}
