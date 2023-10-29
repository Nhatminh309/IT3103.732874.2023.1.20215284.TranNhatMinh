import javax.swing.JOptionPane;  // Import thư viện để sử dụng JOptionPane

public class ChoosingOption_ver2 {
    public static void main(String[] args) {
        String[] options = { "I do", "I don't" };  // Mảng chứa hai tùy chọn

        // Hiển thị hộp thoại cho phép người dùng chọn một trong hai tùy chọn
        int option = JOptionPane.showOptionDialog(null,
                "Do you want to change to the first class ticket?",
                "Confirmation",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        // Dựa vào lựa chọn của người dùng, hiển thị thông báo tương ứng
        if (option == 0) {
            JOptionPane.showMessageDialog(null, "You've chosen: I do");
        } else if (option == 1) {
            JOptionPane.showMessageDialog(null, "You've chosen: I don't");
        }

        System.exit(0);  // Kết thúc chương trình
    }
}
