import javax.swing.JOptionPane;  // Import thư viện để sử dụng JOptionPane

public class HelloNameDialog {
    public static void main(String[] args) {
        String result;  // Khai báo biến result để lưu tên người dùng

        // Hiển thị hộp thoại yêu cầu người dùng nhập tên và lưu vào biến result
        result = JOptionPane.showInputDialog("Tran Nhat Minh 2003 - Please enter your name: ");

        // Hiển thị lời chào với tên người dùng
        JOptionPane.showMessageDialog(null, "Toi la Tran Nhat Minh. Hi " + result + "!");
    }
}
