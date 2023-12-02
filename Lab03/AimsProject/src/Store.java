public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int itemCount;

    public Store(int maxSize) {
        itemsInStore = new DigitalVideoDisc[maxSize];
        itemCount = 0;
    }

    // Add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        if (itemCount < itemsInStore.length) {
            itemsInStore[itemCount] = dvd;
            itemCount++;
            System.out.println("Added DVD to the store: " + dvd.getTitle());
        } else {
            System.out.println("The store is full. Cannot add more DVDs.");
        }
    }

    // Remove a DVD from the store
    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < itemCount; i++) {
            if (itemsInStore[i] == dvd) {
                // Shift remaining DVDs to fill the gap
                for (int j = i; j < itemCount - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[itemCount - 1] = null; // Set the last element to null
                itemCount--;
                System.out.println("Removed DVD from the store: " + dvd.getTitle());
                return;
            }
        }
        System.out.println("DVD not found in the store: " + dvd.getTitle());
    }
}
