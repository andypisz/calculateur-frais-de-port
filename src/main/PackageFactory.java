package main;

public class PackageFactory {

    public static Package createPackage(int height, int width, int depth, double weight){
        if ((height <= 229) && (width <= 162) && (depth < 25)) {
            return new SmallPackage(height,width,depth,weight);
        } else if (weight <= 1.800) {
            return new MediumPackage(height,width,depth,weight);

        } else {
            return new BigPackage(height,width,depth,weight);
        }
    }
}
