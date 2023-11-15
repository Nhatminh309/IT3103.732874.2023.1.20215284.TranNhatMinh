public class DigitalVideoDisc {
    // Thuộc tính lớp để theo dõi số lượng DVD được tạo
    private static int nbDigitalVideoDiscs = 0;

    // Thuộc tính phiên bản cho id DVD
    private int id;
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

    public void setTitle(String newTitle) {
        this.title = newTitle;
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
        this.id = ++nbDigitalVideoDiscs;
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.id = ++nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.id = ++nbDigitalVideoDiscs;
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.id = ++nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for nbDigitalVideoDiscs
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
    // isMatch
    public boolean isMatch(String titleToMatch) {
        // So sánh không phân biệt chữ hoa và chữ thường
        return this.title != null && this.title.toLowerCase().contains(titleToMatch.toLowerCase());
    }
    
}
