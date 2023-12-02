package Lab04.AimsProject;

package Lab04.AimsProject;

import Lab04.AimsProject.Media.Media;

import java.util.ArrayList;
import java.util.List;

// Store class to represent a media store
public class Store {
    // Attribute
    private List<Media> itemsInStore = new ArrayList<Media>(); // List to store available media items

    // Constructor
    public Store() {
        // Default constructor, no initialization needed for now
    }

    // Method to add a new media to the store
    public void addMedia(Media media) {
        if (itemsInStore.contains(media)) {
            System.out.println("Media is already in the list");
            return;
        }
        itemsInStore.add(media);
        System.out.println("Added");
    }

    // Method to remove a media from the store
    public void removeMedia(Media media) {
        // Search for media
        int indexOfRemoved = itemsInStore.indexOf(media);

        // If not found
        if (indexOfRemoved == -1) {
            System.out.println("Not found");
            return;
        }

        // Remove
        itemsInStore.remove(indexOfRemoved);

        // Notify
        System.out.println("Removed");
    }

    // Method to print all items in the store
    public void printStore() {
        System.out.println("***********************STORE**********************");
        System.out.println("Items in store:");
        for (Media media : itemsInStore) {
            media.print();
        }
        System.out.println("**************************************************");
    }

    // Method to search for media in the store by title.
    public Media searchByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.isMatch(title)) {
                return media;
            }
        }
        System.out.println("Not found!");
        return null;
    }

    // Getter and Setter for the list of items in the store
    public List<Media> getItemsInStore() {
        return itemsInStore;
    }

    public void setItemsInStore(List<Media> itemsInStore) {
        this.itemsInStore = itemsInStore;
    }
}
