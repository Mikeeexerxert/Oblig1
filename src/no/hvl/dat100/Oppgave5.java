package no.hvl.dat100;
import javax.swing.JOptionPane;
public class Oppgave5 {
    public static void main(String[] args) {
        int Points = 0;
        for (int a = 1; a <= 10; a ++) {
            Points = Integer.parseInt(String.valueOf(JOptionPane.showInputDialog("Points")));
            if (Points > 100 || Points < 0) {
                JOptionPane.showMessageDialog(null, "Don't Joke");
                a --;
            }
            else if (Points <= 39) {
                String Grade = "F";
                System.out.println("Grade" + Grade);
            }
            else if (Points >= 40 && Points < 50) {
                String Grade = "E";
                System.out.println("Grade" + Grade);
            }
            else if (Points >= 50 && Points < 60) {
                String Grade = "D";
                System.out.println("Grade" + Grade);
            }
            else if (Points >= 60 && Points < 80) {
                String Grade = "C";
                System.out.println("Grade" + Grade);
            }
            else if (Points >= 80 && Points < 90) {
                String Grade = "B";
                System.out.println("Grade" + Grade);
            }
            else if (Points >= 90) {
                String Grade = "A";
                System.out.println("Grade" + Grade);
            }
        }
    }
}
