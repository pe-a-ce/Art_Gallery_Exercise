import java.util.UUID;

public class Artwork {

    private String title;
    private String artist;
    private double price;
    private String nft;

    public Artwork(String title,
                   String artist,
                   double price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = UUID.randomUUID().toString();
    }

    public String getNFT() {
        return this.nft;
    }

    public String getTitle() {
        return this.title;
    }

    public double getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return "Artwork{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", price=" + price +
                ", nft='" + nft + '\'' +
                '}';
    }
}
