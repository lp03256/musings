import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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
    public void canSumAnyNumbers(){
        int result = Add("1,2,3,4,5");
        assertEquals("Sum of 1,2,3,4,5 is 15", 15, result);
    }

    private int Add(String numbers){
        
        if (!numbers.isEmpty()) {
            List<Integer> integerList = Arrays.stream(numbers.split(",")).map(Integer::decode).collect(Collectors.toList());
            return integerList.stream().mapToInt(Integer::intValue).sum();
        }else return 0;

    }
}
