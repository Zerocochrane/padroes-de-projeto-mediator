import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuctionTest {

    @BeforeEach
    public void startAuction(){

    }

    @Test
    public void runAuction(){
        AuctionMediator med = new AuctionMediator();
        Buyer b1 = new AuctionBuyer(med, "Tal Baum");
        Buyer b2 = new AuctionBuyer(med, "Elad Shamailov");
        Buyer b3 = new AuctionBuyer(med, "John Smith");

        med.addBuyer(b1);
        med.addBuyer(b2);
        med.addBuyer(b3);

        b1.bid(1800);
        b2.bid(2000);
        b3.bid(780);

        assertEquals("The auction winner is Elad Shamailov. He paid 2000$ for the item.", med.findHighestBidder());
    }


}