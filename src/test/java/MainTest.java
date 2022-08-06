
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest{

    @Test
    public void testFirst(){
        int[] ages = new int[5];
        ages[0] = 18;
        ages[1] = 12;
        ages[2] = 25;
        ages[3] = 5;
        ages[4] = 38;
        int expectedResult = 3;
        int result = Main.getsuccessfulAgesCount(ages);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testSecond(){
        int[] ages = new int [5];
        ages[0] = 15;
        ages[2] = 17;

        int result = Main.getsuccessfulAgesCount(ages);
        Assert.assertEquals(0, result);
    }

}