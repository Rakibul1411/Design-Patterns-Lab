package Questions.question1;
import java.util.ArrayList;
import java.util.List;

class SubjectBidder implements Auctioneer {
    private final List<Bidder> bidders = new ArrayList<>();
    private final String product;
    private double currentBid;
    private String highestBidder;

    public SubjectBidder(String product) {
        this.product = product;
    }

    @Override
    public void registerBidder(Bidder bidder) {
        bidders.add(bidder);
        System.out.println(bidder.getBidderName() + " registered for bidding on " + product);
    }

    @Override
    public void removeBidder(Bidder bidder) {
        bidders.remove(bidder);
        System.out.println(bidder.getBidderName() + " left the auction for " + product);
    }

    @Override
    public void notifyBidders() {
        System.out.println("\n New Bid Update: " + highestBidder + " placed a bid of $" + currentBid);
        for (Bidder bidder : bidders) {
            bidder.update(product, currentBid, highestBidder);
        }
    }

    public void acceptBid(Bidder bidder, double newBid) {
        if (newBid > currentBid) {
            currentBid = newBid;
            highestBidder = bidder.getBidderName();
            notifyBidders();
        } else {
            System.out.println(bidder.getBidderName() + " attempted a bid of $" + newBid + " but was too low!");
        }
    }
}