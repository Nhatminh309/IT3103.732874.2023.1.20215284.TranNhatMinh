import javax.swing.JOptionPane;  // Import thư viện để sử dụng JOptionPane

public class Calculate {
    public static void main(String[] args) {
        String strNum1, strNum2;  // Khai báo hai chuỗi để lưu dữ liệu đầu vào từ người dùng
        double sum, difference, product, quotient;  // Khai báo biến cho kết quả phép tính

        // Sử dụng JOptionPane để hiển thị hộp thoại yêu cầu người dùng nhập số đầu tiên
        strNum1 = JOptionPane.showInputDialog(null, 
            "Please input the first number:", "Input the first number",
            JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);  // Chuyển chuỗi nhập từ người dùng thành số

        // Sử dụng JOptionPane để hiển thị hộp thoại yêu cầu người dùng nhập số thứ hai
        strNum2 = JOptionPane.showInputDialog(null, 
            "Please input the second number:", "Input the second number",
            JOptionPane.INFORMATION_MESSAGE);
        
        double num2 = Double.parseDouble(strNum2);  // Chuyển chuỗi nhập từ người dùng thành số

        // Thực hiện các phép tính
        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        quotient = num1 / num2;

        // Hiển thị kết quả bằng cách sử dụng JOptionPane
        JOptionPane.showMessageDialog(null, "Sum: " + sum + " Difference: " 
                    + difference + " Product: " + product + " Quotient: " + quotient);
        
        System.exit(0);  // Kết thúc chương trình
    }
}
