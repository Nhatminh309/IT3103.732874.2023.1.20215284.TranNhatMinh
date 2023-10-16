// Example 3: HelloNameDialog.java
import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Tran Nhat Minh 2003 - Please enter your name: ");
        JOptionPane.showMessageDialog(null, "Toi la Tran Nhat Minh. Hi " + result + "!");
    }
}


