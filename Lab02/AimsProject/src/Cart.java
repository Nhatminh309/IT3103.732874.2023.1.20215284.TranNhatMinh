public class Cart {
    // Số lượng tối đa các đơn đặt hàng trong giỏ hàng
    public static final int MAX_NUMBERS_ORDERS = 20;
    // Mảng lưu trữ các đĩa DVD trong giỏ hàng
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERS];
    // Biến đếm số lượng đơn đặt hàng hiện tại
    private int qtyOrdered = 0;

    // Thêm một đĩa DVD vào giỏ hàng.
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        // Kiểm tra xem giỏ hàng còn chỗ trống không.
        if (qtyOrdered < MAX_NUMBERS_ORDERS) {
            // Thêm đĩa DVD vào vị trí tiếp theo trong mảng.
            itemsOrdered[qtyOrdered] = disc;
            // Tăng số lượng đơn đặt hàng.
            qtyOrdered++;
            System.out.println("Added."); // In ra thông báo đã thêm đơn đặt hàng thành công.
        } else {
            System.out.println("The cart is full"); // In ra thông báo nếu giỏ hàng đã đầy.
        }
    }

    // Loại bỏ một đĩa DVD khỏi giỏ hàng.
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        // Duyệt qua mảng các đơn đặt hàng trong giỏ.
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                // Dịch chuyển các đơn đặt hàng còn lại sang bên trái để điền vào vị trí bị xóa.
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                // Đặt đơn đặt hàng cuối cùng trong mảng thành null.
                itemsOrdered[qtyOrdered - 1] = null;
                // Giảm số lượng đơn đặt hàng.
                qtyOrdered--;
                System.out.println("Removed."); // In ra thông báo đã xóa đơn đặt hàng thành công.
                return; // Thoát khỏi phương thức sau khi xóa đơn đặt hàng.
            }
        }
        System.out.println("The disc was not found"); // In ra thông báo nếu đơn đặt hàng không tồn tại trong giỏ.
    }

    // Phương thức tính tổng giá trị của các đơn đặt hàng trong giỏ.
    public float totalCost() {
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] != null) {
                // Lấy giá trị của từng đơn đặt hàng và cộng vào tổng giá trị.
                total += itemsOrdered[i].getCost();
            }
        }
        return total; // Trả về tổng giá trị.
    }
}
