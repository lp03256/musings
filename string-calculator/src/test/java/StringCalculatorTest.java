import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void testAddTwoNumbers(){

        int result = Add("");
        Assert.assertEquals("Sum of null string should be zero", 0, result);

    }

    private int Add(String numbers){
        return 0;
    }
}
