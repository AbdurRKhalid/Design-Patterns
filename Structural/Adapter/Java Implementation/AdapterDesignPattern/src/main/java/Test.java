import Adapte.SquarePeg;
import Adapter.SquarePegAdapter;
import Target.RoundHole;
import Target.RoundPeg;

public class Test {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        if (roundHole.fits(roundPeg)){
            System.out.println("The Round Peg Fits Perfectly in the Round Hole!");
        }

        SquarePeg small = new SquarePeg(2);
        SquarePeg large = new SquarePeg(20);

        SquarePegAdapter smallSquareAdapter = new SquarePegAdapter(small);
        SquarePegAdapter largeSquareAdapter = new SquarePegAdapter(large);

        if (roundHole.fits(smallSquareAdapter)){
            System.out.println("The Small Square Peg Adapter Fits in the Round Hole!");
        }

        if (!roundHole.fits(largeSquareAdapter)){
            System.out.println("The Large Square Peg Adapter Does not Fit in the Round Hole!");
        }
    }
}
