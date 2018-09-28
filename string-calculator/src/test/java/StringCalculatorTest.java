import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void testSumOfEmptyStringIsZero(){
        int result = Add("");
        Assert.assertEquals("Sum of null string should be zero", 0, result);
    }

    @Test
    public void testSumOfSingleNuberIsTheNumberItself(){
        int result = Add("5");
        Assert.assertEquals("Sum of a number should be number itself", 5, result);
    }
    
    private int Add(String numbers){
        if (numbers.isEmpty())
            return 0;
        else if(numbers.length() == 1)
            return Integer.parseInt(numbers);
        else
            return -1;
    }
}
