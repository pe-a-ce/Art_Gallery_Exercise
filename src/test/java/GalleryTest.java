import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GalleryTest {

    private Gallery gallery;

    @BeforeEach
    void reset() {
        gallery = new Gallery("test_gallery", 100);
    }

    @Test
    void nothingToBeginWith() {
        assertEquals(0, gallery.getCollection().size());
    }

    @Test
    void addToCollection() {
        Artwork testArtwork = new Artwork("title", "artist", 10);
        gallery.addToCollection(testArtwork.getNFT(), testArtwork);
        assertEquals(1, gallery.getCollection().size());
    }

    @Test
    void setTill() {
        gallery.setTill(10);
        assertEquals(110, gallery.getTill());
    }

    @Test
    void stockTake() {
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

        assertEquals(150, gallery.stockTake());
    }
}