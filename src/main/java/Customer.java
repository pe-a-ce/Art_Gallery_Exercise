import java.util.HashMap;

public class Customer {

    private String name;
    private double wallet;
    private HashMap<String, Artwork> collection;

    public Customer(String name,
                    double wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public void setWallet(double payment) {
        this.wallet = this.wallet - payment;
    }

    public double getWallet(){
        return this.wallet;
    }

}
