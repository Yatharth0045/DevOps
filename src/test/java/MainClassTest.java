import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainClassTest {

    @Test
    public void printHello() {
        Assert.assertEquals("HelloWorld",MainClass.print());
    }
}