
public class Main {

    /*
 + ----------------------- +
         |        Book            |
            + ------------------------+
            |      - - name: String   |
            |  - author: String       |
            |      - pages: int       |
            |      - inStock: int     |
            |      - price: double    |
            + ----------------------- +
            | + to String(): String   |
            | + isInStock(): boolean  |
            | + getName(): String     |
            | + getAuthor(): String   |
            | + getPages(): int       |
            | + getPrice(): double    |
            + ----------------------- +

    */

    public static void main(String[] args) {

        Gallery gallery = new Gallery("Gallery", 100.00);

        Artwork artwork1 = new Artwork("Art1", "Artist1", 20.00);
        Artwork artwork2 = new Artwork("Art2", "Artist2", 10.00);
        Artwork artwork3 = new Artwork("Art3", "Artist3", 30.00);
        Artwork artwork4 = new Artwork("Art4", "Artist4", 40.00);
        Artwork artwork5 = new Artwork("Art5", "Artist5", 50.00);
        gallery.addToCollection(artwork1.getNFT(), artwork1);
        gallery.addToCollection(artwork2.getNFT(), artwork2);
        gallery.addToCollection(artwork3.getNFT(), artwork3);
        gallery.addToCollection(artwork4.getNFT(), artwork4);
        gallery.addToCollection(artwork5.getNFT(), artwork5);

        Customer customer1 = new Customer("Customer1", 60.00);

        System.out.println("Gallery collection pre purchase: " + gallery.getCollection().values());
        System.out.println("Customer collection pre purchase: " + customer1.getCollection().values());
        System.out.println("Stock value before purchase: " + gallery.stockTake());

        System.out.println("Purchase made.");
        purchase(gallery, customer1, artwork1);

        System.out.println("Current gallery stock value: " + gallery.stockTake());
        System.out.println("Customer wallet: " + customer1.getWallet());
        System.out.println("Gallery till: " + gallery.getTill());

        System.out.println("Gallery collection post purchase: " + gallery.getCollection().values());
        System.out.println("Customer collection post purchase: " + customer1.getCollection().values());

        purchase(gallery, customer1, artwork1);
        purchase(gallery, customer1, artwork2);
        System.out.println("Customer collection post purchase: " + customer1.getCollection().values());
    }

    public static void purchase(Gallery gallery, Customer customer, Artwork artwork){
        if (gallery.getCollection().containsKey(artwork.getNFT())) {
            customer.setWallet(artwork.getPrice());
            gallery.setTill(artwork.getPrice());
            Artwork artworkPurchased = gallery.removeFromCollection(artwork.getNFT());
            customer.addToCollection(artwork.getNFT(), artwork);
        }
        else {
            System.out.println("No such artwork inside gallery's collection.");
        }
    }

}
