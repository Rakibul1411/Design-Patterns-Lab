package Questions.question1;


interface Bidder {
    void update(String product, double newBid, String highestBidder);
    String getBidderName();
}

