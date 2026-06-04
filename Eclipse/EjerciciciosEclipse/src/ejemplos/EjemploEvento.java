package ejemplos;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploEvento {

	public static void main(String[] args) {
		Frame ventana = new Frame();
		ventana.setSize(300, 150);
		ventana.setLayout(new FlowLayout());
		
		Button miBoton = new Button("Click aquí");
		
		ventana.add(miBoton);
		
		miBoton.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Botón pulsado!");
				
			}
		});
		
		ventana.setVisible(true);
		
	}

}