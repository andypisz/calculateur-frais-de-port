package main;


public class ShippingCostsCalculator {


    // Retourne les frais de port du package en fonction de la destination
    public static double calculateShippingCost(Package pack, Destination destination){
        double frais = -1;
        switch (destination){
            case FR:
                frais = pack.calculateLocalShippingCost();
                break;
            case MC:
                frais = pack.calculateMonacoShippingCost();
                break;
            default:
                System.out.println("Pas de calcul de frais de port disponible pour cette destination :/");
                break;
        }
        return frais;
    }


}