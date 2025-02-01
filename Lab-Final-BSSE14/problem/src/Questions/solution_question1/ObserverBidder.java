package Questions.question1;

class ObserverBidder implements Bidder {
    private final String name;

    public ObserverBidder(String name) {
        this.name = name;
    }

    @Override
    public void update(String product, double newBid, String highestBidder) {
        System.out.println(name + " received update: " + highestBidder + " placed a new bid of $" + newBid + " for " + product);
    }

    @Override
    public String getBidderName() {
        return name;
    }
}
