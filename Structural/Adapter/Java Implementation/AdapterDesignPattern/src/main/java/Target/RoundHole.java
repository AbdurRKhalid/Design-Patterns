package Target;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg roundPeg) {
        boolean result;
        result = (this.getRadius() >= roundPeg.getRadius());
        return result;
    }
}
