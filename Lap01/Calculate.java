import javax.swing.JOptionPane;
public class Calculate {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double  sum, difference, product, quotient;


        strNum1 = JOptionPane.showInputDialog(null, 
            "Please input the first number:","Input the first number",
            JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, 
            "Please input the second number:","Input the second number",
            JOptionPane.INFORMATION_MESSAGE);
        
        double num2 = Double.parseDouble(strNum2);

        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        quotient = num1 / num2;

        JOptionPane.showMessageDialog(null, "Sum: " + sum +  " Difference: " 
                    + difference + " Product: " + product + " Quotient" + quotient);
        
        System.exit(0);

    }
}
