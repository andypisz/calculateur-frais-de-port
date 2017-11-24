package test;

import main.Destination;
import main.Package;
import main.PackageFactory;
import main.ShippingCostsCalculator;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Test {

    private final Package pack;
    private final Destination destination;
    private final double expectedPrice;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 191, 123, 18,  2.354d, Destination.FR, "12.00" },

                { 253, 215, 164, 1.565d, Destination.FR, "30.39" },

                { 653, 133, 271, 2.132d, Destination.FR, "46.09" },

                { 653, 331, 271, 3.650d, Destination.FR, "83.76" },

                { 191, 123, 18,  2.354d, Destination.MC, "13.04" },

                { 253, 215, 164, 1.565d, Destination.MC, "33.03" },

                { 653, 133, 271, 2.132d, Destination.MC, "50.10" },

                { 653, 331, 271, 3.650d, Destination.MC, "91.05" }
        });
    }

    private int fInput;

    private int fExpected;

    public Test(int height, int width, int depth, double weight, Destination destination, String expectedPrice) {
        this.pack = PackageFactory.createPackage(height, width, depth, weight);
        this.destination = destination;
        this.expectedPrice = Double.parseDouble(expectedPrice);
    }

    @org.junit.Test
    public void test() {
        assertEquals(this.expectedPrice, ShippingCostsCalculator.calculateShippingCost(this.pack,this.destination),0.01);
    }
}

