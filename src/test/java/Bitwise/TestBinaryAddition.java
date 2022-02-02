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
}