package Questions.question1;

public class Main {
    public static void main(String[] args) {

        SubjectBidder auctioneer = new SubjectBidder("Type-1");

        Bidder bidder1 = new ObserverBidder("A");
        Bidder bidder2 = new ObserverBidder("B");


        auctioneer.registerBidder(bidder1);
        auctioneer.registerBidder(bidder2);


        auctioneer.acceptBid(bidder1, 100.0);
        auctioneer.acceptBid(bidder2, 150.0);
        auctioneer.acceptBid(bidder1, 200.0);

        auctioneer.removeBidder(bidder2);


    }
}
