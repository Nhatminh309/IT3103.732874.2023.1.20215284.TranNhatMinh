package Lab04.AimsProject.Media;

// Disc class inherits from Media class
public class Disc extends Media {
    // Attributes
    private String director; // Stores the director of the disc
    private int length;      // Stores the length of the disc

    // Constructors
    // Default constructor
    public Disc(int id, String title) {
        super(id, title); // Call to the superclass constructor
    }

    // Parameterized constructor
    public Disc(int id, String title, String category, float cost, String director, int length) {
        super(id, title, category, cost); // Call to the superclass constructor
        this.director = director; // Initialize the director attribute
        this.length = length;     // Initialize the length attribute
    }

    // Getter and Setter for the director attribute
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // Getter and Setter for the length attribute
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
