package solutions.codes.roundHole;

public class Main {
    public static void main(String[] args) {
        // Create a round hole with a radius of 5
        RoundHole hole = new RoundHole(5);

        // Create a round peg with a radius of 5
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println("Round peg fits in hole: " + hole.fits(roundPeg)); // true

        // Create square pegs with widths of 5 and 10
        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);

        // Attempting to fit square pegs directly would fail
        // System.out.println(hole.fits(smallSquarePeg)); // This won't compile

        // Use adapters to fit square pegs into the round hole
        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        System.out.println("Small square peg adapter fits in hole: " + hole.fits(smallSquarePegAdapter)); // true
        System.out.println("Large square peg adapter fits in hole: " + hole.fits(largeSquarePegAdapter)); // false
    }
}
