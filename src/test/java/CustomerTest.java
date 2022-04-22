import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private Customer customer;

    @BeforeEach
    void reset() {
        customer = new Customer("customer", 100);
    }

    @Test
    void setWallet() {
        customer.setWallet(10);
        assertEquals(90, customer.getWallet());
    }

    @Test
    void getWallet() {
        assertEquals(100, customer.getWallet());
    }
}