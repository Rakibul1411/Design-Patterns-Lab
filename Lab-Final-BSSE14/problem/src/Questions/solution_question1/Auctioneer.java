package Questions.question1;

interface Auctioneer {
    void registerBidder(Bidder bidder);
    void removeBidder(Bidder bidder);
    void notifyBidders();
}
