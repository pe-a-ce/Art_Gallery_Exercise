
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


//        System.out.println(gallery.getCollection().values().toString());

        purchase(gallery, customer1, artwork1);

        System.out.println(customer1.getWallet());
        System.out.println(gallery.getTill());


    }

    public static void purchase(Gallery gallery, Customer customer, Artwork artwork){
        customer.setWallet(artwork.getPrice());
        gallery.setTill(artwork.getPrice());



    }

}
