package Lab04.AimsProject.Media;

// Track class implements the Playable interface
public class Track implements Playable {
    // Attributes
    private String title; // Stores the title of the track
    private int length;   // Stores the length of the track

    // Constructor
    public Track(String title, int length) {
        this.title = title; // Initialize the title attribute
        this.length = length; // Initialize the length attribute
    }

    // Method to play a track
    public void play() {
        System.out.println("Playing track: " + title);
        System.out.println("Track length : " + length);
    }

    // Override equals method to compare Track objects based on title and length
    @Override
    public boolean equals(Object o) {
        if (o instanceof Track track) {
            return title.equals(track.getTitle()) && length == track.getLength();
        }
        return false;
    }

    // Getter and Setter for the title attribute
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for the length attribute
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
