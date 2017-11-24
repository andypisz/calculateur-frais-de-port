package main;

public class BigPackage extends Package{
    public BigPackage(int height, int width, int depth, double weight) {
        super(height, width, depth, weight);
    }

    @Override
    public double calculateLocalShippingCost() {
        return Math.max(21.62 * this.getWeight(), 1.43 * this.getHeight() * this.getWidth() * this.getDepth() * Math.pow(10, -6));
    }
}
