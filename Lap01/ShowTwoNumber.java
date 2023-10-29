import javax.swing.JOptionPane;  // Import thư viện để sử dụng JOptionPane

public class ShowTwoNumber {
    public static void main(String[] args) {
        String strNum1, strNum2;  // Khai báo hai chuỗi để lưu số nhập từ người dùng
        String strNotification = "You've just entered:";  // Chuỗi thông báo ban đầu

        // Yêu cầu người dùng nhập số đầu tiên và lưu vào strNum1
        strNum1 = JOptionPane.showInputDialog(null, 
            "Please input the first number:", "Input the first number",
            JOptionPane.INFORMATION_MESSAGE);

        strNotification += strNum1 + " and ";  // Cập nhật thông báo với số đầu tiên

        // Yêu cầu người dùng nhập số thứ hai và lưu vào strNum2
        strNum2 = JOptionPane.showInputDialog(null, 
            "Please input the second number:", "Input the second number",
            JOptionPane.INFORMATION_MESSAGE);

        strNotification += strNum2;  // Cập nhật thông báo với số thứ hai

        // Hiển thị thông báo chứa hai số đã nhập
        JOptionPane.showMessageDialog(null, strNotification, 
                    "Show two numbers", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);  // Kết thúc chương trình
    }
}
