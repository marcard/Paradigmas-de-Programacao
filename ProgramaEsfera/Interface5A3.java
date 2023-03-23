import javax.swing.*;
public class Interface5A3 {
    public Interface5A3(){}

    public double leRaio(){
        String entrada;
        entrada = JOptionPane.showInputDialog("Coloque o valor de raio");
        double r = Double.parseDouble(entrada);
        return r;
    }

    public void imprimeVolume(double volume){
        System.out.println("Valor Volume = " + volume);
    }
}
