using System;

namespace StringCalculator
{
    public class Addition
    {
        public int Add(String numbers)
        {
            if (String.IsNullOrEmpty(numbers))
                return 0;
            else
                return Int32.Parse(numbers);
        }
    }
}
