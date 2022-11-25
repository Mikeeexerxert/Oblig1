package no.hvl.dat100;
import javax.swing.JOptionPane;
public class Oppgave4 {
    public static void main(String[] args) {
        double Income;
        double Tax = 0;
        Income = Double.parseDouble(String.valueOf(JOptionPane.showInputDialog("Give Me Money")));
        final double Step = 0;
        final double Step1 = 164101.00;
        final double Step2 = 230951.00;
        final double Step3 = 580651.00;
        final double Step4 = 934051.00;
        final double Percentage1 = 0.0093;
        final double Percentage2 = 0.0241;
        final double Percentage3 = 0.1152;
        final double Percentage4 = 0.1452;
        if (Income < Step1) {
            Tax = Step;
        }
        if (Income >= Step1 && Income < Step2) {
            Tax = Income * Percentage1;
        }
        if (Income >= Step2 && Income < Step3) {
            Tax = Income * Percentage2;
        }
        if (Income >= Step3 && Income < Step4) {
            Tax = Income * Percentage3;
        }if (Income >= Step4) {
            Tax = Income * Percentage4;
        }
        System.out.println("Tax for the income of" + Income + "kr");
        System.out.println((Step) + "%");
        System.out.println((Percentage1 * 100) + "%" + "or" + Tax + "kr");
        System.out.println((Percentage2 * 100) + "%" + "or" + Tax + "kr");
        System.out.println((Percentage3 * 100) + "%" + "or" + Tax + "kr");
        System.out.println((Percentage4 * 100) + "%" + "or" + Tax + "kr");
    }
}
