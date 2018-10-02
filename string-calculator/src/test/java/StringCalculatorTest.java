import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void testSumOfEmptyStringIsZero() {
        int result = Add("");
        assertEquals("Sum of null string should be zero", 0, result);
    }

    @Test
    public void testSumOfSingleNumberIsTheNumberItself() {
        int result = Add("5");
        assertEquals("Sum of a number should be number itself", 5, result);
    }

    @Test
    public void canSumTwoNumbers() {
        int result = Add("4,5");
        assertEquals("Sum of 4,5 is 9", 9, result);
    }

    @Test
    public void canSumAnyNumbers() {
        int result = Add("1,2,3,4,5");
        assertEquals("Sum of 1,2,3,4,5 is 15", 15, result);
    }

    @Test
    public void canProcessNewLineDelimeter() {
        String [] expected = { "1", "2", "3" };
        String [] actual = getInputArray("1\n2,3");
        assertArrayEquals("Can process new line as delimeter", expected, actual);
    }

    private int Add(String numbers) {
        if (!numbers.isEmpty()) {
            List<Integer> integerList = Arrays.stream(getInputArray(numbers)).map(Integer::decode).collect(Collectors.toList());
            return integerList.stream().mapToInt(Integer::intValue).sum();
        } else return 0;
    }

    private String [] getInputArray(String numbers) {
        String [] halfBakedInput = numbers.split("\n");
        ArrayList<String> result = new ArrayList<String>();
        for (String element: halfBakedInput
             ) {
            String [] units = element.split(",");
            for (String unit:
                 units ) {
                result.add(unit);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
