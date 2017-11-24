package main;

public abstract class Package {

    private int height;
    private int width;
    private int depth;
    private double weight;


    public Package(int height, int width, int depth, double weight) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public double getWeight() {
        return weight;
    }

    //Retourne les frais de port en France
    public abstract double calculateLocalShippingCost();

    public double calculateMonacoShippingCost(){
        return calculateLocalShippingCost()*1.087;
    }

    public double calculateDomShippingCost(){
        return calculateLocalShippingCost()*1.054+1.26;
    }

}
