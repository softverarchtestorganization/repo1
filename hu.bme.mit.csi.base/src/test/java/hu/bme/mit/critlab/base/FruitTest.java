package hu.bme.mit.critlab.base;

import org.junit.Test;

import java.util.concurrent.ExecutionException;

public class FruitTest extends TestBase {

    @Test
    public void fruitTest() throws ExecutionException {
        doSimpleTest(9.0 / 11.0,
                "Banana",
                "Ananas",
                2, false);

        doSimpleTest(9.0 / 11.0,
                "Banana",
                "Ananas",
                2, false);
    }

}
