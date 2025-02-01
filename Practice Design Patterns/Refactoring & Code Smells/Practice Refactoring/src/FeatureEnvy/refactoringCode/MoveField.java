package FeatureEnvy.refactoringCode;

public class MoveField {
    public class Customer {
        private int rewardPoints;

        public int getRewardPoints() {
            return rewardPoints;
        }

        public void addRewardPoints(int points) {
            rewardPoints += points;
        }
    }

    public class LoyaltyProgram {
        public void manageRewards(Customer customer, int points) {
            customer.addRewardPoints(points);
        }
    }
}
