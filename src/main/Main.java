package main;

public class Main {


    public static void main(String[] args){
        Package monPackage = PackageFactory.createPackage(230,162,25,1801);
        System.out.println(monPackage.calculateLocalShippingCost());
    }
}


