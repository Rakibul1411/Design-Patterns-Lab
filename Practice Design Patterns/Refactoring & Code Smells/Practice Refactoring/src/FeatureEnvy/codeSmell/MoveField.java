package FeatureEnvy.codeSmell;

public class MoveField {
    public class LoyaltyProgram {
        public int _rewardPoints;
        public int getRewardPoints() {
            return _rewardPoints;
        }

        public void setRewardPoints(int points) {
            _rewardPoints = points;
        }
    }

    public class Customer {
        private LoyaltyProgram loyaltyProgram;

        public Customer(LoyaltyProgram loyaltyProgram) {
            this.loyaltyProgram = loyaltyProgram;
        }

        public void addRewardPoints(int points) {
            loyaltyProgram._rewardPoints += points; // Accessing LoyaltyProgram's field directly
        }
    }
}
