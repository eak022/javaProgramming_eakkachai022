import javax.swing.JOptionPane;

public class Doraemon {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Doraemon : Hello who are you");
        JOptionPane.showMessageDialog(null, "Me : Hello, my name is" + name);
        JOptionPane.showMessageDialog(null, "Doraemon : oh! hi," + name);
        JOptionPane.showMessageDialog(null, "Doraemon : What can I do for you?");
        JOptionPane.showMessageDialog(null, name + " : I want to go to the future.");
        JOptionPane.showMessageDialog(null, "Doraemon : of conre, what is the present year?");
        String now = JOptionPane.showInputDialog(null, name + " : It is ... ");
        JOptionPane.showMessageDialog(null, "Doraemon : ok. How many years do you want to travel?");
        String year = JOptionPane.showInputDialog(null, name + " : I want to go for...");
        JOptionPane.showMessageDialog(null, "Doraemon : ok. Lets goooo!");
        JOptionPane.showMessageDialog(null, "link start!!");
        int futureyear = Integer.parseInt(now) + Integer.parseInt(year);
        JOptionPane.showMessageDialog(null, "Doraemon : Hello, welcome to" + futureyear);
    }
}