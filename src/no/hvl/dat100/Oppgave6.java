package no.hvl.dat100;
import javax.swing.JOptionPane;
public class Oppgave6 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter Numer"));
        int s = 1;
        for (int d = a; d > 0; d--) {
            s = s * d;
        }
        System.out.println("Faculty" + s + "Number");
    }
}
