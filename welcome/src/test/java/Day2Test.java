import hacckerrank.day30.Day2;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Day2Test {
    private double mealCost;
    private int tipPercent;
    private int taxPercent;
    private int expectedTotalCost;

    public Day2Test(double mealCost, int tipPercent, int taxPercent, int expectedTotalCost) {
        this.mealCost = mealCost;
        this.tipPercent = tipPercent;
        this.taxPercent = taxPercent;
        this.expectedTotalCost = expectedTotalCost;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {12.0, 20, 8, 15},
                {20.0, 20, 10, 26},
                {15.50, 15, 10, 19}
        });
    }

    @org.junit.Test
    public void solve() {
        assertEquals(expectedTotalCost, Day2.solve(mealCost, tipPercent, taxPercent));
    }
}