package condExtraHours;

import javax.swing.JOptionPane;

public class ExtraHours {

	public static void main(String[] args) {
		
		int horas, semanal, extrahoras;
		
		horas = Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad de horas"));
		
		if(horas<=40) {
			
			semanal = horas * 16;
			JOptionPane.showConfirmDialog(null,"El salario semanal es: " + semanal);
		}
		else if(horas>40) {
			extrahoras=horas-40;
			semanal=(40*16)+(extrahoras*20);
			JOptionPane.showConfirmDialog(null, "El salario semanal con horas extras es: "+semanal);
			
		}
		else {
			JOptionPane.showConfirmDialog(null, "Ingresa una candidad mayor a cero");
		}
		

	}

}
