package main;

public class Package {

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

    //Retourne les frais de port en France
    public double calculateLocalShippingCost() {
        if ((this.height <= 229) && (this.width <= 162) && (this.depth < 25)) {
            return 12.00;
        } else if (this.weight <= 1.800) {
            return 17.59 * this.weight + 2.86;
        } else {
            return Math.max(21.62 * this.weight, 1.43 * this.height * this.width * this.depth * Math.pow(10, -6));
        }
    }

    public double calculateMonacoShippingCost(){
        return calculateLocalShippingCost()*1.087;
    }

}
