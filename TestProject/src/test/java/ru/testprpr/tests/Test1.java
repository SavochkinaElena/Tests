package ru.testprpr.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.testpr.pr.tests.Square;

public class Test1 {

    @Test
    public void TestArea() {
        Square square = new Square(5);
        square.area();
        Assert.assertEquals(square.area(), 25.0);
    }

}
