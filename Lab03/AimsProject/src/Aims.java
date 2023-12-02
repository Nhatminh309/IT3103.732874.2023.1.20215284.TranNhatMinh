public class Aims {
    public static void main(String[] args) {
        // Tạo một đối tượng Cart có thể lưu trữ các đĩa DVD.
        Cart anOrder = new Cart();

        // Tạo một đối tượng DVD đầu tiên với thông tin: tiêu đề, thể loại, đạo diễn, độ dài và giá.
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        // Thêm đĩa DVD này vào giỏ hàng.
        anOrder.addDigitalVideoDisc(dvd1);

        // Tạo một đối tượng DVD thứ hai với thông tin: tiêu đề, thể loại, đạo diễn, độ dài và giá.
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        // Thêm đĩa DVD này vào giỏ hàng.
        anOrder.addDigitalVideoDisc(dvd2);

        // Tạo một đối tượng DVD thứ ba với thông tin: tiêu đề, thể loại và giá. (Không có thông tin về đạo diễn và độ dài)
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        // Thêm đĩa DVD này vào giỏ hàng.
        anOrder.addDigitalVideoDisc(dvd3);

        // In ra tổng chi phí của các đĩa DVD trong giỏ hàng.
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        // In ra thông báo và cố gắng loại bỏ đĩa DVD dvd1 từ giỏ hàng hai lần.
        System.out.println("Remove dvd1");
        anOrder.removeDigitalVideoDisc(dvd1);
        anOrder.removeDigitalVideoDisc(dvd1);
    }
}
