import javax.swing.*;

public class InterfacePonto {

	public double pegaValor (String mensagem) {
		String entrada;
		
		entrada = JOptionPane.showInputDialog (mensagem);
		double r = Double.parseDouble(entrada);
		return r;
	}

	public void mostreDistancia (double vDist) {
		System.out.println ("Distancia = " + vDist);
	}
}



