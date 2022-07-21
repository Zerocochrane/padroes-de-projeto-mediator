import java.util.ArrayList;

public class AuctionMediator implements Mediator {

    private ArrayList<Buyer> buyers;

    public AuctionMediator(){
        buyers = new ArrayList<Buyer>();
    }

    @Override
    public void addBuyer(Buyer buyer){
        buyers.add(buyer);
    }

    @Override
    public String findHighestBidder(){
        int maxBid = 0;
        Buyer winner = null;
        for (Buyer b : buyers) {
            if (b.price > maxBid) {
                maxBid = b.price;
                winner = b;
            }
        }
        return "The auction winner is " + winner.name + ". He paid " + winner.price + "$ for the item.";
    }
}