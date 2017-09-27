import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.security.provider.SHA;

import static org.junit.Assert.*;

public class SharpieTest {
    Sharpie testObject = new Sharpie("Blue", 25);
    float expectedOutput = 100f;
    float expectedOutput2 = 90f;


    @Test
    public void getContenttest1() throws Exception {
        Assert.assertEquals(expectedOutput, testObject.getContent(),0.0002);
    }

    @Test
    public void use() throws Exception {
        Assert.assertEquals(expectedOutput2, testObject.use(10), 0.0002 );
    }
}