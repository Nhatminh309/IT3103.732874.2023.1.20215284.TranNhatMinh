package Lab04.AimsProject;

import Lab04.AimsProject.Media.DigitalVideoDisc;
import Lab04.AimsProject.Media.Media;
import java.util.ArrayList;
import java.util.List;

// Cart class to represent a shopping cart of media items
public class Cart {
    // Attributes
    private List<Media> itemsOrdered = new ArrayList<Media>(); // List to store ordered media items
    private int numOfDVDs; // Count of DVDs in the cart

    // Constructor
    public Cart() {
        numOfDVDs = 0; // Initialize the count of DVDs to zero
    }

    // Method to add a new media to the cart
    public void addMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            System.out.println("Media is already in the list");
            return;
        }
        itemsOrdered.add(media);
        if (media.getClass() == DigitalVideoDisc.class) {
            numOfDVDs++; // Increment the count of DVDs if the added media is a DVD
        }
        System.out.println("Added");
    }

    // Method to remove a media from the cart
    public void removeMedia(Media media) {
        // Search for media
        int indexOfRemoved = itemsOrdered.indexOf(media);

        // If not found
        if (indexOfRemoved == -1) {
            System.out.println("Not found");
            return;
        }

        // Remove
        itemsOrdered.remove(indexOfRemoved);
        if (media.getClass() == DigitalVideoDisc.class) {
            numOfDVDs--; // Decrement the count of DVDs if the removed media is a DVD
        }

        // Notify
        System.out.println("Removed");
    }

    // Method to calculate the total cost of all items in the cart
    public double totalCost() {
        float cost = 0;
        for (Media media : itemsOrdered) {
            cost += media.getCost();
        }

        return Math.round(cost * 100.0) / 100.0;
    }

    // Method to print the list of ordered items, the price of each item, and the total price
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (Media media : itemsOrdered) {
            media.print();
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("**************************************************");
    }

    // Method to search for media in the cart by ID and display the search results.
    public Media searchByID(int id) {
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                return media;
            }
        }
        System.out.println("Not found!");
        return null;
    }

    // Method to search for media in the cart by title.
    public Media searchByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.isMatch(title)) {
                return media;
            }
        }
        System.out.println("Not found!");
        return null;
    }

    // Method to sort the cart by title and print
    public void sortByTitle() {
        itemsOrdered.sort(Media.COMPARE_BY_TITLE);
        printCart();
    }

    // Method to sort the cart by cost and print
    public void sortByCost() {
        itemsOrdered.sort(Media.COMPARE_BY_COST);
        printCart();
    }

    // Getter and Setter for the count of DVDs
    public int getNumOfDVDs() {
        return numOfDVDs;
    }

    public void setNumOfDVDs(int numOfDVDs) {
        this.numOfDVDs = numOfDVDs;
    }
}
