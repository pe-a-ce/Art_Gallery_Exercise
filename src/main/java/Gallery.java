import java.util.HashMap;

public class Gallery {

    private String name;
    private double till;
    private HashMap<String, Artwork> collection;

    public Gallery(String name,
                   double till) {
        this.name = name;
        this.till = till;
        this.collection = new HashMap<>();
    }

    public void addToCollection(String nft, Artwork artwork) {
        this.collection.put(nft, artwork);
    }

    public Artwork removeFromCollection(String nft){
        return collection.remove(nft);
    }

    public HashMap<String, Artwork> getCollection() {
        return this.collection;
    }

    public void setTill(double payment) {
        this.till = this.till + payment;
    }

    public double getTill() {
        return this.till;
    }

    public double stockTake() {
        double sum = 0;
        for (Artwork art: collection.values()) {
            sum += art.getPrice();
        }
        return sum;
    }
}
