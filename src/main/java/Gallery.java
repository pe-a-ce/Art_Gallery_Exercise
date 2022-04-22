import java.util.HashMap;

public class Gallery {

    private String name;
    private double till;
    private HashMap<String, Artwork> collection;

    public Gallery(String name,
                   double till) {
        this.name = name;
        this.till = till;

    }

    public void addToCollection(String nft, Artwork artwork) {
        this.collection.put(nft, artwork);
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



        return 0.0;
    }
}
