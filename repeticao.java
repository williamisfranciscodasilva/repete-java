package repete;

import javax.swing.JOptionPane;

public class repeticao {
	
	public void repetir() {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		while(num <10) {
			num++;
			if(num == 3 || num == 6 || num ==9) {
				continue;
			}
			if(num == 5) {
				break;
			}
			JOptionPane.showMessageDialog(null, "aguarde "+num);
			System.out.println("aguarde "+num);
			
		}
		JOptionPane.showMessageDialog(null, "Até que enfim!");
		System.out.println("Até que enfim!");
		
	}

}
