package Bitwise;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBinaryAddition {
    private BinaryAddition binaryAddition;

    @Before
    public void init() {
        binaryAddition = new BinaryAddition();
    }

    @Test
    public void testAdditionSuccess() {
        String result = binaryAddition.addBinary("100", "11");
        Assert.assertEquals(result, "111");
    }

    @Test
    public void testAdditionNegative() {
        String result = binaryAddition.addBinary("11111111111111111111111111111111",
                "10000000000000000000000000000000");
        Assert.assertNotEquals("101111111111111111111111111111110", result);
    }
}