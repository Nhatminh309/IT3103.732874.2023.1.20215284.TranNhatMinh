public class StoreTest {
    public static void main(String[] args) {
        // Create a store with a maximum capacity of 5 DVDs
        Store store = new Store(5);

        // Create DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.97f);

        // Add DVDs to the store
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Test the removeDVD method
        store.removeDVD(dvd2);
        store.removeDVD(new DigitalVideoDisc("HelloWord", "Java", 0f)); // Try to remove a non-existent DVD
    }
}
