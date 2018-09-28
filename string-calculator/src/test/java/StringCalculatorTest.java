import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void testSumOfEmptyStringIsZero(){
        int result = Add("");
        Assert.assertEquals("Sum of null string should be zero", 0, result);
    }

    @Test
    public void testSumOfSingleNumberIsTheNumberItself(){
        int result = Add("5");
        Assert.assertEquals("Sum of a number should be number itself", 5, result);
    }

    @Test
    public void canSumTwoNumbers(){
        int result = Add("4,5");
        Assert.assertEquals("Sum of 4,5 is 9", 9, result);
    }

    private int Add(String numbers){
        if (numbers.isEmpty())
            return 0;
        else if(numbers.length() == 1)
            return Integer.parseInt(numbers);
        else{
            int sum = 0;
            String [] toAdd = numbers.split(",");
            for (String number:
                 toAdd) {
                sum += Integer.parseInt(number);
            }
            return sum;
        }

    }
}
