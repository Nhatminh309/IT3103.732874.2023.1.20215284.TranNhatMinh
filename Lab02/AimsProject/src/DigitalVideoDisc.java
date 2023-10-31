public class DigitalVideoDisc {
    // Các trường dữ liệu riêng tư để lưu trữ thông tin về DVD.
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Các phương thức getter cho từng trường dữ liệu để lấy giá trị của chúng.

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    // Constructors để khởi tạo đối tượng DVD với các thông tin khác nhau.

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String category, String title, float cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

}
