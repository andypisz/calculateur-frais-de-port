package main;

public class MediumPackage extends Package {
    public MediumPackage(int height, int width, int depth, double weight) {
        super(height, width, depth, weight);
    }

    @Override
    public double calculateLocalShippingCost() {
        return 17.59 * this.getWeight() + 2.86;
    }
}
