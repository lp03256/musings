import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void testSumOfEmptyStringIsZero(){
        int result = Add("");
        Assert.assertEquals("Sum of null string should be zero", 0, result);
    }

    /*
     * False Positive
     */
    @Test
    public void testSumOfSingleNuberIsTheNumberItself(){
        int result = Add("0");
        Assert.assertEquals("Sum of a number should be number itself", 0, result);
    }

    private int Add(String numbers){
        return 0;
    }
}
