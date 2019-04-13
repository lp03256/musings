import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    public void testSumOfEmptyStringReturnsZero(){
        assertEquals("Sum of empty string is zero", 0, add(""));
    }

    private int add(String numbers){
        return 0;
    }
}