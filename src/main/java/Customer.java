import java.util.HashMap;

public class Customer {

    private String name;
    private double wallet;
    private HashMap<String, Artwork> collection;

    public Customer(String name,
                    double wallet) {
        this.name = name;
        this.wallet = wallet;
        this.collection = new HashMap<>();
    }

    public void setWallet(double payment) {
        this.wallet = this.wallet - payment;
    }

    public double getWallet(){
        return this.wallet;
    }

    public void addToCollection(String nft, Artwork artwork){
        this.collection.put(nft, artwork);
    }

    public HashMap<String, Artwork> getCollection() {
        return this.collection;
    }

}
