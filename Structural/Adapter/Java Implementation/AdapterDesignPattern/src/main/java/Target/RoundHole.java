package Target;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public boolean fits(RoungPeg roungPeg) {
        boolean result;
        result = (this.getRadius() >= roungPeg.getRadius());
        return result;
    }
}
