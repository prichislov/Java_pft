package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by Roman on 14.06.2017.
 */
public class SquareTest {

    @Test
    public void testArea() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25);
    }

}
