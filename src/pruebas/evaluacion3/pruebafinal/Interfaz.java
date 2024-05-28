package pruebas.evaluacion3.pruebafinal;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import tareasFinales.ventasEntradas.VentaEntradasInicio;

public class Interfaz extends JFrame {
    private JComboBox<String> comboTipoEntrada;
    private JComboBox<String> comboTipoPrecio;
    private JCheckBox checkAbonado;
    private JTextField textPrecio;
    private JTextField textLocalidadesRestantes;
    
    private final int[] localidades = {200, 40, 400, 100};
    private final double[] preciosNormales = {25, 70, 20, 15.5};
    private final double[] preciosAbonados = {17.5, 40, 14, 10};
    private final String[] zonas = {"Principal", "Palco", "Central", "Lateral"};
    
    public void VentaEntradasInicio() {
        setTitle("Venta de Entradas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
        
        panel.add(new JLabel("Tipo de Entrada:"));
        comboTipoEntrada = new JComboBox<>(zonas);
        panel.add(comboTipoEntrada);
        
        panel.add(new JLabel("Tipo de Precio:"));
        comboTipoPrecio = new JComboBox<>(new String[]{"Normal", "Reducido"});
        panel.add(comboTipoPrecio);
        
        panel.add(new JLabel("Abonado:"));
        checkAbonado = new JCheckBox();
        panel.add(checkAbonado);
        
        panel.add(new JLabel("Precio:"));
        textPrecio = new JTextField();
        textPrecio.setEditable(false);
        panel.add(textPrecio);
        
        panel.add(new JLabel("Localidades Restantes:"));
        textLocalidadesRestantes = new JTextField();
        textLocalidadesRestantes.setEditable(false);
        panel.add(textLocalidadesRestantes);
        
        JButton calcularPrecioButton = new JButton("Calcular Precio");
        calcularPrecioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           	  calcularPrecio();
            	
            	
            	
               
            }
        });
        panel.add(calcularPrecioButton);
        
        JButton comprarButton = new JButton("Comprar");
        comprarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	comprarEntrada();  
            	
            }

			private void reducirEspacio(int[] localidades) {
				
				
					
				
			}
        });
        panel.add(comprarButton);
        
        add(panel);
        
    }
    
    

    
    private void  calcularPrecio() {
    	  int tipoEntrada = comboTipoEntrada.getSelectedIndex();
          String tipoPrecio = (String) comboTipoPrecio.getSelectedItem();
          boolean abonado = checkAbonado.isSelected();   
          String  precio = textPrecio.getText();	
          
          if(tipoPrecio.equals("Normal") && abonado==false) {
        	    textPrecio.setText(String.valueOf(preciosNormales[tipoEntrada]));
        	    
        	    
          }else  if(tipoPrecio.equals("Reducido") && abonado==true) {
        	  double precioReducido = preciosAbonados[tipoEntrada] - ((preciosAbonados[tipoEntrada] * 20) / 100);
        	  textPrecio.setText(String.valueOf(precioReducido));

          }else  if(tipoPrecio.equals("Normal") && abonado==false) {
    	    textPrecio.setText(String.valueOf(preciosNormales[tipoEntrada]));;

          }else  if(tipoPrecio.equals("Reducido") && abonado==true) {
    	  double precioReducido = preciosAbonados[tipoEntrada] - ((preciosAbonados[tipoEntrada] * 20) / 100);
    	  	textPrecio.setText(String.valueOf(precioReducido));

    }
          
          
    	
    	
     
    }
    
    private void comprarEntrada() {
    	  int tipoEntrada = comboTipoEntrada.getSelectedIndex();
          String tipoPrecio = (String) comboTipoPrecio.getSelectedItem();
          boolean abonado = checkAbonado.isSelected();   
          String  precio = textPrecio.getText();	
          
          if(tipoPrecio.equals("Normal") && abonado==false) {
        	    textPrecio.setText(String.valueOf(preciosNormales[tipoEntrada]));
        	    textLocalidadesRestantes.setText(String.valueOf(actualizarLocalidades(tipoEntrada)));
        	    
        	    
          }else  if(tipoPrecio.equals("Reducido") && abonado==true) {
        	  double precioReducido = preciosAbonados[tipoEntrada] - ((preciosAbonados[tipoEntrada] * 20) / 100);
        	  textPrecio.setText(String.valueOf(precioReducido));
      	    textLocalidadesRestantes.setText(String.valueOf(actualizarLocalidades(tipoEntrada)));


          }else  if(tipoPrecio.equals("Normal") && abonado==false) {
    	    textPrecio.setText(String.valueOf(preciosNormales[tipoEntrada]));;
    	    textLocalidadesRestantes.setText(String.valueOf(actualizarLocalidades(tipoEntrada)));

          }else  if(tipoPrecio.equals("Reducido") && abonado==true) {
    	  double precioReducido = preciosAbonados[tipoEntrada] - ((preciosAbonados[tipoEntrada] * 20) / 100);
    	  	textPrecio.setText(String.valueOf(precioReducido));
  	    	textLocalidadesRestantes.setText(String.valueOf(actualizarLocalidades(tipoEntrada)));

    }
       
    }
    
    private int actualizarLocalidades(int tipoEntrada) {
    		return localidades[tipoEntrada]--;

    		
      
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentaEntradasInicio().setVisible(true);
            }
        });
    }
}
