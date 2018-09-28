import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void testSumOfEmptyStringIsZero(){
        int result = Add("");
        assertEquals("Sum of null string should be zero", 0, result);
    }

    @Test
    public void testSumOfSingleNumberIsTheNumberItself(){
        int result = Add("5");
        assertEquals("Sum of a number should be number itself", 5, result);
    }

    @Test
    public void canSumTwoNumbers(){
        int result = Add("4,5");
        assertEquals("Sum of 4,5 is 9", 9, result);
    }

    @Test
    public void canSumThreeNumbers(){
        int result = Add("1,2,3,4,5");
        assertEquals("Sum of 1,2,3,4,5 is 15", 15, result);
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
