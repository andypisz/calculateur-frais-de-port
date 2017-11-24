package main;

public class SmallPackage extends Package {
    public SmallPackage(int height, int width, int depth, double weight) {
        super(height, width, depth, weight);
    }

    @Override
    public double calculateLocalShippingCost() {
        return 12.00;
    }
}
