import javax.swing.JOptionPane;

public class ChoosingOption_ver2 {
    public static void main(String[] args) {
        String[] options = { "I do", "I don't" };

        int option = JOptionPane.showOptionDialog(null,
                "Do you want to change to the first class ticket?",
                "Confirmation",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (option == 0) {
            JOptionPane.showMessageDialog(null, "You've chosen: I do");
        } else if (option == 1) {
            JOptionPane.showMessageDialog(null, "You've chosen: I don't");
        }
        System.exit(0);
    }
}

