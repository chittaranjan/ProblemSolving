package Recursion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestTowerOfHanoi {
    private TowerOfHanoi towerOfHanoi;

    @Before
    public void init() {
        towerOfHanoi = new TowerOfHanoi();
    }

    @Test
    public void testSuccess() {
        List<String> result = Arrays.asList(
                "A-C",
                "A-B",
                "C-B",
                "A-C",
                "B-A",
                "B-C",
                "A-C"
        );
        Assert.assertEquals(result, towerOfHanoi.towerOfHanoi(3, 'A', 'C', 'B'));
    }
}
